/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Se declaran atributos, el constructor sin parametros y los métodos get y set de la clase Pais
 * Programadores : Cristhian Guzman, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : Pais
 */
package Modelo;

import java.sql.Timestamp;

/**
 *
 * @author vanes
 */
public class Pais {
    
    private int pais_id;
    private String pais;
    private Timestamp ultimaActualizacion;
    
    
    public Pais(){
        
    }
    
    public int getPais_id(){
        return pais_id;
    }
    
    public String getPais(){
        return pais;
    }
    
    public Timestamp getUltimaActualizacion() {
        return ultimaActualizacion;
    }
      
    public void setPais_id(int val){
        this.pais_id = val;
    }
    
    public void setPais(String val){
        this.pais = val;
    }
    
    public void setUltimaActualizacion(Timestamp ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }
}
