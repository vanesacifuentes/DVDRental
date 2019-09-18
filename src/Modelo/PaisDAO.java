/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Modela el acceso a datos de la tabla country
 * Programadores : Cristhian Guzman, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : PaisDAO
 */
package Modelo;

import Servicios.Fachada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vanes
 */
public class PaisDAO {
     
    //Listar País
     public ArrayList <Pais> listaPaises(){   
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        ArrayList<Pais> listaPaises = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
           
                sql = "SELECT * FROM country ORDER BY country_id";            
            
                                   
            pstm = con.prepareStatement(sql);
            
           
            rs = pstm.executeQuery();
                        
            Pais pais_ = null;
            while(rs.next()){
                pais_ = new Pais();

                
                pais_.setPais_id(rs.getInt("country_id"));
                pais_.setPais(rs.getString("country"));
               pais_.setUltimaActualizacion(rs.getTimestamp("last_update"));
;
            
                listaPaises.add(pais_);
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
        return listaPaises;
    }
     
     
     //    //Grabar país
//    public int grabarPais(Pais pais_){      
//        
//        Connection con = null;
//        PreparedStatement pstm;
//        pstm = null;
//        int rtdo;
//        rtdo = 0;
//        try{
//            con = Fachada.getConnection();
//            String sql = "INSERT INTO country values (?,?,?)";
//            
//            pstm = con.prepareStatement(sql);
//            
//            pstm.setInt(1,pais_.getPais_id());
//            pstm.setString(2,pais_.getPais());
//            pstm.setTimestamp(3,pais_.getUltimaActualizacion());
//          
//            
//            rtdo = pstm.executeUpdate();  
//        }
//
//        catch(SQLException ex){
//            JOptionPane.showMessageDialog(null,"Código: " + 
//                        ex.getErrorCode() + "\nError :" + ex.getMessage());
//        }
//        
//        finally{
//            try{
//                if(pstm!=null) pstm.close();                
//            }
//            catch(SQLException ex){
//                JOptionPane.showMessageDialog(null,"Código : " + 
//                        ex.getErrorCode() + "\nError :" + ex.getMessage());
//            }
//        }
//        return rtdo;
//    }
//    
//    //Modificar País
//      public int modificarPais(Pais pais_){      
//        Connection con = null;
//        PreparedStatement pstm;
//        pstm = null;
//        int rtdo;
//        rtdo = 0;
//        try{
//            con = Fachada.getConnection();
//            String sql = "UPDATE country " +
//                         "SET country_id = ?, conutry = ?, last_update= ?"
//                    +    "WHERE coutry_id=?";
//
//            pstm = con.prepareStatement(sql);   
//
//            pstm.setInt(1,pais_.getPais_id());
//            pstm.setString(2,pais_.getPais());
//            pstm.setTimestamp(3,pais_.getUltimaActualizacion());
//           
//         
//            rtdo = pstm.executeUpdate();  
//        }
//        catch(SQLException ex){
//            JOptionPane.showMessageDialog(null,"Código : " + 
//                        ex.getErrorCode() + "\nError :" + ex.getMessage());
//        }
//        finally{
//            try{
//                if(pstm!=null) pstm.close();                
//            }
//            catch(SQLException ex){
//                JOptionPane.showMessageDialog(null,"Código : " + 
//                        ex.getErrorCode() + "\nError :" + ex.getMessage());
//            }
//        }
//        return rtdo;
//    }
//      
//      //Borrar País
//      public int borrarPais(int pais_id){      
//        Connection con = null;
//        PreparedStatement pstm = null;
//        int rtdo;
//        rtdo = 0;
//        try{
//            con = Fachada.getConnection();
//            String sql = "DELETE FROM film WHERE country_id = ? ";
//            pstm = con.prepareStatement(sql);
//            pstm.setInt(1, pais_id);
//            rtdo = pstm.executeUpdate(); 
//            return rtdo;
//        }
//        catch(SQLException ex){
//            JOptionPane.showMessageDialog(null,"Código : " + 
//                        ex.getErrorCode() + "\nError :" + ex.getMessage());
//        } 
//        finally{
//            try{
//                if(pstm!=null) pstm.close();                
//            }
//            catch(SQLException ex){
//                JOptionPane.showMessageDialog(null,"Código : " + 
//                        ex.getErrorCode() + "\nError :" + ex.getMessage());
//            }
//        }
//        return rtdo;
//    }
     
    
}
