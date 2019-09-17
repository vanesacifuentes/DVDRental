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
