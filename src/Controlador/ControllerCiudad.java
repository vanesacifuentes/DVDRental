/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Modela el acceso a datos de la tabla city
 * Programadores : Cristhian Guzman, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : ControllerCiudad
 */
package Controlador;

import JFrame.jFCiudad;
import JFrame.jFdireccion;
import Modelo.Ciudad;
import Modelo.CiudadDAO;
import Modelo.Pais;
import Modelo.PaisDAO;
import Servicios.Fecha;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vanes
 */
public class ControllerCiudad {

    jFCiudad vista;
    CiudadDAO modelo;
    jFdireccion vistaDireccion;
    ArrayList<Pais> listaPaises;

    public ControllerCiudad(jFCiudad vista, CiudadDAO modelo, jFdireccion vistaDireccion) {
        this.vista = vista;
        this.modelo = modelo;
        this.vistaDireccion = vistaDireccion;

        PaisDAO modelPais = new PaisDAO();

        this.vista.cargarPaisesCombo(listaPaises = modelPais.listaPaises());

        ListenerCiudad listen = new ListenerCiudad();
        this.vista.getjBnuevo().addActionListener(listen);
        this.vista.getjBmodificar().addActionListener(listen);
        this.vista.getjBeliminar().addActionListener(listen);
    }

    //  Construccion clase ListenerCiudad para manejar los eventos
    public class ListenerCiudad implements ActionListener, MouseListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == vista.getjBnuevo()) {

                if (vista.getjBnuevo().getText().equalsIgnoreCase("Nuevo")) {
                    vista.activarCampos(true);
                    vista.setearCampos();
                    vista.getjTCiudadID().setText("" + vista.valor);
                    vista.getjBnuevo().setText("Grabar");
                    vista.getjBmodificar().setText("Cancelar");
                    vista.getjBeliminar().setVisible(false);

                } else if (vista.getjBnuevo().getText().equalsIgnoreCase("Grabar")) {
                    registrar();

                } else if (vista.getjBnuevo().getText().equalsIgnoreCase("Actualizar")) {
                    actualizar();
                } else if (ae.getSource() == vista.getjBtnIngresoPais()) {

                    PaisDAO modeloPais = new PaisDAO();
                  //  jFpais PaisView = new jFpais();
                    jFCiudad ciudadView = new jFCiudad();
                  //  ControllerPais controlador = new ControllerPais(PaisView, modeloPais, ciudadView);

                  //  PaisView.setVisible(true);

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
        }
            //Método escucha para seleccionar la tabla y carguen los datos del paises seleccionado   
            @Override
            public void mouseClicked
            (MouseEvent me
            
                ) {
            if (vista.getjBnuevo().getText().equals("Grabar")) {

                } else {
                    vista.getjTnombreciudad().setForeground(Color.BLACK);
                    int indiceTabla = vista.getjTableCiudad().getSelectedRow();
                    ArrayList<Ciudad> ListaCiudades = modelo.listaCiudades();
                    vista.getjTCiudadID().setText("" + ListaCiudades.get(indiceTabla).getPais_id());
                    vista.getjTnombreciudad().setText("" + ListaCiudades.get(indiceTabla).getCiudad());

                    vista.getjLfechaActua().setText("" + ListaCiudades.get(indiceTabla).getUltimaActualizacion());
                }

            }

            @Override
            public void mousePressed
            (MouseEvent me
            
            
            ) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
            public void mouseReleased
            (MouseEvent me
            
            
            ) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
            public void mouseEntered
            (MouseEvent me
            
            
            ) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
            public void mouseExited
            (MouseEvent me
            
            
        

        ) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
            
   }

        //Método registrar ciudades
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

                Ciudad ciudad = new Ciudad();

                ciudad.setID_ciudad(Integer.parseInt(vista.getjTCiudadID().getText().trim()));
                ciudad.setCiudad(vista.getjTnombreciudad().getText().trim());
                ciudad.setPais_id(Integer.parseInt(vista.getjCBPais().getSelectedItem().toString()));
                ciudad.setUltimaActualizacion(Fecha.crearFechaTimeStamp());

                int tamaño = 0;
                tamaño = modelo.listaCiudades().size();

                //if (tamaño == 0) {
                int resultado = 0;
                //int resultado2 = 0;
                resultado = modelo.grabarCiudad(ciudad);

                if (resultado == 1) {
                    vista.gestionMensajes("Registro Grabado con éxito",
                            "Confirmación", JOptionPane.INFORMATION_MESSAGE);

                    vista.nuevaAccion();

                    ArrayList<Ciudad> listaCiudades;
                    listaCiudades = modelo.listaCiudades();
                    vista.cargarCiudadesTabla(listaCiudades);
                    //   vistaDireccion.cargarLenguajesCombo(listaPaises);

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

        //Método actualizar ciudades
        public void actualizar() {

            String codigo;
            codigo = (vista.getjTCiudadID().getText());

            if (codigo.equalsIgnoreCase("")) {
                vista.gestionMensajes(
                        "Por favor seleccione un País de la tabla",
                        "Mensaje de Advertencia ",
                        JOptionPane.ERROR_MESSAGE);
            } else {

                if (vista.validarCampos() == 0) {

                    JOptionPane.showMessageDialog(null, "Ingrese Todos los Campos Requeridos");
                    /*vista.gestionMensajes("Ingrese el código",
                        "Error de Entrada", JOptionPane.ERROR_MESSAGE);
                else if (vista.getNivel().trim().
                           equals("Seleccionar ...")){
                   vista.gestionMensajes("Seleccione un nivel",
                           "Error de Entrada", JOptionPane.ERROR_MESSAGE );  */
                } else {

                    Ciudad ciudad = new Ciudad();

                    ciudad.setID_ciudad(Integer.parseInt(vista.getjTCiudadID().getText().trim()));
                    ciudad.setCiudad(vista.getjTnombreciudad().getText().trim());
                    ciudad.setPais_id(Integer.parseInt(vista.getjCBPais().getSelectedItem().toString()));
                    ciudad.setUltimaActualizacion(Fecha.crearFechaTimeStamp());

                    if (modelo.modificarCiudad(ciudad) == 1) {
                        vista.gestionMensajes(
                                "Actualización exitosa",
                                "Confirmación ",
                                JOptionPane.INFORMATION_MESSAGE);

//                vista.activarControles(false); 
//                vista.nuevoAction();
                        ArrayList<Ciudad> listaCiudades;
                        listaCiudades = modelo.listaCiudades();
                        vista.cargarCiudadesTabla(listaCiudades);
                        //Cargar a combo en direccion // vistaDireccion.cargarLenguajesCombo(listaPaises);

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

        //Método borrar ciudades
        private void borrar() {
            String codigo;
            codigo = (vista.getjTCiudadID().getText());

            if (codigo.equalsIgnoreCase("")) {
                vista.gestionMensajes(
                        "Por favor seleccione una ciudad de la tabla",
                        "Mensaje de Advertencia ",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                int respuesta = JOptionPane.showConfirmDialog(null,
                        "¿Desea Eliminar la ciudad: " + vista.getjTableCiudad().getValueAt(
                                vista.getjTableCiudad().getSelectedRow(), 1),
                        "Confirmación de Acción", JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {

                    if (modelo.borrarCiudad(Integer.parseInt(codigo)) == 1) {
                        JOptionPane.showMessageDialog(null,
                                "Registro Borrado con éxtio",
                                "Confirmación de acción",
                                JOptionPane.INFORMATION_MESSAGE);

                        ArrayList<Ciudad> listaCiudades;
                        listaCiudades = modelo.listaCiudades();
                        vista.cargarCiudadesTabla(listaCiudades);
                        //Cargar a combo en direccion // vistaDireccion.cargarLenguajesCombo(listaPaises);

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

    }
