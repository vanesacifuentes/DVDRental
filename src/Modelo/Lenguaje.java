/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Se declaran atributos, el constructor sin parametros y los métodos get y set de la clase Lenguaje
 * Programadores : Cristhian Guzman, Juan Martinez, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : Lenguaje
 */
package Modelo;
import java.sql.Timestamp;

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
