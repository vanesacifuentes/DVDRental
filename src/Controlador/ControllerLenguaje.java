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
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
       
        this.vista.getjBnuevo().addActionListener(new ListenerLenguaje());

    }
    

    
    public class ListenerLenguaje implements ActionListener {

        
            @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == vista.getjBnuevo()) {
                JOptionPane.showMessageDialog(null, "Prueba");
                registrar();
            } else if (ae.getSource() == vista.getjBModificar()) {
                //actualizar();
            }
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
    
        
        
 }    
    
    

    
    
    

