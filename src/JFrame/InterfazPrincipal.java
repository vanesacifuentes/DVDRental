/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Interfaz Principal, permite realizar el llamado a los internal Frame e interactuar con el programa
 * Programadores : Cristhian Guzman, Juan Martinez, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : InterfazPrincipal
 */
package JFrame;
import Controlador.*;
import Modelo.*;
import InternalFrame.iFalquiler;
import InternalFrame.iFchatEmpleado;
import InternalFrame.iFcliente;
import InternalFrame.iFdevolucion;
import InternalFrame.iFempleado;
import InternalFrame.iFpelicula;
import Servicios.Fecha;
import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfazPrincipal
     */
    private Empleado empleadoUsuario;
    public InterfazPrincipal(Empleado empleadoUsuario) {
        
        this.empleadoUsuario = empleadoUsuario;
        initComponents();
      //  añadirPestañas();
        this.setLocationRelativeTo(null);
        
        Fecha fec = new Fecha();
        System.out.println(fec.crearFechaTimeStampEspecifico(ABORT, WIDTH, WIDTH));
        
     //   Shape form = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,27,27);
      //  AWTUtilities.setWindowShape(this, form);
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMtienda = new javax.swing.JMenu();
        jMalquilar = new javax.swing.JMenuItem();
        jMalquiladas = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        Devolucion = new javax.swing.JMenu();
        jMdevolver = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        Soporte = new javax.swing.JMenu();
        jMchat = new javax.swing.JMenuItem();
        jMsalir = new javax.swing.JMenuItem();
        Mantenimiento = new javax.swing.JMenu();
        jMpeliculas = new javax.swing.JMenuItem();
        jMclientes = new javax.swing.JMenuItem();
        jMemplados = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 670));

        jMenuBar1.setBackground(new java.awt.Color(238, 112, 82));
        jMenuBar1.setForeground(new java.awt.Color(238, 112, 82));

        jMtienda.setText("Alquiler");
        jMtienda.setActionCommand("sa");
        jMtienda.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N

        jMalquilar.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jMalquilar.setText("Alquilar película");
        jMalquilar.setToolTipText("");
        jMalquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMalquilarActionPerformed(evt);
            }
        });
        jMtienda.add(jMalquilar);

        jMalquiladas.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jMalquiladas.setText("Películas alquiladas");
        jMtienda.add(jMalquiladas);

        jMenuItem7.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jMenuItem7.setText("Salir");
        jMtienda.add(jMenuItem7);

        jMenuBar1.add(jMtienda);

        Devolucion.setText("Devolución");
        Devolucion.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N

        jMdevolver.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jMdevolver.setText("Realizar devolución");
        jMdevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMdevolverActionPerformed(evt);
            }
        });
        Devolucion.add(jMdevolver);

        jMenuItem10.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jMenuItem10.setText("Salir");
        Devolucion.add(jMenuItem10);

        jMenuBar1.add(Devolucion);

        Soporte.setText("Soporte");
        Soporte.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N

        jMchat.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jMchat.setText("Chat");
        jMchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMchatActionPerformed(evt);
            }
        });
        Soporte.add(jMchat);

        jMsalir.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jMsalir.setText("Salir");
        Soporte.add(jMsalir);

        jMenuBar1.add(Soporte);

        Mantenimiento.setText("Mantenimiento");
        Mantenimiento.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        Mantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoActionPerformed(evt);
            }
        });

        jMpeliculas.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jMpeliculas.setText("Películas");
        jMpeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMpeliculasActionPerformed(evt);
            }
        });
        Mantenimiento.add(jMpeliculas);

        jMclientes.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jMclientes.setText("Clientes");
        jMclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMclientesActionPerformed(evt);
            }
        });
        Mantenimiento.add(jMclientes);

        jMemplados.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jMemplados.setText("Empleados");
        jMemplados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMempladosActionPerformed(evt);
            }
        });
        Mantenimiento.add(jMemplados);

        jMenuItem8.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jMenuItem8.setText("Salir");
        Mantenimiento.add(jMenuItem8);

        jMenuBar1.add(Mantenimiento);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMalquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMalquilarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Grabar alquiler");
        iFalquiler alquilerView = new iFalquiler(empleadoUsuario);
        AlquilerDAO alquilerModel= new AlquilerDAO();
        
        ControllerAlquiler alquilerControl = new ControllerAlquiler(alquilerView, alquilerModel);
        
        jDesktopPane.add(alquilerView);
        alquilerView.setVisible(true);
    }//GEN-LAST:event_jMalquilarActionPerformed

    private void MantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoActionPerformed
       
          
    }//GEN-LAST:event_MantenimientoActionPerformed

    private void jMpeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMpeliculasActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Grabar pelicula");
        
        iFpelicula peliculaView = new iFpelicula();
        
        PeliculaDAO peliculaModel = new PeliculaDAO();
        ControllerPelicula PeliculaControl = new ControllerPelicula(peliculaView,peliculaModel);
        
        jDesktopPane.add(peliculaView);
        peliculaView.setVisible(true);
        
      
    }//GEN-LAST:event_jMpeliculasActionPerformed

    private void jMchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMchatActionPerformed
        // TODO add your handling code here:
        iFchatEmpleado chat = new iFchatEmpleado();
        jDesktopPane.add(chat);
        chat.setVisible(true); 
    }//GEN-LAST:event_jMchatActionPerformed

    private void jMclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMclientesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Grabar cliente");
        iFcliente clienteView = new iFcliente();
        
        ClienteDAO clienteModel = new ClienteDAO();
        ControllerCliente ClienteControl = new ControllerCliente(clienteView,clienteModel);
            
        
        jDesktopPane.add(clienteView);
        clienteView.setVisible(true);
    }//GEN-LAST:event_jMclientesActionPerformed

    private void jMdevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMdevolverActionPerformed
        // TODO add your handling code here:
        iFdevolucion devolver = new iFdevolucion();
        jDesktopPane.add(devolver);
        devolver.setVisible(true); 
    }//GEN-LAST:event_jMdevolverActionPerformed

    private void jMempladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMempladosActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "Grabar cliente");
        iFempleado empleadoView = new iFempleado();
        
        EmpleadoDAO empleadoModel = new EmpleadoDAO();
        ControllerEmpleado empleadoControl = new ControllerEmpleado(empleadoView,empleadoModel);
        
        jDesktopPane.add(empleadoView);
        empleadoView.setVisible(true); 
    }//GEN-LAST:event_jMempladosActionPerformed

    public Empleado getEmpleadoUsuario() {
        return empleadoUsuario;
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Empleado emplea = new Empleado();
                (new InterfazPrincipal(emplea)).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Devolucion;
    private javax.swing.JMenu Mantenimiento;
    private javax.swing.JMenu Soporte;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenuItem jMalquiladas;
    private javax.swing.JMenuItem jMalquilar;
    private javax.swing.JMenuItem jMchat;
    private javax.swing.JMenuItem jMclientes;
    private javax.swing.JMenuItem jMdevolver;
    private javax.swing.JMenuItem jMemplados;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMpeliculas;
    private javax.swing.JMenuItem jMsalir;
    private javax.swing.JMenu jMtienda;
    // End of variables declaration//GEN-END:variables
}
