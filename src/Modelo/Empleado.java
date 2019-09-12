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
public class Empleado {
    
    private int empleadoID;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private int direccionID_Empleado;
    private String correoEmpleado; 
    private int tiendaID_Empleado;
    private boolean activo;
    private String nombreUsuarioEmpleado;
    private String contrasenaEmpleado; 
    private Timestamp ultima_Actualizacion_Empleado;
//    private ImageIcon fotoEmpleado;

    public Empleado(){
        
    }
    
    public int getEmpleadoID() {
        return empleadoID;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public int getDireccionID_Empleado() {
        return direccionID_Empleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public int getTiendaID_Empleado() {
        return tiendaID_Empleado;
    }

    public boolean isActivo() {
        return activo;
    }

    public String getNombreUsuarioEmpleado() {
        return nombreUsuarioEmpleado;
    }

    public String getContrasenaEmpleado() {
        return contrasenaEmpleado;
    }

    public Timestamp getUltima_Actualizacion_Empleado() {
        return ultima_Actualizacion_Empleado;
    }

    public void setEmpleadoID(int empleadoID) {
        this.empleadoID = empleadoID;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public void setDireccionID_Empleado(int direccionID_Empleado) {
        this.direccionID_Empleado = direccionID_Empleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public void setTiendaID_Empleado(int tiendaID_Empleado) {
        this.tiendaID_Empleado = tiendaID_Empleado;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setNombreUsuarioEmpleado(String nombreUsuarioEmpleado) {
        this.nombreUsuarioEmpleado = nombreUsuarioEmpleado;
    }

    public void setContrasenaEmpleado(String contrasenaEmpleado) {
        this.contrasenaEmpleado = contrasenaEmpleado;
    }

    public void setUltima_Actualizacion_Empleado(Timestamp ultima_Actualizacion_Empleado) {
        this.ultima_Actualizacion_Empleado = ultima_Actualizacion_Empleado;
    }  
    
}
