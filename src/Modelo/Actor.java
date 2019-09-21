/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Se declaran atributos, el constructor sin parametros y los métodos get y set de la clase Actor
 * Programadores : Cristhian Guzman, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : Actor
 */
package Modelo;
import java.sql.Timestamp;

public class Actor {
    
    private int actorID;
    private String nombreActor;
    private String apellidoActor;
    private Timestamp ultimaActializacionActor;

    public Actor() {
    }

    public int getActorID() {
        return actorID;
    }

    public String getNombreActor() {
        return nombreActor;
    }

    public String getApellidoActor() {
        return apellidoActor;
    }

    public Timestamp getUltimaActializacionActor() {
        return ultimaActializacionActor;
    }

    
    public void setActorID(int actorID) {
        this.actorID = actorID;
    }

    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    public void setApellidoActor(String apellidoActor) {
        this.apellidoActor = apellidoActor;
    }

    public void setUltimaActializacionActor(Timestamp ultimaActializacionActor) {
        this.ultimaActializacionActor = ultimaActializacionActor;
    }
       
}
