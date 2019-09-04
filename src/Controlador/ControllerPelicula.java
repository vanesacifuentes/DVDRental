/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import InternalFrame.iFpelicula;
import Modelo.Categoria;
import Modelo.CategoriaDAO;
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

/**
 *
 * @author vanes
 */
public class ControllerPelicula {

    private iFpelicula vista;
    private PeliculaDAO modelo;
    private ArrayList<Categoria> listaCategorias;
    private ArrayList<Lenguaje> listaLenguajes;
    private ArrayList<Actor> listaActores;

    public ControllerPelicula(iFpelicula vista, PeliculaDAO modelo) {
        this.vista = vista;
        this.modelo = modelo;

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
        this.vista.addListenerBtnNuevo(listen);
        this.vista.getjBmodificar().addActionListener(listen);
        this.vista.addMouseListener(listen);

    }

    public class PeliculaListener implements ActionListener, MouseListener {

        //Clase manejadora de los eventos del IFpelicula
        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == vista.getjBnuevo()) {
                JOptionPane.showMessageDialog(null, "Prueba");
                registrar();
            } else if (ae.getSource() == vista.getjBmodificar()) {
                actualizar();
            } else if (ae.getSource() == vista.getjBeliminar()) {
                delete();
            }

        }

        @Override
        public void mouseClicked(MouseEvent me) {
            if (vista.getjTable2().getSelectedRow() == -1) {
                if (vista.getjTable2().getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "No hay registros");
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione una fila");
                }
            } else {

//                int indiceTabla = vista.getjTable2().getSelectedRow();
//
//                vista.getjTid_peli().setText("" + ListaCliente.get(indiceTabla).getClienteID());
//                vista.getjTnombreCliente().setText("" + ListaCliente.get(indiceTabla).getNombreCliente());
//                vista.getjTCorreoCliente().setText("" + ListaCliente.get(indiceTabla).getCorreoCliente());
//                vista.getjTDireccion().setText("" + ListaCliente.get(indiceTabla).getDireccionCliente());
//                vista.getjTApellidos().setText("" + ListaCliente.get(indiceTabla).getApellidoCliente());
//                vista.getjTFechaCreacion().setText("" + ListaCliente.get(indiceTabla).getFechaCreacion());
//                //vista.getjCActivoInt().setsSelectedItem(""+ListaCliente.get(indiceTabla).getActivo());
//                //vista.getjCActivoInt().setText(""+ListaCliente.get(indiceTabla).getActivo());

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
//            pelicula.setPeliculaId(2000);//revisar el ingreso null
//            pelicula.setTitulo(vista.getjTtitulo().getText());
//            pelicula.setDescripcion(vista.gettAsinopsis().getText());
//            pelicula.setAnhoLanzamiento(Integer.parseInt(vista.getjTaño().getText()));
//
//            int indiceLenguaje = 0;
//            indiceLenguaje = vista.getjCBlenguaje().getSelectedIndex();
//            pelicula.setLenguajeID(listaLenguajes.get(indiceLenguaje).getLenguageID());
//            pelicula.setDuracionRenta(Integer.parseInt(vista.getjTDuracionAlquiler().getText()));
//            pelicula.setTarifaRenta(Integer.parseInt(vista.getjTtarifa().getText()));
//            pelicula.setLongitud(Integer.parseInt(vista.getjTduracion().getText()));
//            pelicula.setCostoReemplazo(Integer.parseInt(vista.getjTcostoRe().getText()));
//            System.err.println(""+vista.getjCBClasificacion().getSelectedItem());
//            //pelicula.setClasificacion(vista.getjCBClasificacion().getSelectedItem().toString());
//            pelicula.setUltimaActualizacion(Fecha.crearFechaTimeStamp());
//            pelicula.setCaracteristicasEspeciales("{"+vista.getjTcarateristicas().getText()+"}");
//            pelicula.setTextoCompleto(vista.getjTtextoCompleto().getText());

            //JOptionPane.showMessageDialog(null, " Mostrar"+ vista.getjTid_peli());//**********
            int actorID = 0;
            int indiceActor = 0;
            indiceActor = vista.getjCBactor().getSelectedIndex();
            actorID = listaActores.get(indiceActor).getActorID();

            int categoriaID = 0;
            int indiceCategoria = 0;
            indiceCategoria = vista.getjCBcategoria().getSelectedIndex();
            categoriaID = listaCategorias.get(indiceCategoria).getCategoriaId();

            int tamaño;
            tamaño = modelo.listadoPeliculas().size();

            //if (tamaño == 0) {
            int resultado = 0;
            //int resultado2 = 0;
            resultado = modelo.grabarPelicula(pelicula);

            // modelo.grabarPeliculaCategoria(categoriaID, pelicula.getPeliculaId());
            //modelo.grabarPeliculaActor(actorID, pelicula.getPeliculaId());
            if (resultado == 1) {
                vista.gestionMensajes("Registro Grabado con éxito",
                        "Confirmación", JOptionPane.INFORMATION_MESSAGE);

                ArrayList<Pelicula> listaPeliculas;
                listaPeliculas = modelo.listadoPeliculas();
                vista.cargarPeliculasTabla(listaPeliculas);

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

    private void actualizar() {

        /*
            Pelicula pelicula = new Pelicula();
             
            //Se configura los datos en el objeto programa de la clase
            //Pelicula
            //pelicula.setPeliculaId(vista.getjTid_peli());
            pelicula.setTitulo(vista.getjTtitulo().getText());                                          
            pelicula.setDescripcion(vista.gettAsinopsis().getText());                                          
            pelicula.setAnhoLanzamiento(Integer.parseInt(vista.getjTaño().getText()));
            pelicula.setLenguajeID(Integer.parseInt(vista.getjCBlenguaje().getSelectedIndex());
            pelicula.setDuracionRenta(Integer.parseInt(vista.getjTDuracionAlquiler().getText()));
            pelicula.setTarifaRenta(Integer.parseInt(vista.getjTtarifa()));
            pelicula.setLongitud(Integer.parseInt(vista.getjTduracion()));
            pelicula.setCostoReemplazo(Integer.parseInt(vista.getjTcostoRe()));
            pelicula.setClasificacion(vista.getjTclasificacion());
            pelicula.setCaracteristicasEspeciales(vista.getjTcarateristicas());
            pelicula.setTextoCompleto(vista.getjTtextoCompleto());
                    
                         
            if(modelo.modificarPelicula(pelicula) == 1){
                vista.gestionMensajes(
                        "Actualización exitosa",
                        "Confirmación ", 
                        JOptionPane.INFORMATION_MESSAGE);
                                        
                //vista.activarControles(false); 
                //vista.nuevoAction();
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
         */
    }

    public void delete() {

    }

}
