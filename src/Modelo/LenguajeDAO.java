/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Modela el acceso a datos de la tabla language
 * Programadores : Cristhian Guzman, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : LenguajeDAO
 */
package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Servicios.Fachada;

public class LenguajeDAO {
    
    /**
     * 
     * @param l Objeto de la clase Lenguaje a grabar
     * @return rtdo resultado de la operación grabar
     */
    public int grabarLenguaje(Lenguaje l){      
        
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO language values (?,?,?)";
            
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, l.getLenguageID());
            pstm.setString(2,l.getNombreLenguaje());
            pstm.setTimestamp(3, l.getUltimaActualizacion());
            
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
     * @param l Objeto de la clase Lenguaje a modificar
     * @return rtdo resultado de la operación modificar
     */
    public int modificarLenguaje(Lenguaje l){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE language " +
                         "SET language_id = ?, name = ?, last_update = ? "
                    +    "WHERE language_id=?";

            pstm = con.prepareStatement(sql);   

            pstm.setInt(1,l.getLenguageID());
            pstm.setString(2, l.getNombreLenguaje());
            pstm.setTimestamp(3, l.getUltimaActualizacion());
            pstm.setInt(4,l.getLenguageID());
             
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
     * @param codigo código de lenguaje a borrar
     * @return rtdo resultado de la operación borrar
     */
    public int borrarLenguaje(int language_id){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM language WHERE language_id = ? ";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, language_id);
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
     * @return ArrayList, lista de objetos Lenguaje
     */
    public ArrayList <Lenguaje> listadoLenguajes(){   
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        ArrayList <Lenguaje> listadoLenguaje = new ArrayList<>();
        try{
            con = Fachada.getConnection(); 
            String sql="";
            

            sql = "SELECT * FROM language ORDER BY language_id";            
                 
                                  
            pstm = con.prepareStatement(sql);
            
            
            rs = pstm.executeQuery();
                        
            Lenguaje lenguaje = null;
            while(rs.next()){
                lenguaje = new Lenguaje();

                
                lenguaje.setLenguageID(rs.getInt("language_id"));
                lenguaje.setNombreLenguaje(rs.getString("name"));           
                lenguaje.setUltimaActualizacion(rs.getTimestamp("last_update"));
                listadoLenguaje.add(lenguaje);
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
        return listadoLenguaje;
    }    
    
}
