/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Modela el acceso a datos de la tabla Rental
 * Programadores : Cristhian Guzman, Juan Martinez, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : ControllerAlquiler
 */
package Controlador;

import InternalFrame.iFalquiler;
import Modelo.Alquiler;
import Modelo.AlquilerDAO;
import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Empleado;
import Modelo.Inventario;
import Modelo.InventarioDAO;
import Modelo.Pelicula;
import Modelo.PeliculaDAO;
import Servicios.Fecha;
import static com.oracle.jrockit.jfr.ContentType.Timestamp;
import com.toedter.calendar.JTextFieldDateEditor;
import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.Date;
import java.sql.Timestamp;


public class ControllerAlquiler {

    int valor;
    private iFalquiler vista;
    private AlquilerDAO modelo;
    private Pelicula peliculaSelected;
    private Cliente clienteSelected;
    //private Inventario inventarioSelected;
    private ArrayList<Inventario> listaInventario_PelDisp;
    private Empleado empleadoUsuario;
    private int cantidadpeliculaDisponibles;
    //private ArrayList <Pelicula> listadoPelicula;

    public ControllerAlquiler(iFalquiler vista, AlquilerDAO modelo) {

        this.vista = vista;
        this.modelo = modelo;

        empleadoUsuario = this.vista.getEmpleadoUsuario();
        PeliculaDAO modelPelicula = new PeliculaDAO();

        //Se carga en el JList la informacion proveniente de la base de datos
        ListenerAlquiler escucha = new ListenerAlquiler();
        this.vista.getjTBuscadorPelicula().addKeyListener(escucha);
        this.vista.getjListBusquedaPeliculas().addMouseListener(escucha);

        this.vista.getjTBuscarCliente().addKeyListener(escucha);
        this.vista.getjListClienteID().addMouseListener(escucha);

        this.vista.getjBAlquilar().addActionListener(escucha);

    }

    public class ListenerAlquiler implements ActionListener, MouseListener, KeyListener {

        //@Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == vista.getjBAlquilar()) {
                if (listaInventario_PelDisp.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Pelicula No disponible en esta Tienda");
                } else {

                    InventarioDAO inventarioModel = new InventarioDAO();
                    
                    registrar();
                    inventarioModel.actualizarStatusRental(listaInventario_PelDisp.get(0).getInventarioID());
                }
            } else if (ae.getSource() == vista.getjBmodificar()) {
                //actualizar();
            }
        }

        @Override
        public void keyTyped(KeyEvent ke) {

        }

        @Override
        public void keyPressed(KeyEvent ke) {

        }

        @Override
        public void keyReleased(KeyEvent ke) {

            if (ke.getSource() == vista.getjTBuscadorPelicula()) {

                PeliculaDAO modelPelicula = new PeliculaDAO();
                String buscar = vista.getjTBuscadorPelicula().getText().trim();
                vista.cargarPeliculasLista(modelPelicula.buscarPeliculas(formatoString(buscar), "allInfo"));

            } else if (ke.getSource() == vista.getjTBuscarCliente()) {

                ClienteDAO modelCliente = new ClienteDAO();
                String buscar = vista.getjTBuscarCliente().getText().trim();
                vista.cargarClientesLista(modelCliente.buscarCliente(formatoString(buscar)));
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

            if (me.getSource() == vista.getjListBusquedaPeliculas()) {

                
                
               
                int indice = vista.getjListBusquedaPeliculas().getSelectedIndex();
                
                
                PeliculaDAO modelPelicula = new PeliculaDAO(); 
                ArrayList<Pelicula> p;
                p = modelPelicula.buscarPeliculas(vista.getModeloBuscarPeliculas().getElementAt(indice).toString(), "allInfo");
                peliculaSelected = p.get(0);
                vista.getjTBuscadorPelicula().setText(vista.getModeloBuscarPeliculas().getElementAt(indice).toString());
                vista.getModeloBuscarPeliculas().removeAllElements();

                ArrayList<Inventario> listaInventario;
                InventarioDAO inventarioModel = new InventarioDAO();
                listaInventario = inventarioModel.extraerInventario_IdPelicula(peliculaSelected.getPeliculaId(), "todos", empleadoUsuario.getTiendaID_Empleado());

                listaInventario_PelDisp = inventarioModel.extraerInventario_IdPelicula(peliculaSelected.getPeliculaId()
                        , "disponibles", empleadoUsuario.getTiendaID_Empleado());

                vista.getjLTitulo().setText(peliculaSelected.getTitulo());
                vista.getjLPrecio().setText("" + peliculaSelected.getTarifaRenta() + " $US");
                vista.getjTAreaSinopsis().setText("" + peliculaSelected.getDescripcion());
                vista.getjLCantTotalnum().setText("" + listaInventario.size());
                vista.getjLCantidadDisponum().setText("" + listaInventario_PelDisp.size());

            } else if (me.getSource() == vista.getjListClienteID()) {

                //Obtener el id del cliente
                ClienteDAO modelCliente = new ClienteDAO();

                int indice = vista.getjListClienteID().getSelectedIndex();
                ArrayList<Cliente> c;
                c = modelCliente.buscarCliente(vista.getModeloBuscarCliente().getElementAt(indice).toString());
                clienteSelected = c.get(0);
                vista.getjLNombreCliente().setText(clienteSelected.getNombreCliente() + " " + clienteSelected.getApellidoCliente());
                vista.getjLIDCliente().setText("" + clienteSelected.getClienteID());
                vista.getjTBuscarCliente().setText(vista.getModeloBuscarCliente().getElementAt(indice).toString());
                vista.getModeloBuscarCliente().removeAllElements();
            }

        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }

        public String formatoString(String text) {
            if (text.equals("")) {
                return text;
            } else {
                String PrimeraLetra, allText;
                PrimeraLetra = text.substring(0, 1).toUpperCase();
                allText = text.substring(1).toLowerCase();
                return PrimeraLetra + allText;
            }

        }

    }

    public void registrar() {

        if (vista.getjTIDAlquiler().equals("")) {
            vista.gestionMensajes("Ingrese el código",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);
            /*else if (vista.getNivel().trim().
                           equals("Seleccionar ...")){
                   vista.gestionMensajes("Seleccione un nivel",
                           "Error de Entrada", JOptionPane.ERROR_MESSAGE );  */
        } else {
            Alquiler alquiler = new Alquiler();

            alquiler.setIDalquiler(Integer.parseInt(vista.getjTIDAlquiler().getText()));
            alquiler.setFechaAlquiler(Fecha.crearFechaTimeStamp());
            alquiler.setIDInventario(listaInventario_PelDisp.get(0).getInventarioID());
            alquiler.setIDCliente(clienteSelected.getClienteID());

            Date date = vista.getjDateChooserDev().getDate();
            Timestamp times = new Timestamp(date.getTime());

            alquiler.setFechaDevolucion(times);
            alquiler.setIDEmpleado(empleadoUsuario.getEmpleadoID());
            alquiler.setFechaUltimaActualizacion(Fecha.crearFechaTimeStamp());
            alquiler.setStatusRental(true);

            int resultado;
            resultado = modelo.grabarAlquiler(alquiler);

            if (resultado == 1) {
                vista.gestionMensajes("Registro Grabado con éxito",
                        "Confirmación", JOptionPane.INFORMATION_MESSAGE);     
                InventarioDAO inventarioModel = new InventarioDAO();
                listaInventario_PelDisp = inventarioModel.extraerInventario_IdPelicula(peliculaSelected.getPeliculaId(), "todos", empleadoUsuario.getTiendaID_Empleado());
                

                //   ArrayList<Alquiler> listaalquiler;
            } else {
                vista.gestionMensajes("Error al grabar",
                        "Confirmación", JOptionPane.ERROR_MESSAGE);
            }

            vista.gestionMensajes("Codigo ya está registrado",
                    "Confirmación",
                    JOptionPane.ERROR_MESSAGE);
        }

    }
}
