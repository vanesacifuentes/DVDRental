/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Modela el acceso a datos de la tabla country
 * Programadores : Cristhian Guzman, Juan Martinez, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : ControllerPais
 */
//package Controlador;
//
//import JFrame.jFCiudad;
//import JFrame.jFpais;
//import Modelo.Pais;
//import Modelo.PaisDAO;
//import Servicios.Fecha;
//import java.awt.Color;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.util.ArrayList;
//import javax.swing.JOptionPane;
//
//public class ControllerPais {
//
//    jFpais vista;
//    PaisDAO modelo;
//    jFCiudad vistaCiudad;
//
//    public ControllerPais(jFpais vista, PaisDAO modelo, jFCiudad vistaCiudad) {
//
//        this.vista = vista;
//        this.modelo = modelo;
//        this.vistaCiudad = vistaCiudad;
//
//        ListenerPais listen = new ListenerPais();
//        this.vista.getjBnuevo().addActionListener(listen);
//        this.vista.getjBmodificar().addActionListener(listen);
//        this.vista.getjBeliminar().addActionListener(listen);
//
//    }
//
//    //Construccion clase ListenerPais para manejar los eventos
//    public class ListenerPais implements ActionListener, MouseListener {
//
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//
//            if (ae.getSource() == vista.getjBnuevo()) {
//
//                if (vista.getjBnuevo().getText().equalsIgnoreCase("Nuevo")) {
//                    vista.activarCampos(true);
//                    vista.setearCampos();
//                    vista.getjTPaisID().setText("" + vista.valor);
//                    vista.getjBnuevo().setText("Grabar");
//                    vista.getjBmodificar().setText("Cancelar");
//                    vista.getjBeliminar().setVisible(false);
//
//                } else if (vista.getjBnuevo().getText().equalsIgnoreCase("Grabar")) {
//                    registrar();
//
//                } else if (vista.getjBnuevo().getText().equalsIgnoreCase("Actualizar")) {
//                    actualizar();
//                }
//                
//
//            } else if (ae.getSource() == vista.getjBmodificar()) {
//                if (vista.getjBmodificar().getText().equalsIgnoreCase("Modificar")) {
//                    vista.activarCampos(true);
//                    vista.getjBnuevo().setText("Actualizar");
//                    vista.getjBmodificar().setText("Cancelar");
//                    vista.getjBeliminar().setVisible(false);
//                } else if (vista.getjBmodificar().getText().equalsIgnoreCase("Cancelar")) {
//
//                    vista.nuevaAccion();
//                }
//
//            } else if (ae.getSource() == vista.getjBeliminar()) {
//                borrar();
//            }
//        }
//
//        //Método escucha para seleccionar la tabla y carguen los datos del paises seleccionado   
//        @Override
//        public void mouseClicked(MouseEvent me) {
//            if (vista.getjBnuevo().getText().equals("Grabar")) {
//
//            } else {
//                vista.getjTnombrePais().setForeground(Color.BLACK);
//                int indiceTabla = vista.getjTablePais().getSelectedRow();
//                ArrayList<Pais> ListaPaises = modelo.listaPaises();
//                vista.getjTPaisID().setText("" + ListaPaises.get(indiceTabla).getPais_id());
//                vista.getjTnombrePais().setText("" + ListaPaises.get(indiceTabla).getPais());
//                vista.getjLfechaActua().setText("" + ListaPaises.get(indiceTabla).getUltimaActualizacion());
//            }
//
//        }
//
//        @Override
//        public void mousePressed(MouseEvent me) {
//            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void mouseReleased(MouseEvent me) {
//            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void mouseEntered(MouseEvent me) {
//            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void mouseExited(MouseEvent me) {
//            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//    }
//    //Método registrar paises
//
//    public void registrar() {
//
//        if (vista.validarCampos() == 0) {
//
//            JOptionPane.showMessageDialog(null, "Ingrese Todos los Campos Requeridos");
//            /*vista.gestionMensajes("Ingrese el código",
//                        "Error de Entrada", JOptionPane.ERROR_MESSAGE);
//                else if (vista.getNivel().trim().
//                           equals("Seleccionar ...")){
//                   vista.gestionMensajes("Seleccione un nivel",
//                           "Error de Entrada", JOptionPane.ERROR_MESSAGE );  */
//        } else {
//            Pais pais = new Pais();
//
//            pais.setPais_id(Integer.parseInt(vista.getjTPaisID().getText().trim()));
//            pais.setPais(vista.getjTnombrePais().getText().trim());
//            pais.setUltimaActualizacion(Fecha.crearFechaTimeStamp());
//
//            int tamaño = 0;
//            tamaño = modelo.listaPaises().size();
//
//            //if (tamaño == 0) {
//            int resultado = 0;
//            //int resultado2 = 0;
//            resultado = modelo.grabarPais(pais);
//
//            if (resultado == 1) {
//                vista.gestionMensajes("Registro Grabado con éxito",
//                        "Confirmación", JOptionPane.INFORMATION_MESSAGE);
//
//                vista.nuevaAccion();
//
//                ArrayList<Pais> listaPaises;
//                listaPaises = modelo.listaPaises();
//                vista.cargarPaisTabla(listaPaises);
//                //Cargar a combo en ciudad // vistaCiudad.cargarLenguajesCombo(listaPaises);
//
//                //vista.activarControles(false); 
//                //vista.nuevoAction();
//            } else {
//                vista.gestionMensajes("Error al grabar",
//                        "Confirmación", JOptionPane.ERROR_MESSAGE);
//            }
//            //} else {
//            vista.gestionMensajes("Codigo ya está registrado",
//                    "Confirmación",
//                    JOptionPane.ERROR_MESSAGE);
//        }
//
//    }
//
//    //Método actualizar paises
//    public void actualizar() {
//
//        String codigo;
//        codigo = (vista.getjTPaisID().getText());
//
//        if (codigo.equalsIgnoreCase("")) {
//            vista.gestionMensajes(
//                    "Por favor seleccione un País de la tabla",
//                    "Mensaje de Advertencia ",
//                    JOptionPane.ERROR_MESSAGE);
//        } else {
//
//            if (vista.validarCampos() == 0) {
//
//                JOptionPane.showMessageDialog(null, "Ingrese Todos los Campos Requeridos");
//                /*vista.gestionMensajes("Ingrese el código",
//                        "Error de Entrada", JOptionPane.ERROR_MESSAGE);
//                else if (vista.getNivel().trim().
//                           equals("Seleccionar ...")){
//                   vista.gestionMensajes("Seleccione un nivel",
//                           "Error de Entrada", JOptionPane.ERROR_MESSAGE );  */
//            } else {
//
//                Pais pais = new Pais();
//
//                pais.setPais_id(Integer.parseInt(vista.getjTPaisID().getText().trim()));
//                pais.setPais(vista.getjTnombrePais().getText().trim());
//                pais.setUltimaActualizacion(Fecha.crearFechaTimeStamp());
//
//                if (modelo.modificarPais(pais) == 1) {
//                    vista.gestionMensajes(
//                            "Actualización exitosa",
//                            "Confirmación ",
//                            JOptionPane.INFORMATION_MESSAGE);
//
////                vista.activarControles(false); 
////                vista.nuevoAction();
//                    ArrayList<Pais> listadoPaises;
//                    listadoPaises = modelo.listaPaises();
//                    vista.cargarPaisTabla(listadoPaises);
////Cargar a combo en ciudad   //   vistaCiudad.carga(listadoPaises);
//                    vista.nuevaAccion();
//
//                } else {
//                    vista.gestionMensajes(
//                            "Actualización Falida jajaja",
//                            "Confirmación ",
//                            JOptionPane.ERROR_MESSAGE);
//                }
//
//            }
//        }
//
//    }
//
//    //Método borrar paises
//    private void borrar() {
//        String codigo;
//        codigo = (vista.getjTPaisID().getText());
//
//        if (codigo.equalsIgnoreCase("")) {
//            vista.gestionMensajes(
//                    "Por favor seleccione un País de la tabla",
//                    "Mensaje de Advertencia ",
//                    JOptionPane.ERROR_MESSAGE);
//        } else {
//            int respuesta = JOptionPane.showConfirmDialog(null,
//                    "¿Desea Eliminar el lenguaje: " + vista.getjTablePais().getValueAt(
//                            vista.getjTablePais().getSelectedRow(), 1),
//                    "Confirmación de Acción", JOptionPane.YES_NO_OPTION);
//
//            if (respuesta == JOptionPane.YES_OPTION) {
//
//                if (modelo.borrarPais(Integer.parseInt(codigo)) == 1) {
//                    JOptionPane.showMessageDialog(null,
//                            "Registro Borrado con éxtio",
//                            "Confirmación de acción",
//                            JOptionPane.INFORMATION_MESSAGE);
//
//                    ArrayList<Pais> listadoPais;
//                    listadoPais = modelo.listaPaises();
//                    vista.cargarPaisTabla(listadoPais);
//                    //Cargar a combo en ciudad      vistaPelicula.cargarLenguajesCombo(listadoPais);
//                    vista.nuevaAccion();
//
//                } else {
//                    JOptionPane.showMessageDialog(null,
//                            "Error al borrar",
//                            "Confirmación de acción",
//                            JOptionPane.ERROR_MESSAGE);
//                }
//            }
//        }
//    }
//
//}
