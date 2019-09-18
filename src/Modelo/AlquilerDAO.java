/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Modela el acceso a datos de la tabla rental
 * Programadores : Cristhian Guzman, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : AlquilerDAO
 */

package Modelo;
import Servicios.Fachada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AlquilerDAO {
    
     /**
     * Metodo grabar Alquiler
     * @param a Objeto de la clase Alquiler a grabar.
     * @return rtdo resultado de la operación grabar
     */
    public int grabarAlquiler(Alquiler a){      
        
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO rental values (?,?,?,?,?,?,?,?)";
            
            pstm = con.prepareStatement(sql);
            
            
            
//            pstm.setInt(1,a.getIDalquiler());
//            pstm.setTimestamp(2, a.getFechaAlquiler());
//            pstm.setInt(3,6);
//            pstm.setInt(4,4);
//            //pstm.setNull(5,Types.NULL);
//            pstm.setTimestamp(5, a.getFechaDevolucion());
//            pstm.setInt(6,1);
//            pstm.setTimestamp(7, a.getFechaUltimaActualizacion());
            
            pstm.setInt(1,a.getIDalquiler());
            pstm.setTimestamp(2, a.getFechaAlquiler());
            pstm.setInt(3,a.getIDInventario());
            pstm.setInt(4,a.getIDCliente());
            pstm.setTimestamp(5, a.getFechaDevolucion());
            pstm.setInt(6,a.getIDEmpleado());
            pstm.setTimestamp(7, a.getFechaUltimaActualizacion());
            pstm.setBoolean(8, a.isStatusRental());
                
            rtdo = pstm.executeUpdate();  
        }

        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Código: " + 
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
        return rtdo;
    }
   
    
    
     /**
     * Método modificarAlquiler
     * @param p Objeto de la clase Alquiler a modificar
     * @return rtdo resultado de la operación modificar
     */
    
    
    public int modificarStatus_rental_inventory(int idRenta,boolean b)
    {
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            
            
            
            String sql =  "UPDATE inventory "
                          +"SET status_rental = ? "
                          + "WHERE inventory_id = "
                          + "(select inventory_id from rental where rental_id = ? )";
                    
         

            pstm = con.prepareStatement(sql);   

            pstm.setBoolean(1,b);
            pstm.setInt(2,idRenta);
            
  
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
        return rtdo;
    }
    
    public int modificarStatus_rental_Rental(int idRenta,boolean b)
    {
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            
            
            
            String sql =  "UPDATE rental "
                          +"SET status_rental = ? "
                          +"WHERE rental_id = ?";
                         
                    
         

            pstm = con.prepareStatement(sql);   

            pstm.setBoolean(1,b);
            pstm.setInt(2,idRenta);
            
  
            rtdo = pstm.executeUpdate();  
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
            JOptionPane.showMessageDialog(null, "XD");
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
        return rtdo;
    }
    
    public int modificarAlquiler(Alquiler a){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE rental " +
                         "SET rental_id = ?, rental_date = ?, inventory_id = ?, customer_id = ?, return_date = ?, "
                    + "staff_id =?, last_update = ?"
                    +    "WHERE rental_id=?";

            pstm = con.prepareStatement(sql);   

            pstm.setInt(1,a.getIDalquiler());
            pstm.setTimestamp(2, a.getFechaAlquiler());
            pstm.setInt(3,a.getIDInventario());
            pstm.setInt(4,a.getIDCliente());
            pstm.setTimestamp(5, a.getFechaDevolucion());
            pstm.setInt(6,a.getIDEmpleado());
            pstm.setTimestamp(7, a.getFechaUltimaActualizacion());
  
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
        return rtdo;
    }
            
    /**
     * Método Borrar Alquiler
     * @param rental_idcódigo de alquiler a borrar
     * @return rtdo resultado de la operación borrar
     */
    public int borrarAlquiler(int rental_id){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM rental WHERE rental_id = ? ";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, rental_id);
            rtdo = pstm.executeUpdate(); 
            return rtdo;
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
        return rtdo;
    }
   
    
    /**
     * 
     * @param rental_id id del alquiler a listar, 0 se listaran todos
     * @return ArrayList, lista de objetos Alquiler
     */
    public ArrayList <Alquiler> listadoAlquiler(){   
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        ArrayList<Alquiler> listadoAlquiler = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
           
                sql = "SELECT * FROM rental ORDER BY rental_id";            
            
                                   
            pstm = con.prepareStatement(sql);
            
           
            rs = pstm.executeQuery();
                        
            Alquiler alquiler = null;
            while(rs.next()){
                alquiler = new Alquiler();

                alquiler.setIDalquiler(rs.getInt("rental_id"));
                alquiler.setFechaAlquiler(rs.getTimestamp("rental_date"));
                alquiler.setIDInventario(rs.getInt("inventory_id"));
                alquiler.setIDCliente(rs.getInt("customer_id"));
                alquiler.setFechaDevolucion(rs.getTimestamp("return_date"));
                alquiler.setIDEmpleado(rs.getInt("staff_id"));
                alquiler.setFechaUltimaActualizacion(rs.getTimestamp("last_date"));
                        
                listadoAlquiler.add(alquiler);
            }
        }
        
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "uisjdkv cas ");
            JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        finally{
            try{
                if(rs!=null) rs.close();
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return listadoAlquiler;
    }
    
    public ArrayList extraerInfoAlquiler(int idRenta)
    {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        ArrayList registros = new ArrayList();
        try {
            con = Fachada.getConnection();
            String sql = "";

            sql
                    = "SELECT "      
                    + "film.title, "
                    + "customer.first_name, "
                    + "customer.last_name, "
                    + "film.rental_rate, "
                    + "rental.return_date, "
                    + "customer.customer_id "
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
                    + "rental.status_rental = 'true' AND "
                    + "rental.rental_id = ?";

            
            pstm = con.prepareStatement(sql);

            pstm.setInt(1, idRenta);
            rs = pstm.executeQuery();

            //Inventario inventario = null;
            while (rs.next()) {
//                inventario = new Inventario();
//
//                inventario.setInventarioID(rs.getInt("inventario_id"));
//                inventario.setPeliculaID_inventario(rs.getInt("film_id"));
//                inventario.setPeliculaID_inventario(rs.getInt("store_id"));
//                inventario.setUltimaActualizacion(rs.getTimestamp("last_update"));
                
                registros.add(rs.getString("title"));
                registros.add(rs.getString("first_name"));
                registros.add(rs.getString("last_name"));
                registros.add(rs.getDouble("rental_rate"));
                registros.add(rs.getTimestamp("return_date"));
                registros.add(rs.getInt("customer_id"));
                
                
                //registros.add(rs.getBoolean("status_rental"));

               
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
        return registros;
        
    }
    

    


}
