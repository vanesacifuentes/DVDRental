/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Se declaran atributos, el constructor sin parametros y los métodos get y set de la clase Tienda
 * Programadores : Cristhian Guzman, Juan Martinez, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : Tienda
 */
package Modelo;
import java.sql.Timestamp;

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
