/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Servicios.Fachada;

/**
 *
 * @author vanes
 */
public class ActorDAO {
    
    /* 
     * @param a Objeto de la clase Actor a grabar
     * @return rtdo resultado de la operación grabar
     */
    
    public int grabarActor (Actor a)
    {
        Connection con = null;
        PreparedStatement pstm;
        pstm= null;
        int rtdo;
        rtdo= 0;
        
        try{
            con =Fachada.getConnection();
            String sql = "INSERT INTO actor (?,?,?,?)";
            
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, a.getActorID());
            pstm.setString(2,a.getNombreActor());
            pstm.setString(3, a.getApellidoActor());
            pstm.setTimestamp(4, a.getUltimaActializacionActor());
            
            rtdo = pstm.executeUpdate();
            
        }
        
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Código "+
                    ex.getErrorCode() + "\n Error" + ex.getMessage());
        }
        
        finally{
            try{
                if (pstm != null) pstm.close();
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, " Código : "+ 
                        ex.getErrorCode() + " \n Error : " + ex.getMessage());
            }
        }
        return rtdo;
    }
    
 
     /**
     * 
     * @param l Objeto de la clase Actor a modificar
     * @return rtdo resultado de la operación modificar
     */
    public int modificarActor(Actor a){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE actor " +
                         "SET actor_id = ?, first_name = ?, last_name= ?, last_update = ?"
                    +    "WHERE actor_id =?";

            pstm = con.prepareStatement(sql);   

            pstm.setInt(1, a.getActorID());
            pstm.setString(2,a.getNombreActor());
            pstm.setString(3, a.getApellidoActor());
            pstm.setTimestamp(4, a.getUltimaActializacionActor());

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
     * @param actor_id código del actor a borrar
     * @return rtdo resultado de la operación borrar
     */
    public int borrarActor(int actor_id){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM actor WHERE actor_id = ? ";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, actor_id);
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
    / * @return ArrayList, lista de objetos Actor
     */
    public ArrayList <Actor> listadoActores(){   
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        ArrayList <Actor> listadoActores = new ArrayList<>();
        try{
            con = Fachada.getConnection(); 
            String sql="";
            
            sql = "SELECT actor_id, first_name, last_name FROM actor ORDER BY actor_id";            
                                           
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();
                        
            Actor actor = null;
            while(rs.next()){
                actor = new Actor();
   
                actor.setActorID(rs.getInt("actor_id"));
                actor.setNombreActor(rs.getString("first_name"));
                actor.setApellidoActor(rs.getString("last_name"));
                //actor.setUltimaActializacionActor(rs.getString("last_update"));
    
                listadoActores.add(actor);
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
        return listadoActores;
    }    
    
}
