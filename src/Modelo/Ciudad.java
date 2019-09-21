/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Se declaran atributos, el constructor sin parametros y los métodos get y set de la clase Ciudad
 * Programadores : Cristhian Guzman, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : Ciudad
 */
package Modelo;

import java.sql.Timestamp;

/**
 *
 * @author vanes
 */
public class Ciudad {
    
    private int city_id;
    private String ciudad;
    private int pais_id;
    private Timestamp ultimaActualizacion;
    
    public Ciudad(){
        
    }
    
    public int getID_ciudad(){
        return city_id;
    }
    
    public String getCiudad(){
        return ciudad;
    }
    
    public int getPais_id(){
        return pais_id;
    }
    
    public Timestamp getUltimaActualizacion() {
        return ultimaActualizacion;
    }
    
    public void setID_ciudad(int val){
        this.city_id = val;
    }
    
    public void setCiudad(String val){
        this.ciudad = val;
    }
    
    public void setPais_id(int val){
        this.pais_id = val;
    }
    
    public void setUltimaActualizacion(Timestamp ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }
}
