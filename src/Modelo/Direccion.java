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
public class Direccion {
    
    private int direccionID;
    private String direccion;
    private String direccion2;
    private String distrito;
    private int ciudadID_direccion;
    private String codigoPostal;
    private String telefono;
   private Timestamp ultimaActualizacionDireccion;

    public Direccion() {
    }

    public int getDireccionID() {
        return direccionID;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public String getDistrito() {
        return distrito;
    }

    public int getCiudadID_direccion() {
        return ciudadID_direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public Timestamp getUltimaActualizacionDireccion() {
        return ultimaActualizacionDireccion;
    }

    public void setDireccionID(int direccionID) {
        this.direccionID = direccionID;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public void setCiudadID_direccion(int ciudadID_direccion) {
        this.ciudadID_direccion = ciudadID_direccion;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setUltimaActualizacionDireccion(Timestamp ultimaActualizacionDireccion) {
        this.ultimaActualizacionDireccion = ultimaActualizacionDireccion;
    }
   
   
   
   
    
}
