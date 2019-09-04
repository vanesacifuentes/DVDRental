/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import  Servicios.*;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author vanes
 */
public class PeliculaDAO {
    
    /**
     * 
     * @param p Objeto de la clase Pelicula a grabar.
     * @return rtdo resultado de la operación grabar
     */
    public int grabarPelicula(Pelicula p){      
        
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO film values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1,1004);
            pstm.setString(2,"GS");
            pstm.setString(3,"FXZJSZ");
            pstm.setInt(4,2006);
            pstm.setInt(5,5);
            pstm.setInt(6,5);
            pstm.setInt(7,5);
            pstm.setInt(8,5);
            pstm.setDouble(9,5);
            pstm.setNull(10,Types.NULL);
            pstm.setTimestamp(11, Fecha.crearFechaTimeStamp());
            pstm.setNull(12,Types.NULL);
            pstm.setNull(13,Types.NULL);
            
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
     * @param p Objeto de la clase Pelicula a modificar
     * @return rtdo resultado de la operación modificar
     */
    public int modificarPelicula(Pelicula p){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE film " +
                         "SET film_id = ?, title = ?, description = ?, release_year = ?, language_id = ?, rental_duration = ?"
                    + "rental_rate = ?, length =?, replacement_cost= ?, rating= ?, last_update= ?, special_features= ?, fulltext= ? "
                    +    "WHERE film_id=?";

            pstm = con.prepareStatement(sql);   

            pstm.setInt(1,p.getPeliculaId());
            pstm.setString(2,p.getTitulo());
            pstm.setString(3,p.getDescripcion());
            pstm.setInt(4,p.getAnhoLanzamiento());
            pstm.setInt(5,p.getLenguajeID());
            pstm.setInt(6,p.getDuracionRenta());
            pstm.setInt(7,p.getTarifaRenta());
            pstm.setInt(8,p.getLongitud());
            pstm.setDouble(9,p.getCostoReemplazo());
            pstm.setString(10,p.getClasificacion());
            pstm.setTimestamp(11, p.getUltimaActualizacion());
            pstm.setString(12, p.getCaracteristicasEspeciales().toString());
            pstm.setString(13, p.getTextoCompleto());

            
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
     * @param codigo código de pelicula a borrar
     * @return rtdo resultado de la operación borrar
     */
    public int borrarPelicula(int film_id){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM film WHERE film_id = ? ";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, film_id);
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
     * @param film_id id de la pelicula a listar, 0 se listaran todos
     * @return ArrayList, lista de objetos Pelicula
     */
    public ArrayList <Pelicula> listadoPeliculas(){   
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        ArrayList<Pelicula> listadoPeliculas = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
           
                sql = "SELECT * FROM film ORDER BY film_id";            
            
                                   
            pstm = con.prepareStatement(sql);
            
           
            rs = pstm.executeQuery();
                        
            Pelicula pelicula = null;
            while(rs.next()){
                pelicula = new Pelicula();

                
                pelicula.setPeliculaId(rs.getInt("film_id"));
                pelicula.setTitulo(rs.getString("title"));
                //pelicula.setDescripcion(rs.getString("description"));
                pelicula.setAnhoLanzamiento(rs.getInt("release_year"));
                //pelicula.setLenguajeID(rs.getInt("language_id"));
                //pelicula.setDuracionRenta(rs.getInt("rental_duration"));
                //pelicula.setTarifaRenta(rs.getInt("rental_rate"));
                pelicula.setLongitud(rs.getInt("length"));
//                pelicula.setCostoReemplazo(rs.getDouble("replacement_cost"));
//                pelicula.setClasificacion(rs.getInt("rating"));
//                pelicula.setUltimaActualizacion(rs.getTimestamp("last_update"));
//                pelicula.setCaracteristicasEspeciales(rs.getString("special_features"));
//                pelicula.setTextoCompleto(rs.getString("fulltext"));
            
                listadoPeliculas.add(pelicula);
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
        return listadoPeliculas;
    }
    
    //Metodo para grabar película y categoria- Relacion tabla debil....
    public int grabarPeliculaCategoria(int categoriaID,int peliculaID){      
        
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO film_category values (?,?,?)";
            
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, peliculaID);
            pstm.setInt(2,categoriaID);
            pstm.setTimestamp(3, Fecha.crearFechaTimeStamp());
            
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
    
    
    public int grabarPeliculaActor(int actorID,int peliculaID)
    {
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO film_actor values (?,?,?)";
            
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, actorID);
            pstm.setInt(2,peliculaID);
            pstm.setTimestamp(3, Fecha.crearFechaTimeStamp());
            
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
    
//    **************
    
    

}
