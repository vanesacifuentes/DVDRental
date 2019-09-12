/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import InternalFrame.iFempleado;
import Modelo.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ControllerEmpleado {
    
    
    EmpleadoDAO modelo;
    iFempleado vista;
    private ArrayList<Tienda> listaTienda;
    private ArrayList<Empleado> listaEmpleado;

    public ControllerEmpleado(iFempleado vista,EmpleadoDAO modelo){
        this.modelo = modelo;
        this.vista = vista;
        
        TiendaDAO modelTienda = new TiendaDAO();
        
        this.vista.cargarTiendasCombo(listaTienda = modelTienda.listadoTiendas());
        this.vista.cargarEmpleadosTabla(listaEmpleado = this.modelo.listadoEmpleado());
        
        //Escucha de los Componentes manejador en el controlador
        EmpleadoListener escucha = new EmpleadoListener();
        this.vista.AddListenerTabla(escucha);
        this.vista.AddListenerJBNuevo(escucha);
        this.vista.AddListenerJBModificar(escucha);
        this.vista.AddListenerJBEliminar(escucha);
    }
    
    
    public class EmpleadoListener implements ActionListener, MouseListener{

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == vista.getjBnuevo()) {
                JOptionPane.showMessageDialog(null, "Crear nuevo empleado");
                registrar();
            } else if (ae.getSource() == vista.getjBmodificar()) {
                JOptionPane.showMessageDialog(null, "Modificar un empleado");
                //actualizar();
            } else if (ae.getSource() == vista.getjBeliminar()) {
                JOptionPane.showMessageDialog(null, "Eliminar un empleado");
            }
        }

        @Override
        public void mouseClicked(MouseEvent me) {
            if (vista.getjTableCliente().getSelectedRow() == -1) {
                if (vista.getjTableCliente().getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "No hay registros");
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione una fila");
                }
            } else {
                //Imprime en los campos de la interfaz los valores correspondientes al empleado de la fila seleccionado en la tabla
                int indiceTabla = vista.getjTableCliente().getSelectedRow();
                vista.getjTEmpleadoID().setText("" + listaEmpleado.get(indiceTabla).getEmpleadoID());
                vista.getjTnombreEmpleado().setText(""+listaEmpleado.get(indiceTabla).getNombreEmpleado());
                vista.getjTApellidosEmpleado().setText(""+listaEmpleado.get(indiceTabla).getApellidoEmpleado());
                vista.getjTCorreoEmpleado().setText(""+listaEmpleado.get(indiceTabla).getCorreoEmpleado());
                vista.getjPassContrasena().setText(""+listaEmpleado.get(indiceTabla).getContrasenaEmpleado());
                vista.getjTNombreUsuario().setText(""+listaEmpleado.get(indiceTabla).getNombreUsuarioEmpleado());
                vista.getjLUltimaActualizacion().setText(""+listaEmpleado.get(indiceTabla).getUltima_Actualizacion_Empleado());
                vista.getjTDireccion().setText(""+listaEmpleado.get(indiceTabla).getEmpleadoID());
                vista.getjCBTiendaID().setSelectedItem("Sede no. "+listaEmpleado.get(indiceTabla).getEmpleadoID());
                //vista.getjCActivoInt().setText(""+ListaCliente.get(indiceTabla).getActivo());
            }
            
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }

    }
    
    
//    public Direccion retornaDirecion(int id_direccion)
//    {//retorna una direccion de acuerdo a su ID
//        
//        for(int a =0;a < listaDireccion.size();a++)
//        {
//            
//        }
//    }
    
    
    public void registrar(){
                if (vista.getjTEmpleadoID().equals("")) {
            vista.gestionMensajes("Ingrese el código",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);
            /*else if (vista.getNivel().trim().
                           equals("Seleccionar ...")){
                   vista.gestionMensajes("Seleccione un nivel",
                           "Error de Entrada", JOptionPane.ERROR_MESSAGE );  */
        } else {
            Empleado empleado = new Empleado();
            int x = Integer.parseInt(vista.getjTEmpleadoID().getText());
            empleado.setEmpleadoID(x);
            empleado.setNombreEmpleado(vista.getjTnombreEmpleado().getText());
            empleado.setApellidoEmpleado(vista.getjTApellidosEmpleado().getText());
            empleado.setDireccionID_Empleado(Integer.parseInt(vista.getjTDireccion().getText()));
            empleado.setCorreoEmpleado(vista.getjTCorreoEmpleado().getText());
            empleado.setTiendaID_Empleado(vista.getjCBTiendaID().getSelectedIndex());
            //empleado.setActivo(vista.getjTCuentaActivo1().get());
            empleado.setNombreUsuarioEmpleado(vista.getjTNombreUsuario().getText());
            empleado.setContrasenaEmpleado(vista.getjPassContrasena().getName());
            Timestamp ts = new Timestamp(System.currentTimeMillis());
            empleado.setUltima_Actualizacion_Empleado(ts);
            //empleado-imagen

            

            //if (tamaño == 0) {
                int resultado = 0;
                //int resultado2 = 0;
                resultado = modelo.grabarEmpleado(empleado);
                //modelo.grabarPeliculaCategoria(categoriaID, empleado.getPeliculaId());
                //modelo.grabarPeliculaActor(actorID, empleado.getPeliculaId());
                if (resultado == 1) {
                    vista.gestionMensajes("Registro Grabado con éxito",
                            "Confirmación", JOptionPane.INFORMATION_MESSAGE);

                    ArrayList<Empleado> listaEmpleados;
                    listaEmpleados = modelo.listadoEmpleado();
                   this.vista.cargarEmpleadosTabla(listaEmpleados);

                    //vista.activarControles(false); 
                    //vista.nuevoAction();
                } else {
                    vista.gestionMensajes("Error al grabar",
                            "Confirmación", JOptionPane.ERROR_MESSAGE);
                }
            }
    }
    
    public void actualizar()
    {
        
    }
    
    
    
    
    
    
}
