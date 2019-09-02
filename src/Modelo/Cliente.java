/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.Timestamp;
import java.sql.*;
/**
 *
 * @author vanes
 */
public class Cliente {
    
    private int clienteID;
    private int tiendaIDCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String correoCliente;
    private int direccionCliente;
    private boolean cuenta_activo;
    private java.sql.Date fechaCreacion;
    private Timestamp ultimaActualizacionCliente;
    private int activo;

    public Cliente() {
    }

    public int getClienteID() {
        return clienteID;
    }

    
    public int getTiendaIDCliente() {
        return tiendaIDCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public int getDireccionCliente() {
        return direccionCliente;
    }

    public boolean getCuentActivoBool() {
        return cuenta_activo;
    }

    public int getActivo() {
        return activo;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public void setTiendaIDCliente(int tiendaIDCliente) {
        this.tiendaIDCliente = tiendaIDCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public void setDireccionCliente(int direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public void setCuenta_activo(boolean cuenta_activo) {
        this.cuenta_activo = cuenta_activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public Date getFechaCreacion() {
        
        return fechaCreacion;
    }

    public Timestamp getUltimaActualizacionCliente() {
        return ultimaActualizacionCliente;
    }

    public void setFechaCreacion(java.sql.Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setUltimaActualizacionCliente(Timestamp ultimaActualizacionCliente) {
        this.ultimaActualizacionCliente = ultimaActualizacionCliente;
    }
    
    
    
    
}
