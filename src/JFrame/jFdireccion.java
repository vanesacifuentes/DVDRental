/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Gestionar direccion, mostrar agregar nuevo y borrar
 * Programadores : Cristhian Guzman, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : jFdireccion- Interfaz
 */
package JFrame;

import Controlador.ControllerCiudad;
import Modelo.Ciudad;
import Modelo.CiudadDAO;
import Modelo.Direccion;
import Modelo.Pelicula;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class jFdireccion extends javax.swing.JFrame {

    /**
     * Creates new form jFdireccion
     */
    public jFdireccion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPingreso = new javax.swing.JPanel();
        jTDireccionID = new javax.swing.JTextField();
        jLDireccion1 = new javax.swing.JLabel();
        jLDireccionID = new javax.swing.JLabel();
        jTDireccion1 = new javax.swing.JTextField();
        jLCiudad = new javax.swing.JLabel();
        jLFechaActualiza = new javax.swing.JLabel();
        jTtelefono = new javax.swing.JTextField();
        jLDistrito = new javax.swing.JLabel();
        jLDireccion2 = new javax.swing.JLabel();
        jTDireccion2 = new javax.swing.JTextField();
        jLCodigoPostal = new javax.swing.JLabel();
        jComboCiudad = new javax.swing.JComboBox<>();
        jBtnIngresoCiudad = new javax.swing.JButton();
        jCBCodPostal = new javax.swing.JComboBox<>();
        jLTelefono = new javax.swing.JLabel();
        jLfechaActua2 = new javax.swing.JLabel();
        jCBDistrito = new javax.swing.JComboBox<>();
        jPbotones = new javax.swing.JPanel();
        jBnuevo1 = new javax.swing.JButton();
        jBmodificar1 = new javax.swing.JButton();
        jBeliminar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPingreso.setBackground(new java.awt.Color(255, 255, 255));
        jPingreso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dirección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Decker", 0, 14), new java.awt.Color(238, 112, 82))); // NOI18N
        jPingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTDireccionID.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTDireccionID.setForeground(new java.awt.Color(102, 102, 102));
        jTDireccionID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTDireccionID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDireccionIDActionPerformed(evt);
            }
        });
        jPingreso.add(jTDireccionID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 20));

        jLDireccion1.setBackground(new java.awt.Color(238, 112, 82));
        jLDireccion1.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLDireccion1.setForeground(new java.awt.Color(51, 51, 51));
        jLDireccion1.setText("Dirección: ");
        jPingreso.add(jLDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        jLDireccionID.setBackground(new java.awt.Color(238, 112, 82));
        jLDireccionID.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLDireccionID.setForeground(new java.awt.Color(51, 51, 51));
        jLDireccionID.setText("Direccion ID:");
        jPingreso.add(jLDireccionID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        jTDireccion1.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTDireccion1.setForeground(new java.awt.Color(102, 102, 102));
        jTDireccion1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTDireccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDireccion1ActionPerformed(evt);
            }
        });
        jPingreso.add(jTDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, -1));

        jLCiudad.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLCiudad.setText("Ciudad:");
        jPingreso.add(jLCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jLFechaActualiza.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLFechaActualiza.setForeground(new java.awt.Color(51, 51, 51));
        jLFechaActualiza.setText("Fecha actualización:");
        jPingreso.add(jLFechaActualiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        jTtelefono.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTtelefono.setForeground(new java.awt.Color(102, 102, 102));
        jTtelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtelefonoActionPerformed(evt);
            }
        });
        jPingreso.add(jTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 220, 20));

        jLDistrito.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLDistrito.setForeground(new java.awt.Color(51, 51, 51));
        jLDistrito.setText("Distrito:");
        jPingreso.add(jLDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLDireccion2.setBackground(new java.awt.Color(238, 112, 82));
        jLDireccion2.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLDireccion2.setForeground(new java.awt.Color(51, 51, 51));
        jLDireccion2.setText("Dirección 2:");
        jPingreso.add(jLDireccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        jTDireccion2.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTDireccion2.setForeground(new java.awt.Color(102, 102, 102));
        jTDireccion2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTDireccion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDireccion2ActionPerformed(evt);
            }
        });
        jPingreso.add(jTDireccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 200, 20));

        jLCodigoPostal.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLCodigoPostal.setForeground(new java.awt.Color(51, 51, 51));
        jLCodigoPostal.setText("Codigo Postal:");
        jPingreso.add(jLCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        jComboCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCiudadActionPerformed(evt);
            }
        });
        jPingreso.add(jComboCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 130, 30));

        jBtnIngresoCiudad.setText("Ingresar");
        jBtnIngresoCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIngresoCiudadActionPerformed(evt);
            }
        });
        jPingreso.add(jBtnIngresoCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 80, 30));

        jCBCodPostal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPingreso.add(jCBCodPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 200, 30));

        jLTelefono.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLTelefono.setForeground(new java.awt.Color(51, 51, 51));
        jLTelefono.setText("Telefono:");
        jPingreso.add(jLTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));
        jPingreso.add(jLfechaActua2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 100, 30));

        jCBDistrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPingreso.add(jCBDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 200, 30));

        jPanel1.add(jPingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 270));

        jPbotones.setBackground(new java.awt.Color(255, 255, 255));
        jPbotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPbotones.setForeground(new java.awt.Color(102, 102, 102));
        jPbotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBnuevo1.setBackground(new java.awt.Color(238, 112, 82));
        jBnuevo1.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jBnuevo1.setForeground(new java.awt.Color(238, 112, 82));
        jBnuevo1.setText("Nuevo");
        jBnuevo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jBnuevo1.setContentAreaFilled(false);
        jBnuevo1.setDefaultCapable(false);
        jBnuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevo1ActionPerformed(evt);
            }
        });
        jPbotones.add(jBnuevo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 70, 30));

        jBmodificar1.setBackground(new java.awt.Color(238, 112, 82));
        jBmodificar1.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jBmodificar1.setForeground(new java.awt.Color(238, 112, 82));
        jBmodificar1.setText("Modificar");
        jBmodificar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jBmodificar1.setContentAreaFilled(false);
        jPbotones.add(jBmodificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 80, 30));

        jBeliminar1.setBackground(new java.awt.Color(238, 112, 82));
        jBeliminar1.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jBeliminar1.setForeground(new java.awt.Color(238, 112, 82));
        jBeliminar1.setText("Eliminar");
        jBeliminar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jBeliminar1.setContentAreaFilled(false);
        jPbotones.add(jBeliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 70, 30));

        jPanel1.add(jPbotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 480, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIngresoCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIngresoCiudadActionPerformed
        // TODO add your handling code here:
        CiudadDAO modeloCiudad = new CiudadDAO();
        jFCiudad CiudadView = new jFCiudad();
        // ControllerCiudad controlador = new ControllerCiudad(CiudadView, modeloCiudad);

        CiudadView.setVisible(true);
    }//GEN-LAST:event_jBtnIngresoCiudadActionPerformed

    private void jComboCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboCiudadActionPerformed

    private void jTDireccion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDireccion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDireccion2ActionPerformed

    private void jTtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtelefonoActionPerformed

    private void jTDireccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDireccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDireccion1ActionPerformed

    private void jTDireccionIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDireccionIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDireccionIDActionPerformed

    private void jBnuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBnuevo1ActionPerformed

    public JComboBox<String> getjComboCiudad() {
        return jComboCiudad;
    }

    public JLabel getjLDireccion2() {
        return jLDireccion2;
    }

    public JTextField getjTDireccion1() {
        return jTDireccion1;
    }

    public JTextField getjTDireccion2() {
        return jTDireccion2;
    }

    public JTextField getjTtelefono() {
        return jTtelefono;
    }

    public JTextField getjTDireccionID() {
        return jTDireccionID;
    }

    public void gestionMensajes(String mensaje, String titulo, int icono) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, icono);
    }


    //Método para cargar las ciudades a un comboBox
    public void cargarCiudadesCombo(ArrayList<Ciudad> listadoCiudades) {
        DefaultComboBoxModel model;
        String[] arregloCiudades = new String[listadoCiudades.size()];

        for (int a = 0; a < listadoCiudades.size(); a++) {
            arregloCiudades[a] = listadoCiudades.get(a).getCiudad();
        }

        model = new DefaultComboBoxModel(arregloCiudades);

        jComboCiudad.setModel(model);

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
            java.util.logging.Logger.getLogger(jFdireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFdireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFdireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFdireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFdireccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBeliminar1;
    private javax.swing.JButton jBmodificar1;
    private javax.swing.JButton jBnuevo1;
    private javax.swing.JButton jBtnIngresoCiudad;
    private javax.swing.JComboBox<String> jCBCodPostal;
    private javax.swing.JComboBox<String> jCBDistrito;
    private javax.swing.JComboBox<String> jComboCiudad;
    private javax.swing.JLabel jLCiudad;
    private javax.swing.JLabel jLCodigoPostal;
    private javax.swing.JLabel jLDireccion1;
    private javax.swing.JLabel jLDireccion2;
    private javax.swing.JLabel jLDireccionID;
    private javax.swing.JLabel jLDistrito;
    private javax.swing.JLabel jLFechaActualiza;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLfechaActua2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPbotones;
    private javax.swing.JPanel jPingreso;
    private javax.swing.JTextField jTDireccion1;
    private javax.swing.JTextField jTDireccion2;
    private javax.swing.JTextField jTDireccionID;
    private javax.swing.JTextField jTtelefono;
    // End of variables declaration//GEN-END:variables
}
