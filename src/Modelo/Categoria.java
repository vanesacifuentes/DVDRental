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
public class Categoria {
    
    private int categoriaId;
    private String nombreCategoria; 
    private Timestamp ultimaActualizacion;

    public Categoria() {
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public Timestamp getUltimaActualizacion() {
        return ultimaActualizacion;
    }
    

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public void setNombreCategoria(String nombre) {
        this.nombreCategoria = nombre;
    }

    public void setUltimaActualizacion(Timestamp ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }

    
}

