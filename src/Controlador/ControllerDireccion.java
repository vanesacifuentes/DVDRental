/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Modela el acceso a datos de la tabla address
 * Programadores : Cristhian Guzman, Juan Martinez, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : ControllerDireccion
 */
package Controlador;


import JFrame.jFdireccion;
import Modelo.Direccion;
import Modelo.DireccionDAO;
import Servicios.Fecha;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ControllerDireccion {
    
    
    jFdireccion vista;
    DireccionDAO modelo;

    //Constructor Controlador de direccion
    public ControllerDireccion(jFdireccion vista, DireccionDAO modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        //Escuchas de los componentes
        ListenerDireccion escuchador = new ListenerDireccion();
        
        this.vista.addListenerBtnNuevo(escuchador);
        
        
    }
    //Construccion clase ListenerDireccion para manejar los eventos
    public class ListenerDireccion implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == vista.getjBnuevo()) {
                JOptionPane.showMessageDialog(null, "Prueba");
                registrar();
            } else if (ae.getSource() == vista.getjBmodificar()) {
                //actualizar();
            }
        }
    }
    
        //Metodo registrar direccion
        public void registrar() { //

            if (vista.getjTDireccionID().equals("")) {
                vista.gestionMensajes("Ingrese el código",
                        "Error de Entrada", JOptionPane.ERROR_MESSAGE);
                /*else if (vista.getNivel().trim().
                           equals("Seleccionar ...")){
                   vista.gestionMensajes("Seleccione un nivel",
                           "Error de Entrada", JOptionPane.ERROR_MESSAGE );  */
            } else {
            Direccion direccion = new Direccion();
                
            direccion.setDireccionID(Integer.parseInt(vista.getjTDireccionID().getText()));
            direccion.setDireccion(vista.getjTDireccion1().getText());
            direccion.setDireccion(vista.getjTDireccion2().getText());
            direccion.setDistrito(vista.getjTDistrito().getText());
            direccion.setTelefono(vista.getjTtelefono().getText());
            direccion.setCiudadID_direccion(vista.getjComboCiudad().getSelectedIndex());
           // direccion.setCodigoPostal(vista.getjTCodigoPostal().getText()); se cambio a combo 
            direccion.setUltimaActualizacionDireccion(Fecha.crearFechaTimeStamp());
            
            
            
            //if (tamaño == 0) {
                int resultado = 0;
                //int resultado2 = 0;
                resultado = modelo.grabarDireccion(direccion);

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
           
           
 }}}           
            
           
            

                

    


    
