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

    public ControllerEmpleado(iFempleado vista,EmpleadoDAO modelo){
        this.modelo = modelo;
        this.vista = vista;
        
        TiendaDAO modelTienda = new TiendaDAO();
        
        this.vista.cargarTiendasCombo(listaTienda = modelTienda.listadoTiendas());
        
        
    }
    
    
    public class PeliculaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == vista.getjBnuevo()) {
                JOptionPane.showMessageDialog(null, "Prueba");
                registrar();
            } else if (ae.getSource() == vista.getjBmodificar()) {
                actualizar();
            }
        }

    }
    
    
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
            empleado.setEmpleadoID(2000);//revisar el ingreso null
            empleado.setNombreEmpleado(vista.getjTnombreEmpleado().getText());
            empleado.setApellidoEmpleado(vista.getjTApellidosEmpleado().getText());
            empleado.setDireccionID_Empleado(Integer.parseInt(vista.getjTDireccion().getText()));
            empleado.setCorreoEmpleado(vista.getjTCorreoEmpleado().getText());
            empleado.setTiendaID_Empleado(vista.getjCBTiendaID().getSelectedIndex());
            //empleado.setActivo(vista.getjTCuentaActivo1().get());
            empleado.setNombreUsuarioEmpleado(vista.getjTNombreUsuario().getText());
            empleado.setContrasenaEmpleado(vista.getjPassContrasena().getName());
            //empleado.setUltimaActualizacion(Fecha.crearFecha());
            //empleado-imagen

            int tamaño = 0;
            tamaño = modelo.listadoEmpleado(tamaño).size();

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
                    listaEmpleados = modelo.listadoEmpleado(tamaño);
                   vista.cargarEmpleadosTabla(listaEmpleados);

                    //vista.activarControles(false); 
                    //vista.nuevoAction();
                } else {
                    vista.gestionMensajes("Error al grabar",
                            "Confirmación", JOptionPane.ERROR_MESSAGE);
                }
            //} else {
                vista.gestionMensajes("Codigo ya está registrado",
                        "Confirmación",
                        JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void actualizar()
    {
        
    }
    
    
    
    
    
    
}
