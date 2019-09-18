/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Modela el acceso a datos de la tabla Rental
 * Programadores : Cristhian Guzman, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : ControllerAlquiler..
 */
package Controlador;

import InternalFrame.iFalquiler;
import InternalFrame.iFdevolucion;
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
    private iFalquiler vistaAlquiler;
    private iFdevolucion vistaDevolucion;
    private AlquilerDAO modelo;
    private Pelicula peliculaSelected;
    private Cliente clienteSelected;
    //private Inventario inventarioSelected;
    private ArrayList<Inventario> listaInventario_PelDisp;
    private Empleado empleadoUsuario;
    private int cantidadpeliculaDisponibles;
    //private ArrayList <Pelicula> listadoPelicula;

    ListenerAlquiler escucha = new ListenerAlquiler();

    public ControllerAlquiler(iFalquiler vista, AlquilerDAO modelo) {

        this.vistaAlquiler = vista;
        this.modelo = modelo;

        empleadoUsuario = this.vistaAlquiler.getEmpleadoUsuario();
        PeliculaDAO modelPelicula = new PeliculaDAO();

        //Se carga en el JList la informacion proveniente de la base de datos
        this.vistaAlquiler.getjTBuscadorPelicula().addKeyListener(escucha);
        this.vistaAlquiler.getjListBusquedaPeliculas().addMouseListener(escucha);

        this.vistaAlquiler.getjTBuscarCliente().addKeyListener(escucha);
        this.vistaAlquiler.getjListClienteID().addMouseListener(escucha);

        this.vistaAlquiler.getjBAlquilar().addActionListener(escucha);

    }

    public void ControllerAlquiler(iFdevolucion vista, AlquilerDAO modelo) {
        vistaDevolucion = vista;
        this.modelo = modelo;
        vistaDevolucion.getjBdevolucion().addActionListener(escucha);
        vistaDevolucion.getjBbuscarRenta().addActionListener(escucha);

    }

    public class ListenerAlquiler implements ActionListener, MouseListener, KeyListener {

        //@Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == vistaAlquiler.getjBAlquilar()) {
                if (listaInventario_PelDisp.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Pelicula No disponible en esta Tienda");
                } else {

                    registrar();
                    modelo.modificarStatus_rental_inventory(Integer.parseInt(vistaAlquiler.getjTIDAlquiler().getText()), true);
                }
            } else if (ae.getSource() == vistaAlquiler.getjBmodificar()) {
                //actualizar();
            } else if (ae.getSource() == vistaDevolucion.getjBdevolucion()) {
                actualizarRenta(Integer.parseInt(vistaDevolucion.getjTBuscadorRenta().getText()), false);
                //JOptionPane.showMessageDialog(null, Integer.parseInt(vistaDevolucion.getjTBuscadorRenta().getText())+"a");

            } else if (ae.getSource() == vistaDevolucion.getjBbuscarRenta()) {
                try {
                    vistaDevolucion.cargarInfoAlquiler(modelo.extraerInfoAlquiler(Integer.parseInt(vistaDevolucion.getjTBuscadorRenta().getText())));
                } catch (NumberFormatException a) {
                    JOptionPane.showMessageDialog(null, "Debe Ingresar el Numero de Renta");

                }

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

            if (ke.getSource() == vistaAlquiler.getjTBuscadorPelicula()) {

                PeliculaDAO modelPelicula = new PeliculaDAO();
                String buscar = vistaAlquiler.getjTBuscadorPelicula().getText().trim();
                vistaAlquiler.cargarPeliculasLista(modelPelicula.buscarPeliculas(formatoString(buscar), "allInfo"));

            } else if (ke.getSource() == vistaAlquiler.getjTBuscarCliente()) {

                ClienteDAO modelCliente = new ClienteDAO();
                String buscar = vistaAlquiler.getjTBuscarCliente().getText().trim();
                vistaAlquiler.cargarClientesLista(modelCliente.buscarCliente(formatoString(buscar)));
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

            if (me.getSource() == vistaAlquiler.getjListBusquedaPeliculas()) {

                int indice = vistaAlquiler.getjListBusquedaPeliculas().getSelectedIndex();

                PeliculaDAO modelPelicula = new PeliculaDAO();
                ArrayList<Pelicula> p;
                p = modelPelicula.buscarPeliculas(vistaAlquiler.getModeloBuscarPeliculas().getElementAt(indice).toString(), "allInfo");
                peliculaSelected = p.get(0);
                vistaAlquiler.getjTBuscadorPelicula().setText(vistaAlquiler.getModeloBuscarPeliculas().getElementAt(indice).toString());
                vistaAlquiler.getModeloBuscarPeliculas().removeAllElements();

                ArrayList<Inventario> listaInventario;
                InventarioDAO inventarioModel = new InventarioDAO();
                listaInventario = inventarioModel.extraerInventario_IdPelicula(peliculaSelected.getPeliculaId(), "todos", empleadoUsuario.getTiendaID_Empleado());

                listaInventario_PelDisp = inventarioModel.extraerInventario_IdPelicula(peliculaSelected.getPeliculaId(),
                         "disponibles", empleadoUsuario.getTiendaID_Empleado());

                vistaAlquiler.getjLTitulo().setText(peliculaSelected.getTitulo());
                vistaAlquiler.getjLPrecio().setText("" + peliculaSelected.getTarifaRenta() + " $US");
                vistaAlquiler.getjTAreaSinopsis().setText("" + peliculaSelected.getDescripcion());
                vistaAlquiler.getjLCantTotalnum().setText("" + listaInventario.size());
                vistaAlquiler.getjLCantidadDisponum().setText("" + listaInventario_PelDisp.size());

            } else if (me.getSource() == vistaAlquiler.getjListClienteID()) {

                //Obtener el id del cliente
                ClienteDAO modelCliente = new ClienteDAO();

                int indice = vistaAlquiler.getjListClienteID().getSelectedIndex();
                ArrayList<Cliente> c;
                c = modelCliente.buscarCliente(vistaAlquiler.getModeloBuscarCliente().getElementAt(indice).toString());
                clienteSelected = c.get(0);
                vistaAlquiler.getjLNombreCliente().setText(clienteSelected.getNombreCliente() + " " + clienteSelected.getApellidoCliente());
                vistaAlquiler.getjLIDCliente().setText("" + clienteSelected.getClienteID());
                vistaAlquiler.getjTBuscarCliente().setText(vistaAlquiler.getModeloBuscarCliente().getElementAt(indice).toString());
                vistaAlquiler.getModeloBuscarCliente().removeAllElements();
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

        if (vistaAlquiler.getjTIDAlquiler().equals("")) {
            vistaAlquiler.gestionMensajes("Ingrese el código",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);
            /*else if (vista.getNivel().trim().
                           equals("Seleccionar ...")){
                   vista.gestionMensajes("Seleccione un nivel",
                           "Error de Entrada", JOptionPane.ERROR_MESSAGE );  */
        } else {
            Alquiler alquiler = new Alquiler();

            alquiler.setIDalquiler(Integer.parseInt(vistaAlquiler.getjTIDAlquiler().getText()));
            alquiler.setFechaAlquiler(Fecha.crearFechaTimeStamp());
            alquiler.setIDInventario(listaInventario_PelDisp.get(0).getInventarioID());
            alquiler.setIDCliente(clienteSelected.getClienteID());

            Date date = vistaAlquiler.getjDateChooserDev().getDate();
            Timestamp times = new Timestamp(date.getTime());

            alquiler.setFechaDevolucion(times);
            alquiler.setIDEmpleado(empleadoUsuario.getEmpleadoID());
            alquiler.setFechaUltimaActualizacion(Fecha.crearFechaTimeStamp());
            alquiler.setStatusRental(true);

            int resultado;
            resultado = modelo.grabarAlquiler(alquiler);

            if (resultado == 1) {
                vistaAlquiler.gestionMensajes("Registro Grabado con éxito",
                        "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                // InventarioDAO inventarioModel = new InventarioDAO();
                // listaInventario_PelDisp = inventarioModel.extraerInventario_IdPelicula(peliculaSelected.getPeliculaId(), "disponibles", empleadoUsuario.getTiendaID_Empleado());

                //   ArrayList<Alquiler> listaalquiler;
            } else {
                vistaAlquiler.gestionMensajes("Error al grabar",
                        "Confirmación", JOptionPane.ERROR_MESSAGE);
            }

            vistaAlquiler.gestionMensajes("Codigo ya está registrado",
                    "Confirmación",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actualizarRenta(int idRenta, boolean b) {

        if (modelo.modificarStatus_rental_inventory(idRenta, b) == 1) {
            modelo.modificarStatus_rental_Rental(idRenta, b);
            vistaAlquiler.gestionMensajes(
                    "Actualización exitosa",
                    "Confirmación ",
                    JOptionPane.INFORMATION_MESSAGE);

        } else {
            vistaAlquiler.gestionMensajes(
                    "Actualización Falida",
                    "Confirmación ",
                    JOptionPane.ERROR_MESSAGE);
        }

    }
}
