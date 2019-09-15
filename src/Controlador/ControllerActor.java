/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Modela el acceso a datos de la tabla actor
 * Programadores : Cristhian Guzman, Juan Martinez, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : ControllerActor
 */
package Controlador;

import InternalFrame.iFpelicula;
import JFrame.jFactor;
import Modelo.ActorDAO;
import Modelo.*;
import Servicios.Fecha;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControllerActor {

    jFactor vista;
    ActorDAO modelo;
    iFpelicula vistaPelicula;

    //Constructor Controlador de actor
    public ControllerActor(jFactor vista, ActorDAO modelo, iFpelicula vistaPelicula) {

        this.vista = vista;
        this.modelo = modelo;
        this.vistaPelicula = vistaPelicula;

        ListenerActor escuchador = new ListenerActor();
        this.vista.getjBnuevo().addActionListener(escuchador);
        this.vista.cargarActorTabla(this.modelo.listadoActores());
        this.vista.addMouseListenerTabla(escuchador);
        this.vista.getjBeliminar().addActionListener(escuchador);
        this.vista.getjBmodificar().addActionListener(escuchador);

    }

    //Construccion clase ListenerActor para manejar los eventos
    public class ListenerActor implements ActionListener, MouseListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == vista.getjBnuevo()) {

                if (vista.getjBnuevo().getText().equalsIgnoreCase("Nuevo")) {
                    vista.activarCampos(true);
                    vista.setearCampos();
                    vista.getjTActorID().setText("" + vista.valor);
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

        //Método registrar Actor
        public void registrar() {

            if (vista.validarCampos() == 0) {

                JOptionPane.showMessageDialog(null, "Ingrese Todos los Campos Requeridos");
                /*vista.gestionMensajes("Ingrese el código",
                        "Error de Entrada", JOptionPane.ERROR_MESSAGE);
                else if (vista.getNivel().trim().
                           equals("Seleccionar ...")){
                   vista.gestionMensajes("Seleccione un nivel",
                           "Error de Entrada", JOptionPane.ERROR_MESSAGE );  */
            } else {
                Actor actor = new Actor();

                actor.setActorID(Integer.parseInt(vista.getjTActorID().getText().trim()));
                actor.setNombreActor(vista.getjTnombreActor().getText().trim());
                actor.setApellidoActor(vista.getjTApellidoActor().getText().trim());
                actor.setUltimaActializacionActor(Fecha.crearFechaTimeStamp());

                System.out.println("fecha " + Fecha.crearFechaTimeStamp());

                int tamaño = 0;
                tamaño = modelo.listadoActores().size();

                //if (tamaño == 0) {
                int resultado = 0;
                //int resultado2 = 0;
                resultado = modelo.grabarActor(actor);

                if (resultado == 1) {
                    vista.gestionMensajes("Registro Grabado con éxito",
                            "Confirmación", JOptionPane.INFORMATION_MESSAGE);

                    vista.nuevaAccion();

                    ArrayList<Actor> listaActores;
                    listaActores = modelo.listadoActores();
                    vista.cargarActorTabla(listaActores);
                    vistaPelicula.cargarActorCombo(listaActores);

                    //vista.activarControles(false); 
                    //vista.nuevoAction();
                } else {
                    vista.gestionMensajes("Error al grabar",
                            "Confirmación", JOptionPane.ERROR_MESSAGE);
                }
                //} else {
//                vista.gestionMensajes("Codigo ya está registrado",
//                        "Confirmación",
//                        JOptionPane.ERROR_MESSAGE);
            }

        }

        //Método actualizar actor
        public void actualizar() {

            String codigo;
            codigo = (vista.getjTActorID().getText());

            if (codigo.equalsIgnoreCase("")) {
                vista.gestionMensajes(
                        "Por favor seleccione un Actor de la tabla",
                        "Mensaje de Advertencia ",
                        JOptionPane.ERROR_MESSAGE);
            } else {

                if (vista.validarCampos() == 0) {

                    JOptionPane.showMessageDialog(null, "Ingrese Todos los Campos Requeridos");

                }else
                {
                Actor actor = new Actor();
                //Se configura los datos en el objeto cliente de la clase Actor
                actor.setActorID(Integer.parseInt(vista.getjTActorID().getText().trim()));
                actor.setNombreActor(vista.getjTnombreActor().getText().trim());
                actor.setApellidoActor(vista.getjTApellidoActor().getText().trim());
                actor.setUltimaActializacionActor(Fecha.crearFechaTimeStamp());

                if (modelo.modificarActor(actor) == 1) {
                    vista.gestionMensajes(
                            "Actualización exitosa",
                            "Confirmación ",
                            JOptionPane.INFORMATION_MESSAGE);

//                vista.activarControles(false); 
//                vista.nuevoAction();
                    ArrayList<Actor> listadoActores;
                    listadoActores = modelo.listadoActores();
                    vista.cargarActorTabla(listadoActores);
                    vistaPelicula.cargarActorCombo(listadoActores);
                    vista.nuevaAccion();

                } else {
                    vista.gestionMensajes(
                            "Actualización Falida jajaja",
                            "Confirmación ",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
            }

        }

        //Método borrar actor
        private void borrar() {
            String codigo;
            codigo = (vista.getjTActorID().getText());

            if (codigo.equalsIgnoreCase("")) {
                vista.gestionMensajes(
                        "Por favor seleccione un Actor de la tabla",
                        "Mensaje de Advertencia ",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                int respuesta = JOptionPane.showConfirmDialog(null,
                        "¿Desea Eliminar el Actor: " + vista.getjTableActores().getValueAt(
                                vista.getjTableActores().getSelectedRow(), 1),
                        "Confirmación de Acción", JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {

                    if (modelo.borrarActor(Integer.parseInt(codigo)) == 1) {
                        JOptionPane.showMessageDialog(null,
                                "Registro Borrado con éxtio",
                                "Confirmación de acción",
                                JOptionPane.INFORMATION_MESSAGE);

                        ArrayList<Actor> listadoActor;
                        listadoActor = modelo.listadoActores();
                        vista.cargarActorTabla(listadoActor);
                        vistaPelicula.cargarActorCombo(listadoActor);
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

        //Método escucha para seleccionar la tabla y carguen los datos del actor seleccionado
        @Override
        public void mouseClicked(MouseEvent me) {
            if (vista.getjBnuevo().getText().equals("Grabar")) {
            } else {
                vista.getjTnombreActor().setForeground(Color.BLACK);
                int indiceTabla = vista.getjTableActores().getSelectedRow();
                ArrayList<Actor> ListaActores = modelo.listadoActores();
                vista.getjTActorID().setText("" + ListaActores.get(indiceTabla).getActorID());
                vista.getjTnombreActor().setText("" + ListaActores.get(indiceTabla).getNombreActor());
                vista.getjTApellidoActor().setText("" + ListaActores.get(indiceTabla).getApellidoActor());
                vista.getjLFechaActu().setText("" + ListaActores.get(indiceTabla).getUltimaActializacionActor());
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
