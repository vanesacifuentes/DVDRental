/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.sql.Timestamp;
import java.util.Calendar;
import java.sql.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
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
