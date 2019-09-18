/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Establecer y/o fecha en formato Timestamp y Date
 * Programadores : Cristhian Guzman, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : Fachada
 */
package Servicios;

import java.sql.Timestamp;
import java.util.Calendar;
import java.sql.Date;
import java.util.GregorianCalendar;


public class Fecha {

    public static Timestamp crearFechaTimeStamp() {

        Calendar calendar = Calendar.getInstance();
        java.util.Date now = calendar.getTime();
        Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
        return currentTimestamp;

    }
    
    public static java.sql.Date crearFechaDate()
    {
        long time = System.currentTimeMillis();
        Date fecha = new Date(time);
        
        
        return fecha;
    }

    public static Timestamp crearFechaTimeStampEspecifico(int año,int mes,int dia)
    {
        Calendar calendar = Calendar.getInstance();
        java.util.Date now;
        calendar.set(año,mes-1,dia,0,0,0);
        now = calendar.getTime();
        Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
        return currentTimestamp;
    }
}
