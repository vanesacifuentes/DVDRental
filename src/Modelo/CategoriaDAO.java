/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Modela el acceso a datos de la tabla category
 * Programadores : Cristhian Guzman, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : CategoriaDAO
 */
package Modelo;
import Servicios.Fachada;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.Timestamp;

public class CategoriaDAO {
    
     /**
     * 
     * @param c Objeto de la clase Categoria a grabar
     * @return rtdo resultado de la operación grabar
     */
    public int grabarCategoria(Categoria c){      
        
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO category values (?,?,?)";
            
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, c.getCategoriaId());
            pstm.setString(2,c.getNombreCategoria());
            pstm.setTimestamp(3, c.getUltimaActualizacion());
            
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
     * 
     * @param c Objeto de la clase Categoria a modificar
     * @return rtdo resultado de la operación modificar
     */
    public int modificarCategoria(Categoria c){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE category " +
                         "SET category_id = ?, name = ?, last_update = ? "
                    +    "WHERE category_id=?";

            pstm = con.prepareStatement(sql);   

            pstm.setInt(1,c.getCategoriaId());
            pstm.setString(2, c.getNombreCategoria());
            pstm.setTimestamp(3, c.getUltimaActualizacion());
            pstm.setInt(4,c.getCategoriaId());
           
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
     * 
     * @param codigo código de categoria a borrar
     * @return rtdo resultado de la operación borrar
     */
    public int borrarCategoria(int category_id){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM category WHERE category_id = ? ";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, category_id);
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
     * @param category_id id de la categoria a listar, 0 se listaran todos
     * @return ArrayList, lista de objetos Categoria
     */
    public ArrayList <Categoria> listadoCateogoria(){   
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        ArrayList<Categoria> listadoCategorias = new ArrayList<>();
        try{
            con = Fachada.getConnection(); 
            String sql="";
            

            
                           
                 
            sql = "SELECT * FROM category ORDER BY category_id";                      
            pstm = con.prepareStatement(sql);
            
                     
                                  
            pstm = con.prepareStatement(sql);

            
            rs = pstm.executeQuery();
                        
            Categoria categoria = null;
            while(rs.next()){
                categoria = new Categoria();

                categoria.setCategoriaId(rs.getInt("category_id"));
                categoria.setNombreCategoria(rs.getString("name"));
                categoria.setUltimaActualizacion(rs.getTimestamp("last_update"));
               
                listadoCategorias.add(categoria);
            }
        }
        
        catch(SQLException ex){
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
        return listadoCategorias;
    }    
    
}
