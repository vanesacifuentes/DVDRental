/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Modela el acceso a datos de la tabla inventory
 * Programadores : Cristhian Guzman, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : InventarioDAO
 */
package Modelo;

import Servicios.Fachada;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InventarioDAO {

    /**
     *
     * @param inventory_id id del inventario a listar, 0 se listaran todos
     * @return ArrayList, lista de objetos Inventario
     */
    //extrae una lista de inventarios dado el id de una pelicula y filtrado de acuerdo a la tienda (sede) que pertenece
    public ArrayList<Inventario> extraerInventario_IdPelicula(int idPelicula, String s, int store_id) {
        ArrayList<Inventario> listadoInventario;
        listadoInventario = new ArrayList<>();

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            con = Fachada.getConnection();
            String sql = "";

            if (s.equals("todos")) {
                sql = "select * from inventory where film_id = '" + idPelicula + "' and"
                        + " store_id = '" + store_id + "' order by inventory_id";
            } else if (s.equals("disponibles")) {
                sql = "select * from inventory where status_rental = false and film_id = '" + idPelicula + "' and"
                        + " store_id = '" + store_id + "' order by inventory_id";
            }
            pstm = con.prepareStatement(sql);

            rs = pstm.executeQuery();

            Inventario inventario = null;
            while (rs.next()) {
                inventario = new Inventario();

                inventario.setInventarioID(rs.getInt("inventory_id"));
                inventario.setPeliculaID_inventario(rs.getInt("film_id"));
                inventario.setTiendaID(rs.getInt("store_id"));
                inventario.setUltimaActualizacion(rs.getTimestamp("last_update"));
                inventario.setStatus(rs.getString("status"));

                listadoInventario.add(inventario);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "uisjdkv cas ");
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Código : "
                        + ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return listadoInventario;

    }

    public ArrayList<Inventario> listadoInventario(int inventory_id) {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        ArrayList<Inventario> listadoInventario = new ArrayList<>();
        try {
            con = Fachada.getConnection();
            String sql = "";
            if (inventory_id == 0) {
                sql = "SELECT * FROM inventory ORDER BY inventory_id";
            } else {
                sql = "SELECT * FROM inventory where inventory_id = ? "
                        + "ORDER BY inventory_id";
            }
            pstm = con.prepareStatement(sql);

            if (inventory_id != 0) {
                pstm.setInt(1, inventory_id);
            }

            rs = pstm.executeQuery();

            Inventario inventario = null;
            while (rs.next()) {
                inventario = new Inventario();

                inventario.setInventarioID(rs.getInt("inventario_id"));
                inventario.setPeliculaID_inventario(rs.getInt("film_id"));
                inventario.setPeliculaID_inventario(rs.getInt("store_id"));
                inventario.setUltimaActualizacion(rs.getTimestamp("last_update"));

                listadoInventario.add(inventario);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Código : "
                        + ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return listadoInventario;
    }

    //Metodo para cambiar estado de inventario de true a false //
    
    

    public ArrayList<ArrayList> extraerinfoListaAlquiler() {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        ArrayList<ArrayList> listadoAlquiler = new ArrayList<>();
        try {
            con = Fachada.getConnection();
            String sql = "";

            sql
                    = "SELECT "
                    + "rental.rental_id, "
                    + "inventory.inventory_id, "
                    + "film.title, "
                    + "customer.first_name, "
                    + "customer.last_name, "
                    + "address.address, "
                    + "address.phone, "
                    + "film.rental_rate, "
                    + "rental.return_date "
                    + "FROM "
                    + "public.film, "
                    + "public.rental, "
                    + "public.inventory, "
                    + "public.customer, "
                    + "public.address "
                    + "WHERE "
                    + "rental.inventory_id = inventory.inventory_id AND "
                    + "rental.customer_id = customer.customer_id AND "
                    + "inventory.film_id = film.film_id AND "
                    + "customer.address_id = address.address_id AND "
                    + "rental.status_rental = 'true';";

            pstm = con.prepareStatement(sql);

            rs = pstm.executeQuery();

            //Inventario inventario = null;
            while (rs.next()) {
//                inventario = new Inventario();
//
//                inventario.setInventarioID(rs.getInt("inventario_id"));
//                inventario.setPeliculaID_inventario(rs.getInt("film_id"));
//                inventario.setPeliculaID_inventario(rs.getInt("store_id"));
//                inventario.setUltimaActualizacion(rs.getTimestamp("last_update"));
                ArrayList registros = new ArrayList();
                registros.add(rs.getInt("rental_id"));
                registros.add(rs.getInt("inventory_id"));
                registros.add(rs.getString("title"));
                registros.add(rs.getString("first_name"));
                registros.add(rs.getString("last_name"));
                registros.add(rs.getString("phone"));
                registros.add(rs.getString("address"));
                registros.add(rs.getDouble("rental_rate"));
                registros.add(rs.getTimestamp("return_date"));
                
                //registros.add(rs.getBoolean("status_rental"));

                listadoAlquiler.add(registros);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Código : "
                        + ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return listadoAlquiler;

    }

}
