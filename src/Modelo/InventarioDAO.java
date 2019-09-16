/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Modela el acceso a datos de la tabla inventory
 * Programadores : Cristhian Guzman, Juan Martinez, Nathalia Riascos, Vanesa Cifuentes
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
    public ArrayList<Inventario> extraerInventario_IdPelicula(int idPelicula,String s) {
        ArrayList<Inventario> listadoInventario;
        listadoInventario = new ArrayList<>();

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            con = Fachada.getConnection();
            String sql = "";

            if (s.equals("todos")) {
                sql = "select * from inventory where film_id = '" + idPelicula + "' order by inventory_id";
            } else if(s.equals("disponibles")) {
                sql = "select * from inventory where status_rental = false and film_id = '" + idPelicula + "'";
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
    public void actualizarStatusRental(int inventario_id){   
     
       
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        int rtdo;
        rtdo = 0;
        
        Inventario inventario= null;
        
        try{
            
            con = Fachada.getConnection();
            
            String sql = " UPDATE inventory SET status_rental= 'true' WHERE inventory_id = '" + inventario_id + "'";
       
            pstm = con.prepareStatement(sql);       
            pstm.setInt(1, inventario_id);
    
            rtdo = pstm.executeUpdate();
              
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
        } 
        finally{
            try{
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
                 
        }
   
    }
        
}
