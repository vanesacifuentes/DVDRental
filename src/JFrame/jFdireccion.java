/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

/**
 *
 * @author nicol
 */
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
        jTDistrito = new javax.swing.JTextField();
        jLCiudad = new javax.swing.JLabel();
        jLTelefono = new javax.swing.JLabel();
        jTtelefono = new javax.swing.JTextField();
        jLDistrito = new javax.swing.JLabel();
        jLDireccion2 = new javax.swing.JLabel();
        jTDireccion2 = new javax.swing.JTextField();
        jLCodigoPostal = new javax.swing.JLabel();
        jTCodigoPostal = new javax.swing.JTextField();
        jComboCiudad = new javax.swing.JComboBox<String>();
        jButtonIngresoCiudad = new javax.swing.JButton();
        jButtonIngresoCiudad1 = new javax.swing.JButton();
        jButtonIngresoCiudad2 = new javax.swing.JButton();
        jButtonIngresoCiudad3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(269, 195));
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
        jPingreso.add(jTDireccionID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 200, 20));

        jLDireccion1.setBackground(new java.awt.Color(238, 112, 82));
        jLDireccion1.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLDireccion1.setForeground(new java.awt.Color(51, 51, 51));
        jLDireccion1.setText("Dirección: ");
        jPingreso.add(jLDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        jLDireccionID.setBackground(new java.awt.Color(238, 112, 82));
        jLDireccionID.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLDireccionID.setForeground(new java.awt.Color(51, 51, 51));
        jLDireccionID.setText("Direccion ID:");
        jPingreso.add(jLDireccionID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        jTDireccion1.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTDireccion1.setForeground(new java.awt.Color(102, 102, 102));
        jTDireccion1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTDireccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDireccion1ActionPerformed(evt);
            }
        });
        jPingreso.add(jTDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 200, -1));

        jTDistrito.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTDistrito.setForeground(new java.awt.Color(102, 102, 102));
        jTDistrito.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDistritoActionPerformed(evt);
            }
        });
        jPingreso.add(jTDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 200, 20));

        jLCiudad.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLCiudad.setText("Ciudad:");
        jPingreso.add(jLCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jLTelefono.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLTelefono.setForeground(new java.awt.Color(51, 51, 51));
        jLTelefono.setText("Telefono:");
        jPingreso.add(jLTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jTtelefono.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTtelefono.setForeground(new java.awt.Color(102, 102, 102));
        jTtelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtelefonoActionPerformed(evt);
            }
        });
        jPingreso.add(jTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 220, 20));

        jLDistrito.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLDistrito.setForeground(new java.awt.Color(51, 51, 51));
        jLDistrito.setText("Distrito:");
        jPingreso.add(jLDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLDireccion2.setBackground(new java.awt.Color(238, 112, 82));
        jLDireccion2.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLDireccion2.setForeground(new java.awt.Color(51, 51, 51));
        jLDireccion2.setText("Dirección 2:");
        jPingreso.add(jLDireccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        jTDireccion2.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTDireccion2.setForeground(new java.awt.Color(102, 102, 102));
        jTDireccion2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTDireccion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDireccion2ActionPerformed(evt);
            }
        });
        jPingreso.add(jTDireccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 200, 20));

        jLCodigoPostal.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLCodigoPostal.setForeground(new java.awt.Color(51, 51, 51));
        jLCodigoPostal.setText("Codigo Postal:");
        jPingreso.add(jLCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jTCodigoPostal.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTCodigoPostal.setForeground(new java.awt.Color(102, 102, 102));
        jTCodigoPostal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTCodigoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCodigoPostalActionPerformed(evt);
            }
        });
        jPingreso.add(jTCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 160, 20));

        jComboCiudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPingreso.add(jComboCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 160, 20));

        jButtonIngresoCiudad.setText("CRUD");
        jPingreso.add(jButtonIngresoCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 20, 20));

        jButtonIngresoCiudad1.setText("Ingreso");
        jPingreso.add(jButtonIngresoCiudad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 20, 20));

        jButtonIngresoCiudad2.setText("CRUD");
        jPingreso.add(jButtonIngresoCiudad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 20, 20));

        jButtonIngresoCiudad3.setText("ingreso");
        jButtonIngresoCiudad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresoCiudad3ActionPerformed(evt);
            }
        });
        jPingreso.add(jButtonIngresoCiudad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 20, 20));

        jPanel1.add(jPingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 300));

        jButton9.setBackground(new java.awt.Color(238, 112, 82));
        jButton9.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(238, 112, 82));
        jButton9.setText("Eliminar");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jButton9.setContentAreaFilled(false);
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 70, 30));

        jButton7.setBackground(new java.awt.Color(238, 112, 82));
        jButton7.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(238, 112, 82));
        jButton7.setText("Modificar");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jButton7.setContentAreaFilled(false);
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 80, 30));

        jButton5.setBackground(new java.awt.Color(238, 112, 82));
        jButton5.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(238, 112, 82));
        jButton5.setText("Nuevo");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jButton5.setContentAreaFilled(false);
        jButton5.setDefaultCapable(false);
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 60, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTDireccionIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDireccionIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDireccionIDActionPerformed

    private void jTDireccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDireccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDireccion1ActionPerformed

    private void jTDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDistritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDistritoActionPerformed

    private void jTtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtelefonoActionPerformed

    private void jTDireccion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDireccion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDireccion2ActionPerformed

    private void jTCodigoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCodigoPostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCodigoPostalActionPerformed

    private void jButtonIngresoCiudad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresoCiudad3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIngresoCiudad3ActionPerformed

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
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonIngresoCiudad;
    private javax.swing.JButton jButtonIngresoCiudad1;
    private javax.swing.JButton jButtonIngresoCiudad2;
    private javax.swing.JButton jButtonIngresoCiudad3;
    private javax.swing.JComboBox<String> jComboCiudad;
    private javax.swing.JLabel jLCiudad;
    private javax.swing.JLabel jLCodigoPostal;
    private javax.swing.JLabel jLDireccion1;
    private javax.swing.JLabel jLDireccion2;
    private javax.swing.JLabel jLDireccionID;
    private javax.swing.JLabel jLDistrito;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPingreso;
    private javax.swing.JTextField jTCodigoPostal;
    private javax.swing.JTextField jTDireccion1;
    private javax.swing.JTextField jTDireccion2;
    private javax.swing.JTextField jTDireccionID;
    private javax.swing.JTextField jTDistrito;
    private javax.swing.JTextField jTtelefono;
    // End of variables declaration//GEN-END:variables
}
