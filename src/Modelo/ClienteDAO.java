/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Modela el acceso a datos de la tabla customer
 * Programadores : Cristhian Guzman, Juan Martinez, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : ClienteDAO
 */
package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Servicios.Fachada;


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
            
            pstm.setInt(1, c.getClienteID());
            pstm.setInt(2, c.getTiendaIDCliente());
            pstm.setString(3, c.getNombreCliente());
            pstm.setString(4, c.getApellidoCliente());
            pstm.setString(5, c.getCorreoCliente());
            pstm.setInt(6, c.getDireccionCliente());
            pstm.setBoolean(7, c.getCuentActivoBool());
            pstm.setDate(8,c.getFechaCreacion());
            pstm.setTimestamp(9,c.getUltimaActualizacionCliente());
            pstm.setInt(10, c.getActivo());                
            
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
                         "SET  first_name= ?, last_name = ?,email=?"
                    + "address_id=?, active=?"
                    +    "WHERE customer_id =?";

            pstm = con.prepareStatement(sql);   

            pstm.setInt(1, c.getClienteID());
            //pstm.setInt(2, c.getTiendaIDCliente());
            pstm.setString(3, c.getNombreCliente());
            pstm.setString(4, c.getApellidoCliente());
            pstm.setString(5, c.getCorreoCliente());
            pstm.setInt(6, c.getDireccionCliente());
            //pstm.setBoolean(7, c.getCuentActivoBool());
            //pstm.setDate(8,c.getFechaCreacion());
            //pstm.setTimestamp(9,c.getUltimaActualizacionCliente());
            //pstm.setInt(10, c.getActivo());

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
    
    //Metodo para realizar la busqueda por el id del cliente
    public ArrayList <Cliente> buscarCliente(String nombreCliente){   
        ArrayList<Cliente> listadoClientes = new ArrayList<>();
        if(nombreCliente.equals("")){
            
        }else
        {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        
        try{
            con = Fachada.getConnection();
            String sql="";
            
           //JOptionPane.showMessageDialog(null, texto);
               // sql = "select * from film where title like" + "'"+texto+"%'";   
               //String filtro = ""+texto+"%";
               
               //sql = "select * from customer where upper ('"+%codigoCliente%'") like ?";
               
                sql = "select * from customer where first_name like '"+nombreCliente+"%'";
               // sql = "select * from film where title like "+'"'filtro+'"';      
             
            pstm = con.prepareStatement(sql);
            
           
            rs = pstm.executeQuery();
                        
            Cliente cliente = null;
            while(rs.next()){
                cliente = new Cliente();
    
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
            
                listadoClientes.add(cliente);
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
        return listadoClientes;
        
        }
        return listadoClientes;
    }
    
    
}
