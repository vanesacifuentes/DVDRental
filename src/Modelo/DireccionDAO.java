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
public class DireccionDAO {
    
    /* 
     * @param a Objeto de la clase Direccion a grabar
     * @return rtdo resultado de la operación grabar
     */    
    public int grabarDireccion (Direccion d)
    {
        Connection con = null;
        PreparedStatement pstm;
        pstm= null;
        int rtdo;
        rtdo= 0;
        
        try{
            con =Fachada.getConnection();
            String sql = "INSERT INTO address VALUES(?,?,?,?,?,?,?,?)";
            
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, d.getDireccionID());
            pstm.setString(2, d.getDireccion());
            pstm.setString(3, d.getDireccion2());
            pstm.setString(4, d.getDistrito());
            pstm.setInt(5, d.getCiudadID_direccion());
            pstm.setString(6, d.getCodigoPostal());
            pstm.setString(7, d.getTelefono());
            pstm.setTimestamp(8, d.getUltimaActualizacionDireccion());         
                                                         
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
     * @param l Objeto de la clase Direccion a modificar
     * @return rtdo resultado de la operación modificar
     */
    public int modificarDireccion(Direccion d){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE address " +
                         "SET address_id = ?, address= ?, address2= ?, district = ?, city_id=?"
                    + "postal_code=?, phone=?, last_update=?"
                    +    "WHERE address_id =?";

            pstm = con.prepareStatement(sql);   

            pstm.setInt(1, d.getDireccionID());
            pstm.setString(2, d.getDireccion());
            pstm.setString(3, d.getDireccion2());
            pstm.setString(4, d.getDistrito());
            pstm.setInt(5, d.getCiudadID_direccion());
            pstm.setString(6, d.getCodigoPostal());
            pstm.setString(7, d.getTelefono());
            pstm.setTimestamp(8, d.getUltimaActualizacionDireccion());

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
     * @param address_id  código de la direccion a borrar
     * @return rtdo resultado de la operación borrar
     */
    public int borrarDireccion (int address_id){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM address WHERE address_id = ? ";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, address_id);
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
     * @param address_id de direcciones a listar, 0 se listaran todos
     * @return ArrayList, lista de objetos Direccion
     */
    public ArrayList <Direccion> listadoDireccion(){   
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        ArrayList <Direccion> listadoDireccion = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
                  
                sql = "SELECT * FROM customer where address_id = ? "
                    + "ORDER BY address_id";      
                                   
            pstm = con.prepareStatement(sql);
 
            rs = pstm.executeQuery();
                        
            Direccion direccion = null;
            while(rs.next()){
                direccion= new Direccion();
                
            direccion.setDireccionID(rs.getInt("address_id"));
            direccion.setDireccion(rs.getString("address"));
            direccion.setDireccion2(rs.getString("address2"));
            direccion.setDistrito(rs.getString("district"));
            direccion.setCiudadID_direccion(rs.getInt("city_id"));
            direccion.setCodigoPostal(rs.getString("postal_code"));
            direccion.setTelefono(rs.getString("phone"));
            direccion.setUltimaActualizacionDireccion(rs.getTimestamp("last_update"));
                    
                listadoDireccion.add(direccion);
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
        return listadoDireccion;
    } 
    
}
