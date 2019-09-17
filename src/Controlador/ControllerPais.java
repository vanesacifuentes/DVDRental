/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import JFrame.jFpais;
import Modelo.Pais;
import Modelo.PaisDAO;
import Servicios.Fecha;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author vanes
 */
public class ControllerPais {
    
    jFpais vista;
    PaisDAO modelo;
    
    public ControllerPais(jFpais vista, PaisDAO modelo) {

        this.vista = vista;
        this.modelo = modelo;

        ListenerPais listen = new ListenerPais();
      //  this.vista.getjBnuevo().addActionListener(listen);
        //this.vista.getjBModificar().addActionListener(listen);
       // this.vista.getEliminar().addActionListener(listen);
        
    }
    
    
    
    
    
    
      public class ListenerPais implements ActionListener {

        
            @Override
        public void actionPerformed(ActionEvent ae) {

//            if (ae.getSource() == vista.getjBnuevo()) {
//                JOptionPane.showMessageDialog(null, "Prueba");
//               registrar();
//            } else if (ae.getSource() == vista.getjBModificar()) {
               modificarPais();
         /*   } else if (ae.getSource() == vista.getEliminar()){
                
            }*/
           }
        }
        
        public void registrar() {

        /*if (vista.getPais_Id().equals("")) {
            vista.gestionMensajes("Ingrese el código",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);
            /*else if (vista.getNivel().trim().
                           equals("Seleccionar ...")){
                   vista.gestionMensajes("Seleccione un nivel",
                           "Error de Entrada", JOptionPane.ERROR_MESSAGE );  
        } else { */
        
                
            Pais pais_ = new Pais();
            
//            pais_.setPais_id(vista.getPais_Id());
//            pais_.setPais(vista.getPais());           
            pais_.setUltimaActualizacion(Fecha.crearFechaTimeStamp());
            
           /* System.out.println("fecha "+Fecha.crearFechaTimeStamp());  */
            modelo.grabarPais(pais_);
            JOptionPane.showInputDialog(null,"Se agregó con exito");
  
           // int tamaño = 0;
           // tamaño = modelo.listaPaises().size();


                int resultado = 0;

                resultado = modelo.grabarPais(pais_);
                
                if (resultado == 1) {
                    vista.gestionMensajes("Registro Grabado con éxito",
                            "Confirmación", JOptionPane.INFORMATION_MESSAGE);

/*                    ArrayList <Pais> listaPaises;
                    listaPaises = modelo.listaPaises();
               
                } else {
                    vista.gestionMensajes("Error al grabar",
                            "Confirmación", JOptionPane.ERROR_MESSAGE);
                }
                vista.gestionMensajes("Codigo ya está registrado",
                        "Confirmación",
                        JOptionPane.ERROR_MESSAGE);
            }*/
                }
        
    }
        
    public void modificarPais()
    {
         /*if (vista.getPais_Id().equals("")) {
            vista.gestionMensajes("Ingrese el código",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);
            /*else if (vista.getNivel().trim().
                           equals("Seleccionar ...")){
                   vista.gestionMensajes("Seleccione un nivel",
                           "Error de Entrada", JOptionPane.ERROR_MESSAGE );  
        } else {*/
             
            // vista.getPais_Id().setEnabled(false);
           
            Pais pais = new Pais();
 //           pais.setPais_id(vista.getPais_Id());
//           pais.setPais(vista.getPais());
            pais.setUltimaActualizacion(Fecha.crearFechaTimeStamp());
           
           PaisDAO paisDAO = new PaisDAO();
           paisDAO.modificarPais(pais);
   
           JOptionPane.showInputDialog(null,"Se actualizó correctamente");
        }
        
    }
    
//}
