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
public class EmpleadoDAO {
    
    /* 
     * @param e Objeto de la clase Empleado a grabar
     * @return rtdo resultado de la operación grabar
     */
    
    public int grabarEmpleado (Empleado e)
    {
        Connection con = null;
        PreparedStatement pstm;
        pstm= null;
        int rtdo;
        rtdo= 0;
        
        try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO staff (?,?,?,?,?,?,?,?,?,?,?)";
            
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, e.getEmpleadoID());
            pstm.setString(2,e.getNombreEmpleado());
            pstm.setString(3, e.getApellidoEmpleado());
            pstm.setInt(4, e.getDireccionID_Empleado());
            pstm.setString(5,e.getCorreoEmpleado());
            pstm.setInt(6, e.getTiendaID_Empleado());
            pstm.setBoolean(7, e.isActivo());
            pstm.setString(8, e.getNombreUsuarioEmpleado());
            pstm.setString(9, e.getContrasenaEmpleado());
            pstm.setTimestamp(10,e.getUltima_Actualizacion_Empleado());
            //11 fotoEmpleado;      
            
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
     * @param l Objeto de la clase Empleado a modificar
     * @return rtdo resultado de la operación modificar
     */
    public int modificarEmpleado(Empleado e){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE staff " +
                         "SET staff_id = ?, first_name = ?, last_name= ?, address_id = ?, email = ?, "
                    + "store_id = ?, active = ?, username =?, password =?, last_update=?, picture=? "
                    +    "WHERE staff_id =?";

            pstm = con.prepareStatement(sql);   

            pstm.setInt(1, e.getEmpleadoID());
            pstm.setString(2,e.getNombreEmpleado());
            pstm.setString(3, e.getApellidoEmpleado());
            pstm.setInt(4, e.getDireccionID_Empleado());
            pstm.setString(5,e.getCorreoEmpleado());
            pstm.setInt(6, e.getTiendaID_Empleado());
            pstm.setBoolean(7, e.isActivo());
            pstm.setString(8, e.getNombreUsuarioEmpleado());
            pstm.setString(9, e.getContrasenaEmpleado());
            pstm.setTimestamp(10,e.getUltima_Actualizacion_Empleado());
            //11 fotoEmpleado; 

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
     * @param staff_id código del empleado a borrar
     * @return rtdo resultado de la operación borrar
     */
    public int borrarEmpleado(int staff_id){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM staff WHERE staff_id = ? ";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, staff_id);
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
     * @param staff_id id del empleado a listar, 0 se listaran todos
     * @return ArrayList, lista de objetos Empleado
     */
    public ArrayList <Empleado> listadoEmpleado(int staff_id){   
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        ArrayList<Empleado> listadoEmpleado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
            if(staff_id == 0){
                sql = "SELECT * FROM staff ORDER BY staff_id";            
            }else{
                sql = "SELECT * FROM staff where staff_id = ? "
                    + "ORDER BY staff_id";      
            }                        
            pstm = con.prepareStatement(sql);
            
            if(staff_id != 0){
                pstm.setInt(1, staff_id);
            }
            
            rs = pstm.executeQuery();
                        
            Empleado empleado = null;
            while(rs.next()){
                empleado = new Empleado();

            empleado.setEmpleadoID(rs.getInt("staff_id"));
            empleado.setNombreEmpleado(rs.getString("first_name"));
            empleado.setApellidoEmpleado(rs.getString("last_name"));
            empleado.setDireccionID_Empleado(rs.getInt("address_id"));
            empleado.setCorreoEmpleado(rs.getString("email"));
            empleado.setTiendaID_Empleado(rs.getInt("store_id"));
            empleado.setActivo(rs.getBoolean("active"));
            empleado.setNombreUsuarioEmpleado(rs.getString("username"));
            empleado.setContrasenaEmpleado(rs.getString("password"));
            empleado.setUltima_Actualizacion_Empleado(rs.getTimestamp("last_update"));
            //fotoEmpleado ("picture");

                listadoEmpleado.add(empleado);
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
        return listadoEmpleado;
    }    
    
}
