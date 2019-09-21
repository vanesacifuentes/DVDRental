/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Se declaran atributos, el constructor sin parametros y los métodos get y set de la clase Alquiler 
 * Programadores : Cristhian Guzman, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : Alquiler
 */

package Modelo;

import java.sql.Timestamp;

public class Alquiler {
    
        //Atributos
        private int IDalquiler;
        private Timestamp fechaAlquiler;
        private int IDInventario;
        private int IDCliente;
        private Timestamp fechaDevolucion;
        private int IDEmpleado;
        private Timestamp fechaUltimaActualizacion;
        private boolean statusRental;

    //Constructor
    public Alquiler() {
    }

    //Métodos get
    public int getIDalquiler() {
        return IDalquiler;
    }

    public Timestamp getFechaAlquiler() {
        return fechaAlquiler;
    }

    public int getIDInventario() {
        return IDInventario;
    }

    public int getIDCliente() {
        return IDCliente;
    }

    public Timestamp getFechaDevolucion() {
        return fechaDevolucion;
    }

    public int getIDEmpleado() {
        return IDEmpleado;
    }

    public Timestamp getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    //Métodos Set
    public void setIDalquiler(int IDalquiler) {
        this.IDalquiler = IDalquiler;
    }

    public void setFechaAlquiler(Timestamp fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public void setIDInventario(int IDInventario) {
        this.IDInventario = IDInventario;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public void setFechaDevolucion(Timestamp fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setIDEmpleado(int IDEmpleado) {
        this.IDEmpleado = IDEmpleado;
    }

    public void setFechaUltimaActualizacion(Timestamp fechaUltimaActualizacion) {
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
    }

    public boolean isStatusRental() {
        return statusRental;
    }

    public void setStatusRental(boolean statusRental) {
        this.statusRental = statusRental;
    }
    
    
}
