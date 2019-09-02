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
public class Pelicula {
    
    private int peliculaId;
    private String titulo;
    private String descripcion;
    private int anhoLanzamiento;
    private int lenguajeID;
    private int duracionRenta;
    private int tarifaRenta;
    private int longitud;
    private double costoReemplazo;
    private String clasificacion;
    private Timestamp ultimaActualizacion;

   
    private String caracteristicasEspeciales;
    private String textoCompleto; 

    public Pelicula() {
        
    }

    public int getPeliculaId() {
        return peliculaId;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getAnhoLanzamiento() {
        return anhoLanzamiento;
    }

    public int getLenguajeID() {
        return lenguajeID;
    }

    public int getDuracionRenta() {
        return duracionRenta;
    }

    public int getTarifaRenta() {
        return tarifaRenta;
    }

    public int getLongitud() {
        return longitud;
    }

    public double getCostoReemplazo() {
        return costoReemplazo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getCaracteristicasEspeciales() {
        return caracteristicasEspeciales;
    }

    public String getTextoCompleto() {
        return textoCompleto;
    }

    public void setPeliculaId(int peliculaId) {
        this.peliculaId = peliculaId;
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setAnhoLanzamiento(int anhoLanzamiento) {
        this.anhoLanzamiento = anhoLanzamiento;
    }

    public void setLenguajeID(int lenguajeID) {
        this.lenguajeID = lenguajeID;
    }

    public void setDuracionRenta(int duracionRenta) {
        this.duracionRenta = duracionRenta;
    }

    public void setTarifaRenta(int tarifaRenta) {
        this.tarifaRenta = tarifaRenta;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setCostoReemplazo(double costoReemplazo) {
        this.costoReemplazo = costoReemplazo;
    }

    public void setUltimaActualizacion(Timestamp ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }
    
    public Timestamp getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setCaracteristicasEspeciales(String caracteristicasEspeciales) {
        this.caracteristicasEspeciales = caracteristicasEspeciales;
    }

    public void setTextoCompleto(String textoCompleto) {
        this.textoCompleto = textoCompleto;
    }
}
