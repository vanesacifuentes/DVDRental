/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class CiudadDAO {
    
    //Método para grabar ciudad en la base de datos
    public int grabarCiudad(Ciudad ciudad){      
        
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO city values (?,?,?,?)";
            
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1,ciudad.getID_ciudad());
            pstm.setString(2,ciudad.getCiudad());
            pstm.setInt(3,ciudad.getPais_id());
            pstm.setTimestamp(4,ciudad.getUltimaActualizacion());
          
            
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
    
    //Modificar Ciudad
      public int modificarCiudad(Ciudad ciudad){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE city " +
                         "SET city_id = ?, city = ?,country_id = ?, last_update= ?"
                    +    "WHERE city_id=?";

            pstm = con.prepareStatement(sql);   

            pstm.setInt(1,ciudad.getID_ciudad());
            pstm.setString(2,ciudad.getCiudad());
            pstm.setInt(3,ciudad.getPais_id());
            pstm.setTimestamp(4,ciudad.getUltimaActualizacion());
           
         
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
      
      //Borrar ciudad
      public int borrarCiudad(int ciudad_id){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM film WHERE city_id = ? ";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, ciudad_id);
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
      
   //Listar ciudad   
   public ArrayList <Ciudad> listaCiudades(){   
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        ArrayList<Ciudad> listaCiudades = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
           
                sql = "SELECT * FROM city ORDER BY city_id";            
            
                                   
            pstm = con.prepareStatement(sql);
            
           
            rs = pstm.executeQuery();
                        
            Ciudad ciudad = null;
            while(rs.next()){
                ciudad = new Ciudad();

                ciudad.setID_ciudad(rs.getInt("city_id"));
                ciudad.setCiudad(rs.getString("city"));
                ciudad.setPais_id(rs.getInt("country_id"));
                ciudad.setUltimaActualizacion(rs.getTimestamp("last_update"));
;
            
                listaCiudades.add(ciudad);
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
        return listaCiudades;
    }
    
}
