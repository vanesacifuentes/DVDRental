/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Establecer la conexión con la base de datos 
 * Programadores : Cristhian Guzman, Juan Martinez, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : Fachada
 */

package Servicios;
import java.sql.Connection;
import java.sql.*;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

public class Fachada {
    
    private static Connection con = null;
    
    //Método getConnection permite establecer la conexión con la base de datos
    public static Connection getConnection()
    {
        try{
            if (con == null)
            {
                Runtime.getRuntime().addShutdownHook(new MiShDwnHook());
                
                ResourceBundle rb = ResourceBundle.getBundle("Servicios.jdbc");
                String driver = rb.getString("driver");
                String url = rb.getString("url");
                String pwd = rb.getString("pwd");
                String usr = rb.getString("usr");
                
                Class.forName(driver);
                con = DriverManager.getConnection(url, usr, pwd);
            }        
            
            if (con != null){
                
            }
            
        }catch(ClassNotFoundException | SQLException ex)
        {
            
            JOptionPane.showMessageDialog(null, "Error: "+ ex.getMessage());
            
        } return con;
    }
    
    static class MiShDwnHook extends Thread{
        
        public void run (){
            try{
                Connection con = Fachada.getConnection();
                con.close();
            }
            catch(Exception ex){
                
                JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
            }
        }
    }
}
