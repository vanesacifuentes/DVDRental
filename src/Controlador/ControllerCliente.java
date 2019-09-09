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
    //ArrayList<Cliente> ListaCliente;
    ArrayList<Tienda> listaTiendas;

    public ControllerCliente(iFcliente vista, ClienteDAO modelo) {

        this.vista = vista;
        this.modelo = modelo;
        
        TiendaDAO modeltienda = new TiendaDAO();

        this.vista.cargarClientesTabla(modelo.listadoCliente());
        this.vista.cargarActivoIntCombo(modelo.listadoCliente());
        
        this.vista.cargarTiendasCombo(listaTiendas = modeltienda.listadoTiendas());
       
        
        //Escuchas de los componentes
        ListenerCliente escuchador = new ListenerCliente();
        
        this.vista.addListenerBtnNuevo(escuchador);
        this.vista.addListenerBtnModificar(escuchador);
        this.vista.addListenerBtnEliminar(escuchador);
        this.vista.addMouseListenerTabla(escuchador);
            
    }

    public class ListenerCliente implements ActionListener, MouseListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == vista.getjBnuevo()) {
                JOptionPane.showMessageDialog(null, "Prueba");
                registrar();
            } else if (ae.getSource() == vista.getjBmodificar()) {
                JOptionPane.showMessageDialog(null, "Prueba");
                actualizar();
            }else if (ae.getSource() == vista.getjBeliminar()) {
                JOptionPane.showMessageDialog(null, "Prueba");
                borrar();   
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

        public void actualizar() {
            
            Cliente cliente = new Cliente();
             
            //Se configura los datos en el objeto cliente de la clase
            //Cliente
            //cliente.setClienteID(Integer.parseInt(vista.getjTClienteID().toString()));
            cliente.setNombreCliente(vista.getjTnombreCliente().toString());
            cliente.setApellidoCliente(vista.getjTApellidos().toString());
            cliente.setDireccionCliente(Integer.parseInt(vista.getjTDireccion().toString()));
            cliente.setCorreoCliente(vista.getjTCorreoCliente().toString()); 
            //cliente.setTiendaIDCliente(Integer.parseInt(vista.getjComboBoxTienda().toString()));
            //cliente.setActivo(Integer.parseInt(vista.getjCActivoInt().toString()));
            
                
                         
            if(modelo.modificarCliente(cliente) == 1){
                vista.gestionMensajes(
                        "Actualización exitosa",
                        "Confirmación ", 
                        JOptionPane.INFORMATION_MESSAGE);
                                        
//                vista.activarControles(false); 
//                vista.nuevoAction();
                ArrayList<Cliente> listadoiClientes; 
                listadoiClientes = modelo.listadoCliente();
                vista.cargarClientesTabla(listadoiClientes);           
            } else {
                vista.gestionMensajes(
                        "Actualización Falida jajaja",
                        "Confirmación ", 
                        JOptionPane.ERROR_MESSAGE);                 
            }  
        }
        
            private void borrar(){
            int codigo =0;
            codigo  = Integer.parseInt(vista.getjTClienteID().getText());
            
            if(codigo==0){
                 vista.gestionMensajes(
                         "Por favor seleccione un Cliente de la tabla",
                         "Mensaje de Advertencia ", 
                    JOptionPane.ERROR_MESSAGE);
            }else{
                int respuesta = JOptionPane.showConfirmDialog(null,
                        "¿Desea Eliminar el cliente: " + vista.getjTableCliente().getValueAt(
                    vista.getjTableCliente().getSelectedRow(), 1),
                        
                        "Confirmación de Acción", JOptionPane.YES_NO_OPTION);
                
                if(respuesta == JOptionPane.YES_OPTION){                    

                    if(modelo.borrarCliente(codigo) ==  1){
                        JOptionPane.showMessageDialog(null, 
                                "Registro Borrado con éxtio", 
                                "Confirmación de acción", 
                                JOptionPane.INFORMATION_MESSAGE);                    
                       
                        ArrayList<Cliente> listadoCliente; 
                        listadoCliente = modelo.listadoCliente();
                        vista.cargarClientesTabla(listadoCliente);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, 
                                "Error al borrar",
                                "Confirmación de acción", 
                                JOptionPane.ERROR_MESSAGE);                    
                    }
                }
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
                
                int indiceTabla = vista.getjTableCliente().getSelectedRow();
                ArrayList<Cliente> ListaClientes = modelo.listadoCliente();
                vista.getjTClienteID().setText("" + ListaClientes.get(indiceTabla).getClienteID());
                vista.getjTnombreCliente().setText(""+ListaClientes.get(indiceTabla).getNombreCliente());
                vista.getjTCorreoCliente().setText(""+ListaClientes.get(indiceTabla).getCorreoCliente());
                vista.getjTDireccion().setText(""+ListaClientes.get(indiceTabla).getDireccionCliente());
                vista.getjTApellidos().setText(""+ListaClientes.get(indiceTabla).getApellidoCliente());
                vista.getjTFechaCreacion().setText(""+ListaClientes.get(indiceTabla).getFechaCreacion());
                //vista.getjCActivoInt().setsSelectedItem(""+ListaCliente.get(indiceTabla).getActivo());
                //vista.getjCActivoInt().setText(""+ListaCliente.get(indiceTabla).getActivo());
                //vista.getjComboBoxTienda().setSelectedIndex(indiceTabla);
 

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
