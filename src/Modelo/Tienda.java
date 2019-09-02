/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.Timestamp;
/**
 *
 * @author vanes
 */
public class Tienda {
    
    private int tiendaID; 
    private int gerenteTienda; 
    private int direccionTienda; 
    private Timestamp ultimaActualizacionTienda; 

    public int getTiendaID() {
        return tiendaID;
    }

    public int getGerenteTienda() {
        return gerenteTienda;
    }

    public int getDireccionTienda() {
        return direccionTienda;
    }

    public Timestamp getUltimaActualizacionTienda() {
        return ultimaActualizacionTienda;
    }

    public void setTiendaID(int tiendaID) {
        this.tiendaID = tiendaID;
    }

    public void setGerenteTienda(int gerenteTienda) {
        this.gerenteTienda = gerenteTienda;
    }

    public void setDireccionTienda(int direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    public void setUltimaActualizacionTienda(Timestamp ultimaActualizacionTienda) {
        this.ultimaActualizacionTienda = ultimaActualizacionTienda;
    }    
    
    
}
