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
import Servicios.Fecha;
/**
 *
 * @author vanes
 */
public class ClienteDAO {
     /* 
     * @param a Objeto de la clase Cliente a grabar
     * @return rtdo resultado de la operación grabar
     */
    int consecutivoID;

    public ClienteDAO() {
        
        
    }
    
    
    public int grabarCliente (Cliente c)
    {
        
        
        Connection con = null;
        PreparedStatement pstm;
        pstm= null;
        int rtdo;
        rtdo= 0;
        
        try{
            con =Fachada.getConnection();
            String sql = "INSERT INTO customer values(?,?,?,?,?,?,?,?,?,?)";
            
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, consecutivoID+1);
            pstm.setInt(2, 1);
            pstm.setString(3, "dkdod");
            pstm.setString(4, "jdkddk");
            pstm.setString(5, "adsda@dkdk"); 
            pstm.setInt(6, 5);
            pstm.setBoolean(7,true);
            pstm.setDate(8,Fecha.crearFechaDate());
            pstm.setTimestamp(9,Fecha.crearFechaTimeStamp());
            pstm.setInt(10, 1);                  
            
            rtdo = pstm.executeUpdate();
            
            
        }catch(SQLException ex){
            System.err.println(rtdo);
            JOptionPane.showMessageDialog(null,"Código "+
                    ex.getErrorCode() + "\n Error +++++" + ex.getMessage());
        }
        
        finally{
            try{
                if (pstm != null) pstm.close();
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, " Código : "+ 
                        ex.getErrorCode() + " \n Error ++++++: " + ex.getMessage());
            }
        }
        return rtdo;
    }
    
 
     /**
     * 
     * @param l Objeto de la clase Cliente a modificar
     * @return rtdo resultado de la operación modificar
     */
    public int modificarCliente(Cliente c){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE customer " +
                         "SET customer_id = ?, store_id= ?, first_name= ?, last_name = ?,email=?"
                    + "address_id=?, activebool=?, create_date=?,last_update=?, active=?"
                    +    "WHERE customer_id =?";

            pstm = con.prepareStatement(sql);   

            pstm.setInt(1, c.getClienteID());
            pstm.setInt(2, c.getTiendaIDCliente());
            pstm.setString(3, c.getNombreCliente());
            pstm.setString(4, c.getApellidoCliente());
            pstm.setString(5, c.getCorreoCliente());
            pstm.setInt(6, c.getDireccionCliente());
            pstm.setBoolean(7, c.isCuenta_activo());
            pstm.setDate(8,c.getFechaCreacion());
            pstm.setTimestamp(9,c.getUltimaActualizacionCliente());
            pstm.setInt(10, c.getActivo());

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
     * @param customer_id  código del cliente a borrar
     * @return rtdo resultado de la operación borrar
     */
    public int borrarCliente(int customer_id){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM customer WHERE customer_id = ? ";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, customer_id);
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
     * @param customer_id id del cliente a listar, 0 se listaran todos
     * @return ArrayList, lista de objetos Cliente
     */
    public ArrayList <Cliente> listadoCliente(){   
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        ArrayList<Cliente> listadoCliente = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
            
                sql = "SELECT * FROM customer ORDER BY customer_id";            
                                   
            pstm = con.prepareStatement(sql);
            
            
            rs = pstm.executeQuery();
                        
            Cliente cliente = null;
            while(rs.next()){
                cliente= new Cliente();
                
            cliente.setClienteID(rs.getInt("customer_id"));
            cliente.setTiendaIDCliente(rs.getInt("store_id"));
            cliente.setNombreCliente(rs.getString("first_name"));
            cliente.setApellidoCliente(rs.getString("last_name"));
            cliente.setCorreoCliente(rs.getString("email"));
            cliente.setDireccionCliente(rs.getInt("address_id"));
            cliente.setCuenta_activo(rs.getBoolean("activebool"));
            cliente.setFechaCreacion(rs.getDate("create_date"));
            cliente.setUltimaActualizacionCliente(rs.getTimestamp("last_update"));
            cliente.setActivo(rs.getInt("active"));
            
                listadoCliente.add(cliente);
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
        consecutivoID = listadoCliente.size();
        return listadoCliente;
    }  
}
