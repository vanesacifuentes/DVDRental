/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Modela el acceso a datos de la tabla Rental
 * Programadores : Cristhian Guzman, Juan Martinez, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : ControllerAlquiler
 */
package Controlador;

import InternalFrame.iFalquiler;
import Modelo.AlquilerDAO;
import Modelo.ClienteDAO;
import Modelo.Pelicula;
import Modelo.PeliculaDAO;
import java.util.ArrayList;
import java.awt.event.*;


public class ControllerAlquiler {
    
    private iFalquiler vista;
    private AlquilerDAO modelo;
    private Pelicula peliculaSelected;
    //private ArrayList <Pelicula> listadoPelicula;

    public ControllerAlquiler(iFalquiler vista, AlquilerDAO modelo) {
        
        this.vista = vista;
        this.modelo = modelo;
        
        PeliculaDAO modelPelicula = new PeliculaDAO();
        
       //Se carga en el JList la informacion proveniente de la base de datos
 
       ListenerAlquiler escucha = new ListenerAlquiler();
       this.vista.getjTBuscador().addKeyListener(escucha);
       this.vista.getjListBusquedaPeliculas().addKeyListener(escucha);
       
       this.vista.getjTBuscarCliente().addKeyListener(escucha);
       this.vista.getjListBusquedaPeliculas().addMouseListener(escucha);
        
        
    }
    
    public class ListenerAlquiler implements MouseListener, KeyListener{
        

        

        @Override
        public void keyTyped(KeyEvent ke) {
            
            
        }

        @Override
        public void keyPressed(KeyEvent ke) {
            
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            
            if(ke.getSource() == vista.getjTBuscador()){
            
            PeliculaDAO modelPelicula = new PeliculaDAO();
            String buscar = vista.getjTBuscador().getText().trim();
            vista.cargarPeliculasLista(modelPelicula.buscarPeliculas(formatoString(buscar)));
            
            }else{   
            ClienteDAO modelCliente = new ClienteDAO();
            String buscar = vista.getjTBuscarCliente().getText().trim();
            vista.cargarClientesLista(modelCliente.buscarCliente(buscar));
        }
        }

        @Override
        public void mouseClicked(MouseEvent me) {
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            
            //if (me.getSource() == vista.getjTBuscador()){
            PeliculaDAO modelPelicula = new PeliculaDAO();
            int indice = vista.getjListBusquedaPeliculas().getSelectedIndex();
            ArrayList<Pelicula> p;
            p = modelPelicula.buscarPeliculas(vista.getModelo().getElementAt(indice).toString());
            Pelicula peliculaSelected = p.get(0);
            vista.getjTIDPelicula().setText(""+peliculaSelected.getPeliculaId());
            vista.getjTPrecio().setText(""+peliculaSelected.getTarifaRenta());
            vista.getjTxTitulo().setText(peliculaSelected.getTitulo());
            vista.getjTDuracion().setText(""+peliculaSelected.getLongitud());
            
//            }else{
//                
//            }    
            

        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }

        public String formatoString(String text){
            String PrimeraLetra,allText;
            PrimeraLetra = text.substring(0, 1).toUpperCase();
            allText = text.substring(1).toLowerCase();
            return PrimeraLetra+allText;
        }

}
    
    
    
    
    
}
