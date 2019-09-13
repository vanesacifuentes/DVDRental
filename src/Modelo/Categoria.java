/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Se declaran atributos, el constructor sin parametros y los métodos get y set de la clase Categoria
 * Programadores : Cristhian Guzman, Juan Martinez, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : Categoria
 */
package Modelo;
import java.sql.Timestamp;

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

