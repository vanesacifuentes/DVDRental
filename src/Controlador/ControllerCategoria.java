/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Modela el acceso a datos de la tabla category
 * Programadores : Cristhian Guzman, Juan Martinez, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : ControllerCategoria
 */
package Controlador;

import InternalFrame.iFpelicula;
import JFrame.jFcategoria;
import Modelo.Categoria;
import Modelo.CategoriaDAO;
import Servicios.Fecha;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ControllerCategoria {

    jFcategoria vista;
    CategoriaDAO modelo;
    iFpelicula vistaPelicula;

    //Constructor Controlador de categoria
    public ControllerCategoria(jFcategoria vista, CategoriaDAO modelo,iFpelicula vistapelicula) {

        this.vista = vista;
        this.modelo = modelo;
        this.vistaPelicula = vistapelicula;

        ListenerCategoria escuchador = new ListenerCategoria();
        this.vista.getjBnuevo().addActionListener(escuchador);
        this.vista.cargarCategoriaTabla(this.modelo.listadoCateogoria());
        this.vista.addMouseListenerTabla(escuchador);
        this.vista.getjBeliminar().addActionListener(escuchador);
        this.vista.getjBmodificar().addActionListener(escuchador);

    }
    //Construccion clase ListenerCategoria para manejar los eventos
    public class ListenerCategoria implements ActionListener, MouseListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == vista.getjBnuevo()) {

                if (vista.getjBnuevo().getText().equalsIgnoreCase("Nuevo")) {
                    vista.activarCampos(true);
                    vista.setearCampos();
                    vista.getjTCategoriaID().setText("" + vista.valor);
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
        
        //Método registrar categoria
        public void registrar() {

            if (vista.getjTCategoriaID().equals("")) {
                vista.gestionMensajes("Ingrese el código",
                        "Error de Entrada", JOptionPane.ERROR_MESSAGE);
                /*else if (vista.getNivel().trim().
                           equals("Seleccionar ...")){
                   vista.gestionMensajes("Seleccione un nivel",
                           "Error de Entrada", JOptionPane.ERROR_MESSAGE );  */
            } else {
                Categoria categoria = new Categoria();

                categoria.setCategoriaId(Integer.parseInt(vista.getjTCategoriaID().getText()));
                categoria.setNombreCategoria(vista.getjTnombreCategoria().getText());
                categoria.setUltimaActualizacion(Fecha.crearFechaTimeStamp());

                System.out.println("fecha " + Fecha.crearFechaTimeStamp());

                int tamaño = 0;
                tamaño = modelo.listadoCateogoria().size();

                //if (tamaño == 0) {
                int resultado = 0;
                //int resultado2 = 0;
                resultado = modelo.grabarCategoria(categoria);

                if (resultado == 1) {
                    vista.gestionMensajes("Registro Grabado con éxito",
                            "Confirmación", JOptionPane.INFORMATION_MESSAGE);

                    ArrayList<Categoria> listaCategoria;
                    listaCategoria = modelo.listadoCateogoria();
                    vista.cargarCategoriaTabla(listaCategoria);
                    vistaPelicula.cargarCategoriasCombo(listaCategoria);
                    vista.nuevaAccion();

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
        //Método actualizar categoria
        public void actualizar() {

             String codigo;
            codigo = (vista.getjTCategoriaID().getText());
            
            if(codigo.equalsIgnoreCase("")){
                 vista.gestionMensajes(
                         "Por favor seleccione una Categoría de la tabla",
                         "Mensaje de Advertencia ", 
                    JOptionPane.ERROR_MESSAGE);
            }else{
                Categoria categoria = new Categoria();

                //Se configura los datos en el objeto cliente de la clase Categoria
                categoria.setCategoriaId(Integer.parseInt(vista.getjTCategoriaID().getText().trim()));
                categoria.setNombreCategoria(vista.getjTnombreCategoria().getText());
                categoria.setUltimaActualizacion(Fecha.crearFechaTimeStamp());

                if (modelo.modificarCategoria(categoria) == 1) {
                    vista.gestionMensajes(
                            "Actualización exitosa",
                            "Confirmación ",
                            JOptionPane.INFORMATION_MESSAGE);
                    vista.nuevaAccion();

//                vista.activarControles(false); 
//                vista.nuevoAction();
                    ArrayList<Categoria> listadoCategorias;
                    listadoCategorias = modelo.listadoCateogoria();
                    vista.cargarCategoriaTabla(listadoCategorias);
                    vistaPelicula.cargarCategoriasCombo(listadoCategorias);
                } else {
                    vista.gestionMensajes(
                            "Actualización Falida jajaja",
                            "Confirmación ",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

        }
        //Método borrar categoria
        private void borrar() {
            String codigo;
            codigo = (vista.getjTCategoriaID().getText());
            
            if(codigo.equalsIgnoreCase("")){
                 vista.gestionMensajes(
                         "Por favor seleccione una Categoría de la tabla",
                         "Mensaje de Advertencia ", 
                    JOptionPane.ERROR_MESSAGE);
            }else{
                int respuesta = JOptionPane.showConfirmDialog(null,
                        "¿Desea Eliminar la Categoría: " + vista.getjTableCategoria().getValueAt(
                                vista.getjTableCategoria().getSelectedRow(), 1),
                        "Confirmación de Acción", JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {

                    if(modelo.borrarCategoria(Integer.parseInt(codigo)) ==  1){
                        JOptionPane.showMessageDialog(null,
                                "Registro Borrado con éxtio",
                                "Confirmación de acción",
                                JOptionPane.INFORMATION_MESSAGE);
                        vista.nuevaAccion();

                        ArrayList<Categoria> listadoCategoria;
                        listadoCategoria = modelo.listadoCateogoria();
                        vista.cargarCategoriaTabla(listadoCategoria);
                        vistaPelicula.cargarCategoriasCombo(listadoCategoria);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Error al borrar",
                                "Confirmación de acción",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        
        }
        //Método escucha para seleccionar la tabla y carguen los datos de categoria seleccionado
        @Override
        public void mouseClicked(MouseEvent me) {
            if (vista.getjTableCategoria().getSelectedRow() == -1) {
                if (vista.getjTableCategoria().getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "No hay registros");
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione una fila");
                }
            } else {

                int indiceTabla = vista.getjTableCategoria().getSelectedRow();
                ArrayList<Categoria> ListaCategorias = modelo.listadoCateogoria();
                vista.getjTCategoriaID().setText("" + ListaCategorias.get(indiceTabla).getCategoriaId());
                vista.getjTnombreCategoria().setText("" + ListaCategorias.get(indiceTabla).getNombreCategoria());
                vista.getjLFechaActu().setText("" + ListaCategorias.get(indiceTabla).getUltimaActualizacion());
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
