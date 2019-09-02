/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import InternalFrame.iFcliente;
import Modelo.*;
import Modelo.Tienda;
import Servicios.*;
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
public class ControllerCliente {

    //Creación de vista y model Cliente  
    iFcliente vista;
    ClienteDAO modelo;
    ArrayList<Cliente> ListaCliente;
    ArrayList<Tienda> listaTiendas;

    public ControllerCliente(iFcliente vista, ClienteDAO modelo) {

        this.vista = vista;
        this.modelo = modelo;
        
        TiendaDAO modeltienda = new TiendaDAO();

        this.vista.cargarClientesTabla(ListaCliente = modelo.listadoCliente());
        
        this.vista.cargarTiendasCombo(listaTiendas = modeltienda.listadoTiendas());
        
        //Escuchas de los componentes
        ListenerCliente escuchador = new ListenerCliente();
        this.vista.addListenerTabla(escuchador);
        this.vista.addListenerBtnNuevo(escuchador);

    }

    public class ListenerCliente implements ActionListener, MouseListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == vista.getjBnuevo()) {
                JOptionPane.showMessageDialog(null, "Prueba");
                registrar();
            } else if (ae.getSource() == vista.getjBmodificar()) {
                //actualizar();
            }
        }

        public void registrar() {

            if (vista.getjTClienteID().equals("")) {
                vista.gestionMensajes("Ingrese el código",
                        "Error de Entrada", JOptionPane.ERROR_MESSAGE);
                /*else if (vista.getNivel().trim().
                           equals("Seleccionar ...")){
                   vista.gestionMensajes("Seleccione un nivel",
                           "Error de Entrada", JOptionPane.ERROR_MESSAGE );  */
            } else {
                Cliente cliente = new Cliente();
                cliente.setClienteID(601);//revisar el ingreso null
                //System.out.println("id Cliente "+vista.getjTClienteID().getText());

            cliente.setTiendaIDCliente(1);
            //System.out.println("id Tienda" +vista.getjTiendaID().getText());
            
            cliente.setNombreCliente(vista.getjTnombreCliente().getText());
            //System.out.println("nombre cliente "+vista.getjTnombreCliente().getText());
            
            cliente.setApellidoCliente(vista.getjTApellidos().getText());
            //System.out.println("apellido "+vista.getjTApellidos().getText());
            
            cliente.setCorreoCliente(vista.getjTCorreoCliente().getText());
            //System.out.println("correo "+vista.getjTCorreoCliente().getText());
            
            cliente.setDireccionCliente(Integer.parseInt(vista.getjTDireccion().getText()));
            //System.out.println("dir "+vista.getjTDireccion().getText());
            
            cliente.setCuenta_activo(true);
            cliente.setFechaCreacion(Fecha.crearFechaDate());
            
            cliente.setUltimaActualizacionCliente(Fecha.crearFechaTimeStamp());
            //System.out.println("fecha "+Fecha.crearFechaTimeStamp());
            
            cliente.setActivo(1);
            //System.out.println("Activo "+vista.getjTActivoInt().getText());
            
///dd
                //if (tamaño == 0) {
                int resultado = 0;
                //int resultado2 = 0;
                resultado = modelo.grabarCliente(cliente);

                if (resultado == 1) {
                    vista.gestionMensajes("Registro Grabado con éxito",
                            "Confirmación", JOptionPane.INFORMATION_MESSAGE);

                    ArrayList<Cliente> listaClientes;
                    listaClientes = modelo.listadoCliente();
                    vista.cargarClientesTabla(listaClientes);

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

        public void Actualizar() {

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
                
                int indiceTabla = vista.getjTableCliente().getSelectedRow();
                vista.getjTClienteID().setText("" + ListaCliente.get(indiceTabla).getClienteID());
                vista.getjTnombreCliente().setText(""+ListaCliente.get(indiceTabla).getNombreCliente());
                vista.getjTCorreoCliente().setText(""+ListaCliente.get(indiceTabla).getCorreoCliente());
                vista.getjTDireccion().setText(""+ListaCliente.get(indiceTabla).getDireccionCliente());
                vista.getjTApellidos().setText(""+ListaCliente.get(indiceTabla).getApellidoCliente());
                vista.getjTFechaCreacion().setText(""+ListaCliente.get(indiceTabla).getFechaCreacion());
                vista.getjTCuentaActivoBool().setText(""+ListaCliente.get(indiceTabla).getCuentActivoBool());
                vista.getjTActivoInt().setText(""+ListaCliente.get(indiceTabla).getActivo());
                
                
                
                

            }
        }

        @Override
        public void mousePressed(MouseEvent me) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        

        @Override
        public void mouseExited(MouseEvent me) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

}
