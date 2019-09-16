/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;



//import com.sun.awt.AWTUtilities;
import Controlador.ControllerInterfaz;
import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author nicol
 */
public class Login extends javax.swing.JFrame {
    
   // private static Login jf = null;
     //ArrayList<JPanel> paneles  = new ArrayList();
    /**
     * Creates new form Login
     */
    
    //EmpleadoDAO empleadoModel= new EmpleadoDAO();
    public Login() {
        initComponents();  
     
       
        jPregistro.setVisible(false);
        this.setLocationRelativeTo(null);
       // Shape form = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,27,27);
        //AWTUtilities.setWindowShape(this, form);
    }
    
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLMinimizar = new javax.swing.JLabel();
        JlCerrar = new javax.swing.JLabel();
        JPingreso = new javax.swing.JPanel();
        JLcontraseña = new javax.swing.JLabel();
        JLUsuario = new javax.swing.JLabel();
        jTusuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JPContraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        JBNoCuenta = new javax.swing.JButton();
        jBEntrar = new javax.swing.JButton();
        JPImagenRegis = new javax.swing.JPanel();
        JPImagen1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPregistro = new javax.swing.JPanel();
        jLregistro = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jLapellidos = new javax.swing.JLabel();
        jLcorreo = new javax.swing.JLabel();
        jLdireccion = new javax.swing.JLabel();
        jLtelefono = new javax.swing.JLabel();
        jLpais = new javax.swing.JLabel();
        jTciudad = new javax.swing.JTextField();
        JTNombre = new javax.swing.JTextField();
        jTApellidos = new javax.swing.JTextField();
        jTcorreo = new javax.swing.JTextField();
        jTdireccion = new javax.swing.JTextField();
        jTpais = new javax.swing.JTextField();
        jTtelefono = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        JLMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLMinimizarMouseClicked(evt);
            }
        });
        getContentPane().add(JLMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 10, 40, -1));

        JlCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px.png"))); // NOI18N
        JlCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JlCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(JlCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(862, 10, 30, -1));

        JPingreso.setBackground(new java.awt.Color(255, 255, 255));
        JPingreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        JPingreso.setForeground(new java.awt.Color(255, 255, 255));
        JPingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLcontraseña.setBackground(new java.awt.Color(238, 112, 82));
        JLcontraseña.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        JLcontraseña.setForeground(new java.awt.Color(238, 112, 82));
        JLcontraseña.setText("Contraseña:");
        JPingreso.add(JLcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 130, -1));

        JLUsuario.setBackground(new java.awt.Color(238, 112, 82));
        JLUsuario.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        JLUsuario.setForeground(new java.awt.Color(238, 112, 82));
        JLUsuario.setText("Usuario:");
        JPingreso.add(JLUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, -1));

        jTusuario.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTusuario.setForeground(new java.awt.Color(153, 153, 153));
        jTusuario.setText("Ingrese su usuario...");
        jTusuario.setBorder(null);
        jTusuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTusuarioFocusGained(evt);
            }
        });
        JPingreso.add(jTusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 170, 30));

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        JPingreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, 16));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        JPingreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 200, 10));

        JPContraseña.setBorder(null);
        JPingreso.add(JPContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 200, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User.png"))); // NOI18N
        JPingreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 100, 100));

        JBNoCuenta.setBackground(new java.awt.Color(255, 99, 71));
        JBNoCuenta.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        JBNoCuenta.setForeground(new java.awt.Color(255, 99, 71));
        JBNoCuenta.setText("¿No tiene una cuenta?");
        JBNoCuenta.setToolTipText("");
        JBNoCuenta.setBorder(null);
        JBNoCuenta.setContentAreaFilled(false);
        JBNoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNoCuentaActionPerformed(evt);
            }
        });
        JPingreso.add(JBNoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, 30));

        jBEntrar.setBackground(new java.awt.Color(238, 112, 82));
        jBEntrar.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jBEntrar.setForeground(new java.awt.Color(238, 112, 82));
        jBEntrar.setText("Entrar");
        jBEntrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBEntrar.setContentAreaFilled(false);
        jBEntrar.setDefaultCapable(false);
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });
        JPingreso.add(jBEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 100, 40));

        getContentPane().add(JPingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 510));

        JPImagenRegis.setBackground(new java.awt.Color(255, 255, 255));
        JPImagenRegis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPImagen1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo3.jpg"))); // NOI18N
        JPImagen1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 510));

        JPImagenRegis.add(JPImagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 510));

        jPregistro.setBackground(new java.awt.Color(255, 255, 255));
        jPregistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLregistro.setBackground(new java.awt.Color(238, 112, 82));
        jLregistro.setFont(new java.awt.Font("Decker", 1, 28)); // NOI18N
        jLregistro.setForeground(new java.awt.Color(238, 112, 82));
        jLregistro.setText("Registro");
        jPregistro.add(jLregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLnombre.setBackground(new java.awt.Color(238, 112, 82));
        jLnombre.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLnombre.setForeground(new java.awt.Color(51, 51, 51));
        jLnombre.setText("Nombre:");
        jPregistro.add(jLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 188, -1, 30));

        jLapellidos.setBackground(new java.awt.Color(238, 112, 82));
        jLapellidos.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLapellidos.setForeground(new java.awt.Color(51, 51, 51));
        jLapellidos.setText("Apellidos:");
        jPregistro.add(jLapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, 30));

        jLcorreo.setBackground(new java.awt.Color(238, 112, 82));
        jLcorreo.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLcorreo.setForeground(new java.awt.Color(51, 51, 51));
        jLcorreo.setText("Correo:");
        jPregistro.add(jLcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, 30));

        jLdireccion.setBackground(new java.awt.Color(238, 112, 82));
        jLdireccion.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLdireccion.setForeground(new java.awt.Color(51, 51, 51));
        jLdireccion.setText("Dirección:");
        jPregistro.add(jLdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 118, -1, 30));

        jLtelefono.setBackground(new java.awt.Color(238, 112, 82));
        jLtelefono.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLtelefono.setForeground(new java.awt.Color(51, 51, 51));
        jLtelefono.setText("Contraseña:");
        jPregistro.add(jLtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 258, -1, 30));

        jLpais.setBackground(new java.awt.Color(238, 112, 82));
        jLpais.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLpais.setForeground(new java.awt.Color(51, 51, 51));
        jLpais.setText("Usuario:");
        jPregistro.add(jLpais, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, 30));

        jTciudad.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTciudad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTciudadActionPerformed(evt);
            }
        });
        jPregistro.add(jTciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 190, 20));

        JTNombre.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        JTNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNombreActionPerformed(evt);
            }
        });
        jPregistro.add(JTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 190, 20));

        jTApellidos.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTApellidos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTApellidosActionPerformed(evt);
            }
        });
        jPregistro.add(jTApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 190, 20));

        jTcorreo.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTcorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcorreoActionPerformed(evt);
            }
        });
        jPregistro.add(jTcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 190, 20));

        jTdireccion.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTdireccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPregistro.add(jTdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 190, 20));

        jTpais.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTpais.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTpaisActionPerformed(evt);
            }
        });
        jPregistro.add(jTpais, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 190, 20));

        jTtelefono.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTtelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPregistro.add(jTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 190, -1));

        jTextField9.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPregistro.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 190, 20));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("ID empleado:");
        jPregistro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 118, -1, 30));

        jButton6.setBackground(new java.awt.Color(238, 112, 82));
        jButton6.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(238, 112, 82));
        jButton6.setText("Registrar");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jButton6.setContentAreaFilled(false);
        jButton6.setDefaultCapable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPregistro.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 70, 30));

        JPImagenRegis.add(jPregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 620, 470));

        getContentPane().add(JPImagenRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 620, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JlCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlCerrarMouseClicked
         int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"Desea salir del login?","Exit",dialog);
        if(result == 0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_JlCerrarMouseClicked

    private void JLMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLMinimizarMouseClicked
       this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_JLMinimizarMouseClicked

    private void JBNoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNoCuentaActionPerformed
        // TODO add your handling code here:       
       JPImagen1.setVisible(false);
       jPregistro.setVisible(true);
        //JPImagenRegis.validate();*/             
    }//GEN-LAST:event_JBNoCuentaActionPerformed

    private void JTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNombreActionPerformed

    private void jTciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTciudadActionPerformed

    private void jTApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTApellidosActionPerformed

    private void jTcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcorreoActionPerformed

    private void jTpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpaisActionPerformed

    private void jTusuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTusuarioFocusGained
        // TODO add your handling code here
       
            jTusuario.setText("");
        
    }//GEN-LAST:event_jTusuarioFocusGained

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
        
        EmpleadoDAO empleadoModel= new EmpleadoDAO();
        
        Empleado empleadoUsuario = empleadoModel.extraerUsuario(jTusuario.getText(), JPContraseña.getText());
        
        if (jTusuario.getText().equals("admin") && JPContraseña.getText().equals("admin")) {
            JOptionPane.showMessageDialog(null, "Bienvenido(a) iniciaste sesión como administrador");
            
            InterfazPrincipal interfazView = new InterfazPrincipal(empleadoUsuario);
            interfazView.setVisible(true);
            this.dispose();
            
        } else if (empleadoUsuario !=null) {
              
            JOptionPane.showMessageDialog(null, "Bienvenido al sistema DVD Rental \n" + "\t"+empleadoUsuario.getNombreEmpleado()+ " "+ empleadoUsuario.getApellidoEmpleado());
            
            InterfazPrincipal interfazView = new InterfazPrincipal(empleadoUsuario);
            interfazView.setVisible(true);
            this.dispose();
        } else{
        
        JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        }             
    }//GEN-LAST:event_jBEntrarActionPerformed

    public JButton getjBEntrar() {
        return jBEntrar;
    }
   
   public JTextField getUsuario(){
       return jTusuario;
   }
   
   public JPasswordField getContraseña(){
       return JPContraseña;
   }
   
    public void addListenerBtnEntrar(ActionListener listen) {
        jBEntrar.addActionListener(listen);
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBNoCuenta;
    private javax.swing.JLabel JLMinimizar;
    private javax.swing.JLabel JLUsuario;
    private javax.swing.JLabel JLcontraseña;
    private javax.swing.JPasswordField JPContraseña;
    private javax.swing.JPanel JPImagen1;
    private javax.swing.JPanel JPImagenRegis;
    private javax.swing.JPanel JPingreso;
    private javax.swing.JTextField JTNombre;
    private javax.swing.JLabel JlCerrar;
    private javax.swing.JButton jBEntrar;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLapellidos;
    private javax.swing.JLabel jLcorreo;
    private javax.swing.JLabel jLdireccion;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JLabel jLpais;
    private javax.swing.JLabel jLregistro;
    private javax.swing.JLabel jLtelefono;
    private javax.swing.JPanel jPregistro;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTApellidos;
    private javax.swing.JTextField jTciudad;
    private javax.swing.JTextField jTcorreo;
    private javax.swing.JTextField jTdireccion;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTpais;
    private javax.swing.JTextField jTtelefono;
    private javax.swing.JTextField jTusuario;
    // End of variables declaration//GEN-END:variables
 
}
