/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author nicol
 */

public class DatosEnvio implements Serializable{
    
    private String nick,mensaje,nick_empleado;//Este ultimo nick es temporal
    
    public DatosEnvio(){
        
    }
    
    public String getNick(){
        return nick;
    }
    
    public void setNick(String val){
        this.nick = val;    
    }
    
    public String getNick_empleado(){
        return nick_empleado;
    }
    
    public void setNick_empleado(String val){
        this.nick_empleado = val;    
    }
   
   
    public String getMensaje(){
        return mensaje;
    }
    
    public void setMensaje(String val){
        this.mensaje = val;    
    }
}
