/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Modela el acceso a datos de la tabla rental
 * Programadores : Cristhian Guzman, Juan Martinez, Nathalia Riascos, Vanesa Cifuentes
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
            String sql = "INSERT INTO rental values (?,?,?,?,?,?,?)";
            
            pstm = con.prepareStatement(sql);
            
            
            
            pstm.setInt(1,a.getIDalquiler());
            pstm.setTimestamp(2, a.getFechaAlquiler());
            pstm.setInt(3,6);
            pstm.setInt(4,4);
            pstm.setTimestamp(5, a.getFechaDevolucion());
            pstm.setInt(6,1);
            pstm.setTimestamp(7, a.getFechaUltimaActualizacion());
            
//            pstm.setInt(1,a.getIDalquiler());
//            pstm.setTimestamp(2, a.getFechaAlquiler());
//            pstm.setInt(3,a.getIDInventario());
//            pstm.setInt(4,a.getIDCliente());
//            pstm.setTimestamp(5, a.getFechaDevolucion());
//            pstm.setInt(6,a.getIDEmpleado());
//            pstm.setTimestamp(7, a.getFechaUltimaActualizacion());
                
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

}
