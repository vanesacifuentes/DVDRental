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
        this.vista.cargarActivoIntCombo(ListaCliente = modelo.listadoCliente());
        
        this.vista.cargarTiendasCombo(listaTiendas = modeltienda.listadoTiendas());
       
        
        //Escuchas de los componentes
        ListenerCliente escuchador = new ListenerCliente();
        
        this.vista.addListenerBtnNuevo(escuchador);
        this.vista.addMouseListenerTabla(escuchador);
            
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
                
            cliente.setClienteID(Integer.parseInt(vista.getjTClienteID().getText()));

            cliente.setTiendaIDCliente(vista.getjComboBoxTienda().getSelectedIndex()+1);
            
            cliente.setNombreCliente(vista.getjTnombreCliente().getText());
            
            cliente.setApellidoCliente(vista.getjTApellidos().getText());
            
            cliente.setCorreoCliente(vista.getjTCorreoCliente().getText());
            
            cliente.setDireccionCliente(Integer.parseInt(vista.getjTDireccion().getText()));
            
            cliente.setCuenta_activo(true);
            
            cliente.setFechaCreacion(Fecha.crearFechaDate());
            
            cliente.setUltimaActualizacionCliente(Fecha.crearFechaTimeStamp());
            
            cliente.setActivo(1);
           
            
///dd
                //if (tamaño == 0) {
                int resultado = 0;
                //int resultado2 = 0;
                resultado = modelo.grabarCliente(cliente);

                if (resultado == 1) {
                    vista.gestionMensajes("Registro Grabado con éxito",
                            "Confirmación", JOptionPane.INFORMATION_MESSAGE);

                    //Se carga 
//                    ArrayList<Cliente> listaClientes;
//                    listaClientes = modelo.listadoCliente();
//                    vista.cargarClientesTabla(ListaCliente = listaClientes);

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
                //vista.getjCActivoInt().setsSelectedItem(""+ListaCliente.get(indiceTabla).getActivo());
                //vista.getjCActivoInt().setText(""+ListaCliente.get(indiceTabla).getActivo());
                
 

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
