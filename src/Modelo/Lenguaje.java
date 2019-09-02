/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.Timestamp;
/**
 *
 * @author vanesa
 */
public class Lenguaje {
    
    private int lenguageID;
    private String nombreLenguaje;
    private Timestamp ultimaActualizacion;

    public Lenguaje() {
    }

    public int getLenguageID() {
        return lenguageID;
    }

    public String getNombreLenguaje() {
        return nombreLenguaje;
    }

    public Timestamp getUltimaActualizacion() {
        return ultimaActualizacion;
    }
    
    public void setLenguageID(int lenguageID) {
        this.lenguageID = lenguageID;
    }

    public void setNombreLenguaje(String nombre) {
        this.nombreLenguaje = nombre;
    }

    public void setUltimaActualizacion(Timestamp ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }   
}
