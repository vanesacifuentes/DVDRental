/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Modela el acceso a datos de la tabla store
 * Programadores : Cristhian Guzman, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : TiendaDAO
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Servicios.Fachada;

public class TiendaDAO {

    /* 
     * @param a Objeto de la clase Tienda a grabar
     * @return rtdo resultado de la operación grabar
     */
    public int grabarTienda(Tienda t) {
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;

        try {
            con = Fachada.getConnection();
            String sql = "INSERT INTO store values (?,?,?,?)";

            pstm = con.prepareStatement(sql);

            pstm.setInt(1, t.getTiendaID());
            pstm.setInt(2, t.getGerenteTienda());
            pstm.setInt(3, t.getDireccionTienda());
            pstm.setTimestamp(4, t.getUltimaActualizacionTienda());

            rtdo = pstm.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código "
                    + ex.getErrorCode() + "\n Error" + ex.getMessage());
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, " Código : "
                        + ex.getErrorCode() + " \n Error : " + ex.getMessage());
            }
        }
        return rtdo;
    }

    /**
     *
     * @param l Objeto de la clase Tienda a modificar
     * @return rtdo resultado de la operación modificar
     */
    public int modificarTienda(Tienda t) {
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try {
            con = Fachada.getConnection();
            String sql = "UPDATE store "
                    + "SET store_id = ?, manager_staff_id = ?, address_id= ?, last_update = ?"
                    + "WHERE store_id =?";

            pstm = con.prepareStatement(sql);

            pstm.setInt(1, t.getTiendaID());
            pstm.setInt(2, t.getGerenteTienda());
            pstm.setInt(3, t.getDireccionTienda());
            pstm.setTimestamp(4, t.getUltimaActualizacionTienda());

            rtdo = pstm.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Código : "
                        + ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return rtdo;
    }

    /**
     *
     * @param tienda_id código de la tienda a borrar
     * @return rtdo resultado de la operación borrar
     */
    public int borrarTienda(int store_id) {
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try {
            con = Fachada.getConnection();
            String sql = "DELETE FROM store WHERE store_id = ? ";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, store_id);
            rtdo = pstm.executeUpdate();
            return rtdo;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Código : "
                        + ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return rtdo;
    }

    /**
     *
     * / * @return ArrayList, lista de objetos Tienda
     */
    public ArrayList<Tienda> listadoTiendas() {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        ArrayList<Tienda> listadoTienda = new ArrayList<>();
        try {
            con = Fachada.getConnection();
            String sql = "";

            sql = "select * from store";

            pstm = con.prepareStatement(sql);

            rs = pstm.executeQuery();

            Tienda tienda = null;
            while (rs.next()) {
                tienda = new Tienda();
                
                tienda.setTiendaID(rs.getInt("store_id"));
                tienda.setGerenteTienda(rs.getInt("manager_staff_id"));
                tienda.setDireccionTienda(rs.getInt("address_id"));
                tienda.setUltimaActualizacionTienda(rs.getTimestamp("last_update"));
                        
                listadoTienda.add(tienda);
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
        
       System.out.println("Imprima algo" +listadoTienda.get(0).getTiendaID());
       System.out.println("Imprima algo" +listadoTienda.get(1).getTiendaID());
        return listadoTienda;
    }
}
