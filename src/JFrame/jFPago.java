/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Gestionar pago, mostrar agregar nuevo y borrar
 * Programadores : Cristhian Guzman,  Nathalia Riascos, Vanesa Cifuentes
 * Clase         : jFpago- Interfaz
 */
package JFrame;

/**
 *
 * @author vanes
 */
public class jFPago extends javax.swing.JFrame {

    /**
     * Creates new form jFPago
     */
    public jFPago() {
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
        jPanel2 = new javax.swing.JPanel();
        jTBuscadorPelicula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTBuscadorPelicula2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTBuscadorPelicula1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPdatosCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTBuscadorPelicula3 = new javax.swing.JTextField();
        jTBuscadorPelicula4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pago Alquiler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(238, 112, 82))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTBuscadorPelicula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTBuscadorPelicula.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTBuscadorPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBuscadorPeliculaActionPerformed(evt);
            }
        });
        jTBuscadorPelicula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscadorPeliculaKeyReleased(evt);
            }
        });
        jPanel2.add(jTBuscadorPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 250, 30));

        jLabel2.setBackground(new java.awt.Color(238, 112, 82));
        jLabel2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Precio Total:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 40));

        jLabel4.setBackground(new java.awt.Color(238, 112, 82));
        jLabel4.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText(" ID Pago:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 40));

        jTBuscadorPelicula2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTBuscadorPelicula2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTBuscadorPelicula2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBuscadorPelicula2ActionPerformed(evt);
            }
        });
        jTBuscadorPelicula2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscadorPelicula2KeyReleased(evt);
            }
        });
        jPanel2.add(jTBuscadorPelicula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 250, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 470, 150));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(238, 112, 82))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTBuscadorPelicula1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTBuscadorPelicula1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTBuscadorPelicula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBuscadorPelicula1ActionPerformed(evt);
            }
        });
        jTBuscadorPelicula1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscadorPelicula1KeyReleased(evt);
            }
        });
        jPanel3.add(jTBuscadorPelicula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 250, 30));

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Ingrese ID Alquiler:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 470, 100));

        jPdatosCliente.setBackground(new java.awt.Color(255, 255, 255));
        jPdatosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Decker", 0, 14), new java.awt.Color(238, 112, 82))); // NOI18N
        jPdatosCliente.setForeground(new java.awt.Color(51, 51, 51));
        jPdatosCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ID cliente:");
        jPdatosCliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nombre:");
        jPdatosCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jTBuscadorPelicula3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTBuscadorPelicula3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTBuscadorPelicula3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBuscadorPelicula3ActionPerformed(evt);
            }
        });
        jTBuscadorPelicula3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscadorPelicula3KeyReleased(evt);
            }
        });
        jPdatosCliente.add(jTBuscadorPelicula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 250, 30));

        jTBuscadorPelicula4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTBuscadorPelicula4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTBuscadorPelicula4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBuscadorPelicula4ActionPerformed(evt);
            }
        });
        jTBuscadorPelicula4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscadorPelicula4KeyReleased(evt);
            }
        });
        jPdatosCliente.add(jTBuscadorPelicula4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 250, 30));

        jPanel1.add(jPdatosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 470, 130));

        jButton4.setBackground(new java.awt.Color(238, 112, 82));
        jButton4.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(238, 112, 82));
        jButton4.setText("Pagar");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTBuscadorPeliculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscadorPeliculaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscadorPeliculaKeyReleased

    private void jTBuscadorPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBuscadorPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscadorPeliculaActionPerformed

    private void jTBuscadorPelicula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBuscadorPelicula1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscadorPelicula1ActionPerformed

    private void jTBuscadorPelicula1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscadorPelicula1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscadorPelicula1KeyReleased

    private void jTBuscadorPelicula2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBuscadorPelicula2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscadorPelicula2ActionPerformed

    private void jTBuscadorPelicula2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscadorPelicula2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscadorPelicula2KeyReleased

    private void jTBuscadorPelicula3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBuscadorPelicula3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscadorPelicula3ActionPerformed

    private void jTBuscadorPelicula3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscadorPelicula3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscadorPelicula3KeyReleased

    private void jTBuscadorPelicula4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBuscadorPelicula4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscadorPelicula4ActionPerformed

    private void jTBuscadorPelicula4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscadorPelicula4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscadorPelicula4KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(jFPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPdatosCliente;
    private javax.swing.JTextField jTBuscadorPelicula;
    private javax.swing.JTextField jTBuscadorPelicula1;
    private javax.swing.JTextField jTBuscadorPelicula2;
    private javax.swing.JTextField jTBuscadorPelicula3;
    private javax.swing.JTextField jTBuscadorPelicula4;
    // End of variables declaration//GEN-END:variables
}
