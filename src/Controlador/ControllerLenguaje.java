/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import JFrame.jFlenguaje;
import Modelo.*;
import Servicios.Fecha;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.MouseListener;

/**
 *
 * @author vanes
 */
public class ControllerLenguaje {
    
    jFlenguaje vista;
    LenguajeDAO modelo;
    
    public ControllerLenguaje(jFlenguaje vista, LenguajeDAO modelo) {

        this.vista = vista;
        this.modelo = modelo;
       
        ListenerLenguaje escuchador = new ListenerLenguaje();
        this.vista.getjBnuevo().addActionListener(escuchador);  
        this.vista.cargarLenguajesTabla(this.modelo.listadoLenguajes());
        this.vista.addMouseListenerTabla(escuchador);
        this.vista.getjBeliminar().addActionListener(escuchador);   
        
    }
    

    
    public class ListenerLenguaje implements ActionListener, MouseListener {

        
            @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == vista.getjBnuevo()) {
                JOptionPane.showMessageDialog(null, "Prueba");
                
                    if (vista.getjBnuevo().getText().equalsIgnoreCase("Nuevo")) {
                    vista.activarCampos(true);
                    vista.setearCampos();
                    vista.getjBnuevo().setText("Grabar");
                    vista.getjBmodificar().setText("Cancelar");
                    vista.getjBeliminar().setVisible(false);
                    
                } else if (vista.getjBnuevo().getText().equalsIgnoreCase("Grabar")) {
                    registrar();
                    vista.activarCampos(false);
                    vista.getjBnuevo().setText("Nuevo");
                    vista.getjBmodificar().setText("Modificar");
                    vista.getjBeliminar().setEnabled(true);
            
                }else if (vista.getjBnuevo().getText().equalsIgnoreCase("Actualizar")){
                    actualizar();
                }        
                                          
            } else if (ae.getSource() == vista.getjBmodificar()) 
            {
                 if (vista.getjBmodificar().getText().equalsIgnoreCase("Modificar")) {
                    vista.activarCampos(true);
                    vista.getjBnuevo().setText("Actualizar");
                    vista.getjBmodificar().setText("Cancelar");
                    vista.getjBeliminar().setVisible(false);
                }else if (vista.getjBmodificar().getText().equalsIgnoreCase("Cancelar")){
                    
                    vista.activarCampos(false);
                    vista.setearCampos();
                    vista.getjBnuevo().setText("Nuevo");
                    vista.getjBmodificar().setText("Modificar");
                    vista.getjBeliminar().setVisible(true);    
                }  
            }else if (ae.getSource() == vista.getjBeliminar()) {
                borrar();
            }
        }
        

        public void registrar() {

        if (vista.getjTLenguajeID().equals("")) {
            vista.gestionMensajes("Ingrese el código",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);
            /*else if (vista.getNivel().trim().
                           equals("Seleccionar ...")){
                   vista.gestionMensajes("Seleccione un nivel",
                           "Error de Entrada", JOptionPane.ERROR_MESSAGE );  */
        } else {
            Lenguaje lenguaje = new Lenguaje();
            
            lenguaje.setLenguageID(Integer.parseInt(vista.getjTLenguajeID().getText()));
            lenguaje.setNombreLenguaje(vista.getjTnombreLenguaje().getText());           
            lenguaje.setUltimaActualizacion(Fecha.crearFechaTimeStamp());
            
            System.out.println("fecha "+Fecha.crearFechaTimeStamp());   
  
            int tamaño = 0;
            tamaño = modelo.listadoLenguajes().size();

            //if (tamaño == 0) {
                int resultado = 0;
                //int resultado2 = 0;
                resultado = modelo.grabarLenguaje(lenguaje);
                
                if (resultado == 1) {
                    vista.gestionMensajes("Registro Grabado con éxito",
                            "Confirmación", JOptionPane.INFORMATION_MESSAGE);

                    ArrayList <Lenguaje> listaLenguajes;
                    listaLenguajes = modelo.listadoLenguajes();
                    //vista.cargarClientesTabla(listaClientes);

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
            
            Lenguaje lenguaje= new Lenguaje();
             
            //Se configura los datos en el objeto cliente de la clase Lenguaje
           
            lenguaje.setLenguageID(Integer.parseInt(vista.getjTLenguajeID().toString()));
            lenguaje.setNombreLenguaje(vista.getjTnombreLenguaje().toString());
            lenguaje.setUltimaActualizacion(Fecha.crearFechaTimeStamp());
                     
            if(modelo.modificarLenguaje(lenguaje) == 1){
                vista.gestionMensajes(
                        "Actualización exitosa",
                        "Confirmación ", 
                        JOptionPane.INFORMATION_MESSAGE);
                                        
//                vista.activarControles(false); 
//                vista.nuevoAction();
                ArrayList<Lenguaje> listadoLenguajes; 
                listadoLenguajes = modelo.listadoLenguajes();
                vista.cargarLenguajesTabla(listadoLenguajes);           
            } else {
                vista.gestionMensajes(
                        "Actualización Falida jajaja",
                        "Confirmación ", 
                        JOptionPane.ERROR_MESSAGE);                 
            }  
            


        }
        
        
    private void borrar(){
            int codigo =0;
            codigo  = Integer.parseInt(vista.getjTLenguajeID().getText());
            
            if(codigo==0){
                 vista.gestionMensajes(
                         "Por favor seleccione un Lenguaje de la tabla",
                         "Mensaje de Advertencia ", 
                    JOptionPane.ERROR_MESSAGE);
            }else{
                int respuesta = JOptionPane.showConfirmDialog(null,
                        "¿Desea Eliminar el lenguaje: " + vista.getjTableLenguaje().getValueAt(
                    vista.getjTableLenguaje().getSelectedRow(), 1),
                        
                        "Confirmación de Acción", JOptionPane.YES_NO_OPTION);
                
                if(respuesta == JOptionPane.YES_OPTION){                    

                    if(modelo.borrarLenguaje(codigo) ==  1){
                        JOptionPane.showMessageDialog(null, 
                                "Registro Borrado con éxtio", 
                                "Confirmación de acción", 
                                JOptionPane.INFORMATION_MESSAGE);                    
                       
                        ArrayList<Lenguaje> listadoLenguaje; 
                        listadoLenguaje = modelo.listadoLenguajes();
                        vista.cargarLenguajesTabla(listadoLenguaje);
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
            if (vista.getjTableLenguaje().getSelectedRow() == -1) {
                if (vista.getjTableLenguaje().getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "No hay registros");
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione una fila");
                }
            } else {
                
                int indiceTabla = vista.getjTableLenguaje().getSelectedRow();
                ArrayList<Lenguaje> ListaLenguajes = modelo.listadoLenguajes();
                vista.getjTLenguajeID().setText("" + ListaLenguajes.get(indiceTabla).getLenguageID());
                vista.getjTnombreLenguaje().setText("" + ListaLenguajes.get(indiceTabla).getNombreLenguaje());  
                vista.getjLFechaActu().setText("" + ListaLenguajes.get(indiceTabla).getUltimaActualizacion());
        }
 
    }  

        @Override
        public void mousePressed(MouseEvent me) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent me) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent me) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
        
        
    }
}
    
    

    
    
    

