/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Ingreso Login
 * Programadores : Cristhian Guzman, Juan Martinez, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : ControllerLoguin
 */
package Controlador;

import JFrame.Login;
import Modelo.EmpleadoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControllerLogin {

    private Login vista;
    private EmpleadoDAO modelo;

    public ControllerLogin(Login vista, EmpleadoDAO modelo) {

        this.vista = vista;
        this.modelo = modelo;

        ListenerLogin escucha = new ListenerLogin();
        this.vista.addListenerBtnEntrar(escucha);
    }

    //Construccion clase ListenerLogin para manejar los eventos
    public class ListenerLogin implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == vista.getjBEntrar()) {
                
                JOptionPane.showMessageDialog(null, "Prueba loguin");
                 entrarTiendaDVD();
            }
        }
    }

    public void entrarTiendaDVD() {
        JOptionPane.showMessageDialog(null, "Entra a metodo");



    }
}

