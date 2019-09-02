/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author vanes
 */
public class Actor {
    
    private int actorID;
    private String nombreActor;
    private String apellidoActor;
    private String ultimaActializacionActor;

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

    public String getUltimaActializacionActor() {
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

    public void setUltimaActializacionActor(String ultimaActializacionActor) {
        this.ultimaActializacionActor = ultimaActializacionActor;
    }
       
}
