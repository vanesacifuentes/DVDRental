/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Modela el acceso a datos de la tabla language
 * Programadores : Cristhian Guzman, Juan Martinez, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : ControllerLenguaje
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
import InternalFrame.*;

public class ControllerLenguaje {

    jFlenguaje vista;
    LenguajeDAO modelo;
    iFpelicula vistaPelicula;

    //Constructor Controlador de lenguaje
    public ControllerLenguaje(jFlenguaje vista, LenguajeDAO modelo, iFpelicula vistaPelicula) {

        this.vista = vista;
        this.modelo = modelo;
        this.vistaPelicula = vistaPelicula;

        ListenerLenguaje escuchador = new ListenerLenguaje();
        this.vista.getjBnuevo().addActionListener(escuchador);
        this.vista.cargarLenguajesTabla(this.modelo.listadoLenguajes());
        this.vista.addMouseListenerTabla(escuchador);
        this.vista.getjBeliminar().addActionListener(escuchador);
        this.vista.getjBmodificar().addActionListener(escuchador);

    }

    //Construccion clase ListenerLenguaje para manejar los eventos
    public class ListenerLenguaje implements ActionListener, MouseListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == vista.getjBnuevo()) {

                if (vista.getjBnuevo().getText().equalsIgnoreCase("Nuevo")) {
                    vista.activarCampos(true);
                    vista.setearCampos();
                    vista.getjTLenguajeID().setText("" + vista.valor);
                    vista.getjBnuevo().setText("Grabar");
                    vista.getjBmodificar().setText("Cancelar");
                    vista.getjBeliminar().setVisible(false);

                } else if (vista.getjBnuevo().getText().equalsIgnoreCase("Grabar")) {
                    registrar();

                } else if (vista.getjBnuevo().getText().equalsIgnoreCase("Actualizar")) {
                    actualizar();
                }

            } else if (ae.getSource() == vista.getjBmodificar()) {
                if (vista.getjBmodificar().getText().equalsIgnoreCase("Modificar")) {
                    vista.activarCampos(true);
                    vista.getjBnuevo().setText("Actualizar");
                    vista.getjBmodificar().setText("Cancelar");
                    vista.getjBeliminar().setVisible(false);
                } else if (vista.getjBmodificar().getText().equalsIgnoreCase("Cancelar")) {

                    vista.nuevaAccion();
                }

            } else if (ae.getSource() == vista.getjBeliminar()) {
                borrar();
            }
        }

        //Método registrar lenguaje
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

                lenguaje.setLenguageID(Integer.parseInt(vista.getjTLenguajeID().getText().trim()));
                lenguaje.setNombreLenguaje(vista.getjTnombreLenguaje().getText().trim());
                lenguaje.setUltimaActualizacion(Fecha.crearFechaTimeStamp());

                int tamaño = 0;
                tamaño = modelo.listadoLenguajes().size();

                //if (tamaño == 0) {
                int resultado = 0;
                //int resultado2 = 0;
                resultado = modelo.grabarLenguaje(lenguaje);

                if (resultado == 1) {
                    vista.gestionMensajes("Registro Grabado con éxito",
                            "Confirmación", JOptionPane.INFORMATION_MESSAGE);

                    vista.nuevaAccion();

                    ArrayList<Lenguaje> listaLenguajes;
                    listaLenguajes = modelo.listadoLenguajes();
                    vista.cargarLenguajesTabla(listaLenguajes);
                    vistaPelicula.cargarLenguajesCombo(listaLenguajes);

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

        //Método actualizar lenguaje
        public void actualizar() {

            String codigo;
            codigo = (vista.getjTLenguajeID().getText());

            if (codigo.equalsIgnoreCase("")) {
                vista.gestionMensajes(
                        "Por favor seleccione un Lenguaje de la tabla",
                        "Mensaje de Advertencia ",
                        JOptionPane.ERROR_MESSAGE);
            } else {

                Lenguaje lenguaje = new Lenguaje();
                //Se configura los datos en el objeto cliente de la clase Lenguaje
                lenguaje.setLenguageID(Integer.parseInt(vista.getjTLenguajeID().getText().trim()));
                lenguaje.setNombreLenguaje(vista.getjTnombreLenguaje().getText().trim());
                lenguaje.setUltimaActualizacion(Fecha.crearFechaTimeStamp());

                if (modelo.modificarLenguaje(lenguaje) == 1) {
                    vista.gestionMensajes(
                            "Actualización exitosa",
                            "Confirmación ",
                            JOptionPane.INFORMATION_MESSAGE);

//                vista.activarControles(false); 
//                vista.nuevoAction();
                    ArrayList<Lenguaje> listadoLenguajes;
                    listadoLenguajes = modelo.listadoLenguajes();
                    vista.cargarLenguajesTabla(listadoLenguajes);
                    vistaPelicula.cargarLenguajesCombo(listadoLenguajes);
                    vista.nuevaAccion();

                } else {
                    vista.gestionMensajes(
                            "Actualización Falida jajaja",
                            "Confirmación ",
                            JOptionPane.ERROR_MESSAGE);
                }

            }

        }

        //Método borrar lenguaje
        private void borrar() {
            String codigo;
            codigo = (vista.getjTLenguajeID().getText());

            if (codigo.equalsIgnoreCase("")) {
                vista.gestionMensajes(
                        "Por favor seleccione un Lenguaje de la tabla",
                        "Mensaje de Advertencia ",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                int respuesta = JOptionPane.showConfirmDialog(null,
                        "¿Desea Eliminar el lenguaje: " + vista.getjTableLenguaje().getValueAt(
                                vista.getjTableLenguaje().getSelectedRow(), 1),
                        "Confirmación de Acción", JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {

                    if (modelo.borrarLenguaje(Integer.parseInt(codigo)) == 1) {
                        JOptionPane.showMessageDialog(null,
                                "Registro Borrado con éxtio",
                                "Confirmación de acción",
                                JOptionPane.INFORMATION_MESSAGE);

                        ArrayList<Lenguaje> listadoLenguaje;
                        listadoLenguaje = modelo.listadoLenguajes();
                        vista.cargarLenguajesTabla(listadoLenguaje);
                        vistaPelicula.cargarLenguajesCombo(listadoLenguaje);
                        vista.nuevaAccion();

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Error al borrar",
                                "Confirmación de acción",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }

        //Método escucha para seleccionar la tabla y carguen los datos del lenguaje seleccionado   
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
