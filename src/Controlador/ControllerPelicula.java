/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import InternalFrame.iFpelicula;
import Modelo.Categoria;
import Servicios.*;
import Modelo.*;
import Modelo.PeliculaDAO;
import Modelo.CategoriaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import JFrame.*;

/**
 *
 * @author vanes
 */
public class ControllerPelicula {

    private iFpelicula vista;
    private PeliculaDAO modelo;
    private ArrayList<Categoria> listaCategorias, listaCategoriasSelected;
    private ArrayList<Lenguaje> listaLenguajes;
    private ArrayList<Actor> listaActores;

    public ControllerPelicula(iFpelicula vista, PeliculaDAO modelo) {
        this.vista = vista;
        this.modelo = modelo;

        listaCategoriasSelected = new ArrayList<>();
        CategoriaDAO modelCat = new CategoriaDAO();
        LenguajeDAO modelLenguaje = new LenguajeDAO();
        ActorDAO modelActor = new ActorDAO();

        //Se carga en la Tabla la informacion proveniente de la base de datos
        this.vista.cargarPeliculasTabla(this.modelo.listadoPeliculas());

        //Se carga en los ComboBox de la interfaz la informacion proveniente de las tablas 
        this.vista.cargarCategoriasCombo(listaCategorias = modelCat.listadoCateogoria());
        this.vista.cargarLenguajesCombo(listaLenguajes = modelLenguaje.listadoLenguajes());
        this.vista.cargarActorCombo(listaActores = modelActor.listadoActores());

        ///Se carga en el ComboBox de Clasificacion la info de clasificacion
        this.vista.cargarClasificacionCombo();

        //Se añade las escuchas a los botones
        PeliculaListener listen = new PeliculaListener();
        this.vista.getjBLenguaje().addActionListener(listen);
        this.vista.getjBagregarActor().addActionListener(listen);
        this.vista.getjBagrgarCate().addActionListener(listen);
        this.vista.addListenerBtnNuevo(listen);
        this.vista.getjBmodificar().addActionListener(listen);
        this.vista.getjBeliminar().addActionListener(listen);
        this.vista.addMouseListenerTabla(listen);

    }

    public class PeliculaListener implements ActionListener, MouseListener {

        //Clase manejadora de los eventos del IFpelicula
        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == vista.getjBnuevo()) {

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

                    vista.activarCampos(false);
                    vista.setearCampos();
                    vista.getjBnuevo().setText("Nuevo");
                    vista.getjBmodificar().setText("Modificar");
                    vista.getjBeliminar().setVisible(true);
                }

            } else if (ae.getSource() == vista.getjBeliminar()) {
                borrar();
            } else if (ae.getSource() == vista.getjBLenguaje()) {
                jFlenguaje vista1 = new jFlenguaje();
                LenguajeDAO modelo = new LenguajeDAO();
                ControllerLenguaje lenguajeControlador = new ControllerLenguaje(vista1, modelo, vista);
                vista1.setVisible(true);

            } else if (ae.getSource() == vista.getjBagregarActor()) {
                jFactor vistaActor = new jFactor();
                ActorDAO modelo = new ActorDAO();
                ControllerActor actorControlador = new ControllerActor(vistaActor, modelo, vista);
                vistaActor.setVisible(true);

            } else if (ae.getSource() == vista.getjBagrgarCate()) {

                jFcategoria vistaCategoria = new jFcategoria();
                CategoriaDAO modelo = new CategoriaDAO();
                ControllerCategoria categoriaControlador = new ControllerCategoria(vistaCategoria, modelo, vista);
                vistaCategoria.setVisible(true);
            }

        }

        @Override
        public void mouseClicked(MouseEvent me) {

            if (!vista.getjBnuevo().getText().equalsIgnoreCase("Grabar")) {
                if (vista.getjTable2().getSelectedRow() == -1) {
                    if (vista.getjTable2().getRowCount() == 0) {
                        JOptionPane.showMessageDialog(null, "No hay registros");
                    } else {
                        JOptionPane.showMessageDialog(null, "Seleccione una fila");
                    }
                } else {

                    int indiceTabla = vista.getjTable2().getSelectedRow();

                    ArrayList<Pelicula> ListaPeliculas = modelo.listadoPeliculas();
                    vista.getjTid_peli().setText("" + ListaPeliculas.get(indiceTabla).getPeliculaId());
                    vista.getjTtitulo().setText("" + ListaPeliculas.get(indiceTabla).getTitulo());
                    vista.getjTaño().setText("" + ListaPeliculas.get(indiceTabla).getAnhoLanzamiento());
                    vista.getjTtarifa().setText("" + ListaPeliculas.get(indiceTabla).getTarifaRenta());
                    vista.getjTDuracionAlquiler().setText("" + ListaPeliculas.get(indiceTabla).getDuracionRenta());
                    vista.getjTcostoRe().setText("" + ListaPeliculas.get(indiceTabla).getCostoReemplazo());
                    vista.getjTduracion().setText("" + ListaPeliculas.get(indiceTabla).getLongitud());
                    vista.getjTcarateristicas().setText("" + ListaPeliculas.get(indiceTabla).getCaracteristicasEspeciales());
                    vista.getjTtextoCompleto().setText("" + ListaPeliculas.get(indiceTabla).getTextoCompleto());
                    vista.gettAsinopsis().setText("" + ListaPeliculas.get(indiceTabla).getDescripcion());
                    vista.getjCBClasificacion().setSelectedItem(ListaPeliculas.get(indiceTabla).getClasificacion());

                    //Lenguaje lenguaje = modelo.extraerPorId(ListaPeliculas.get(indiceTabla).getLenguajeID());
                    //vista.getjCBlenguaje().setSelectedItem(lenguaje.getNombreLenguaje());
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }

    }

    public void registrar() {

        if (vista.getjTid_peli().equals("")) {
            vista.gestionMensajes("Ingrese el código",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);
            /*else if (vista.getNivel().trim().
                           equals("Seleccionar ...")){
                   vista.gestionMensajes("Seleccione un nivel",
                           "Error de Entrada", JOptionPane.ERROR_MESSAGE );  */
        } else {
            Pelicula pelicula = new Pelicula();
            pelicula.setPeliculaId(Integer.parseInt(vista.getjTid_peli().getText()));//revisar el ingreso null
            pelicula.setTitulo(vista.getjTtitulo().getText());
            pelicula.setDescripcion(vista.gettAsinopsis().getText());
            pelicula.setAnhoLanzamiento(Integer.parseInt(vista.getjTaño().getText()));

            int indiceLenguaje = 0;
            indiceLenguaje = vista.getjCBlenguaje().getSelectedIndex();
            pelicula.setLenguajeID(listaLenguajes.get(indiceLenguaje).getLenguageID());
            pelicula.setDuracionRenta(Integer.parseInt(vista.getjTDuracionAlquiler().getText()));
            pelicula.setTarifaRenta(Integer.parseInt(vista.getjTtarifa().getText()));
            pelicula.setLongitud(Integer.parseInt(vista.getjTduracion().getText()));
            pelicula.setCostoReemplazo(Integer.parseInt(vista.getjTcostoRe().getText()));
            System.err.println("" + vista.getjCBClasificacion().getSelectedItem());
            pelicula.setClasificacion(vista.getjCBClasificacion().getSelectedItem().toString());
            pelicula.setUltimaActualizacion(Fecha.crearFechaTimeStamp());
            pelicula.setCaracteristicasEspeciales("{" + vista.getjTcarateristicas().getText() + "}");
            pelicula.setTextoCompleto(vista.getjTtextoCompleto().getText());

            int resultado;
            resultado = modelo.grabarPelicula(pelicula);

            registrarPelicula_Categoria(pelicula.getPeliculaId());
            registrarPelicula_Actor(pelicula.getPeliculaId());

            if (resultado == 1) {
                vista.gestionMensajes("Registro Grabado con éxito",
                        "Confirmación", JOptionPane.INFORMATION_MESSAGE);

                ArrayList<Pelicula> listaPeliculas;
                listaPeliculas = modelo.listadoPeliculas();
                vista.cargarPeliculasTabla(listaPeliculas);

            } else {
                vista.gestionMensajes("Error al grabar",
                        "Confirmación", JOptionPane.ERROR_MESSAGE);
            }

            vista.gestionMensajes("Codigo ya está registrado",
                    "Confirmación",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public Categoria buscarCategoria_Nombre(String nombre, ArrayList<Categoria> array) {
        
        Categoria cat = new Categoria();
        for (int a = 0; a < array.size(); a++) {
            if (nombre.equalsIgnoreCase(array.get(a).getNombreCategoria())) {
                cat = array.get(a);
            }

        }
        return cat;
    }

    public Actor buscarActor_Nombre(String nombre, ArrayList<Actor> array) {
        Actor actor = new Actor();
        //JOptionPane.showMessageDialog(null, nombre);
        for (int a = 0; a < array.size(); a++) {
            if (nombre.equalsIgnoreCase(array.get(a).getNombreActor()+" "+array.get(a).getApellidoActor())) {
                actor = array.get(a);
                //JOptionPane.showMessageDialog(null, actor.getActorID()+"___"+actor.getNombreActor());
            }

        }
        return actor;
    }

    public void registrarPelicula_Categoria(int idPelicula) {
        for (int a = 0; a < vista.getModeloListaCategoria().getSize(); a++) {

            Categoria category = buscarCategoria_Nombre(vista.getModeloListaCategoria().getElementAt(a).toString(), listaCategorias);
            System.err.println("Categoria -- "+category.getCategoriaId());
            modelo.grabarPeliculaCategoria(category.getCategoriaId(), idPelicula);
        }
    }

    public void registrarPelicula_Actor(int idPelicula) {
        for (int a = 0; a < vista.getModeloListaActor().getSize(); a++) {

            Actor actor = buscarActor_Nombre(vista.getModeloListaActor().getElementAt(a).toString(), listaActores);
            System.err.println("Actor -- "+actor.getActorID());
            modelo.grabarPeliculaActor(actor.getActorID(), idPelicula);
        }
    }

    private void actualizar() {

        
            Pelicula pelicula = new Pelicula();
            pelicula.setPeliculaId(Integer.parseInt(vista.getjTid_peli().getText()));//revisar el ingreso null
            pelicula.setTitulo(vista.getjTtitulo().getText());
            pelicula.setDescripcion(vista.gettAsinopsis().getText());
            pelicula.setAnhoLanzamiento(Integer.parseInt(vista.getjTaño().getText()));

            int indiceLenguaje = 0;
            indiceLenguaje = vista.getjCBlenguaje().getSelectedIndex();
            pelicula.setLenguajeID(listaLenguajes.get(indiceLenguaje).getLenguageID());
            pelicula.setDuracionRenta(Integer.parseInt(vista.getjTDuracionAlquiler().getText()));
            pelicula.setTarifaRenta(Integer.parseInt(vista.getjTtarifa().getText()));
            pelicula.setLongitud(Integer.parseInt(vista.getjTduracion().getText()));
            pelicula.setCostoReemplazo(Integer.parseInt(vista.getjTcostoRe().getText()));
            System.err.println("" + vista.getjCBClasificacion().getSelectedItem());
            pelicula.setClasificacion(vista.getjCBClasificacion().getSelectedItem().toString());
            pelicula.setUltimaActualizacion(Fecha.crearFechaTimeStamp());
            pelicula.setCaracteristicasEspeciales("{" + vista.getjTcarateristicas().getText() + "}");
            pelicula.setTextoCompleto(vista.getjTtextoCompleto().getText());
                    
                         
            if(modelo.modificarPelicula(pelicula) == 1){
                vista.gestionMensajes(
                        "Actualización exitosa",
                        "Confirmación ", 
                        JOptionPane.INFORMATION_MESSAGE);
                                        
                
                
                ArrayList<Pelicula> listadoPeliculas; 
                listadoPeliculas = modelo.listadoPeliculas();
                vista.cargarPeliculasTabla(listadoPeliculas);           
            } else {
                vista.gestionMensajes(
                        "Actualización Falida",
                        "Confirmación ", 
                        JOptionPane.ERROR_MESSAGE);                 
            }              
         
        
    }

    private void borrar() {
        int codigo = 0;
        codigo = Integer.parseInt(vista.getjTid_peli().getText());

        if (codigo == 0) {
            vista.gestionMensajes(
                    "Por favor seleccione una Película de la tabla",
                    "Mensaje de Advertencia ",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            int respuesta = JOptionPane.showConfirmDialog(null,
                    "¿Desea Eliminar la película: " + vista.getjTable2().getValueAt(
                            vista.getjTable2().getSelectedRow(), 1),
                    "Confirmación de Acción", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {

                if (modelo.borrarPelicula(codigo) == 1) {
                    JOptionPane.showMessageDialog(null,
                            "Registro Borrado con éxtio",
                            "Confirmación de acción",
                            JOptionPane.INFORMATION_MESSAGE);

                    ArrayList<Pelicula> listadoPeliculas;
                    listadoPeliculas = modelo.listadoPeliculas();
                    vista.cargarPeliculasTabla(listadoPeliculas);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Error al borrar",
                            "Confirmación de acción",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public iFpelicula getVista() {
        return vista;
    }

    public PeliculaDAO getModelo() {
        return modelo;
    }

}
