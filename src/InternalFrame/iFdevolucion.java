/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Interfaz Devolucion Pelicula
 * Programadores : Cristhian Guzman, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : iFdevolucion- Interfaz
 */
package InternalFrame;

import JFrame.jFPago;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author nicol
 */
public class iFdevolucion extends javax.swing.JInternalFrame {

    /**
     * Creates new form iFdevolucion
     */
    public iFdevolucion() {
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
        jPdatosCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTBuscadorPelicula1 = new javax.swing.JTextField();
        jTBuscadorPelicula2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTBuscadorRenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jBbuscarRenta = new javax.swing.JButton();
        jPinformacionPeliculs2 = new javax.swing.JPanel();
        jLtitulo4 = new javax.swing.JLabel();
        jLCodigoCliente2 = new javax.swing.JLabel();
        jLTitulo = new javax.swing.JLabel();
        jLtitulo5 = new javax.swing.JLabel();
        jLPrecio = new javax.swing.JLabel();
        jLTitulo1 = new javax.swing.JLabel();
        jBdevolucion = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPdatosCliente.setBackground(new java.awt.Color(255, 255, 255));
        jPdatosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Decker", 0, 14), new java.awt.Color(238, 112, 82))); // NOI18N
        jPdatosCliente.setForeground(new java.awt.Color(51, 51, 51));
        jPdatosCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ID cliente:");
        jPdatosCliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre:");
        jPdatosCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

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
        jPdatosCliente.add(jTBuscadorPelicula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 250, 30));

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
        jPdatosCliente.add(jTBuscadorPelicula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 250, 30));

        jPanel1.add(jPdatosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 630, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda Película", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(238, 112, 82))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTBuscadorRenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTBuscadorRenta.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTBuscadorRenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBuscadorRentaActionPerformed(evt);
            }
        });
        jTBuscadorRenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscadorRentaKeyReleased(evt);
            }
        });
        jPanel2.add(jTBuscadorRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 250, 30));

        jLabel4.setBackground(new java.awt.Color(238, 112, 82));
        jLabel4.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Ingrese ID Alquiler:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 40));

        jBbuscarRenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscador3.png"))); // NOI18N
        jBbuscarRenta.setBorder(null);
        jBbuscarRenta.setContentAreaFilled(false);
        jBbuscarRenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarRentaActionPerformed(evt);
            }
        });
        jPanel2.add(jBbuscarRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 40, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 630, 80));

        jPinformacionPeliculs2.setBackground(new java.awt.Color(255, 255, 255));
        jPinformacionPeliculs2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Película", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(238, 112, 82))); // NOI18N
        jPinformacionPeliculs2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLtitulo4.setBackground(new java.awt.Color(238, 112, 82));
        jLtitulo4.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLtitulo4.setForeground(new java.awt.Color(51, 51, 51));
        jLtitulo4.setText("Precio:");
        jLtitulo4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPinformacionPeliculs2.add(jLtitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 30));

        jLCodigoCliente2.setBackground(new java.awt.Color(238, 112, 82));
        jLCodigoCliente2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLCodigoCliente2.setForeground(new java.awt.Color(51, 51, 51));
        jLCodigoCliente2.setText("Fecha Devolución:");
        jLCodigoCliente2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPinformacionPeliculs2.add(jLCodigoCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, 30));

        jLTitulo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPinformacionPeliculs2.add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 240, 30));

        jLtitulo5.setBackground(new java.awt.Color(238, 112, 82));
        jLtitulo5.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLtitulo5.setForeground(new java.awt.Color(51, 51, 51));
        jLtitulo5.setText("Título:");
        jLtitulo5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPinformacionPeliculs2.add(jLtitulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 30));

        jLPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPinformacionPeliculs2.add(jLPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 90, 30));

        jLTitulo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPinformacionPeliculs2.add(jLTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 240, 30));

        jPanel1.add(jPinformacionPeliculs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 630, 150));

        jBdevolucion.setBackground(new java.awt.Color(238, 112, 82));
        jBdevolucion.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jBdevolucion.setForeground(new java.awt.Color(238, 112, 82));
        jBdevolucion.setText("Devoución");
        jBdevolucion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jBdevolucion.setContentAreaFilled(false);
        jBdevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdevolucionActionPerformed(evt);
            }
        });
        jPanel1.add(jBdevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 759, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTBuscadorRentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBuscadorRentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscadorRentaActionPerformed

    private void jTBuscadorRentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscadorRentaKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jTBuscadorRentaKeyReleased

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

    private void jBdevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdevolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBdevolucionActionPerformed

    private void jBbuscarRentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarRentaActionPerformed
        // TODO add your handling code here:

       
    }//GEN-LAST:event_jBbuscarRentaActionPerformed

    public JButton getjBdevolucion() {
        return jBdevolucion;
    }

    public JTextField getjTBuscadorRenta() {
        return jTBuscadorRenta;
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscarRenta;
    private javax.swing.JButton jBdevolucion;
    private javax.swing.JLabel jLCodigoCliente2;
    private javax.swing.JLabel jLPrecio;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLTitulo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLtitulo4;
    private javax.swing.JLabel jLtitulo5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPdatosCliente;
    private javax.swing.JPanel jPinformacionPeliculs2;
    private javax.swing.JTextField jTBuscadorPelicula1;
    private javax.swing.JTextField jTBuscadorPelicula2;
    private javax.swing.JTextField jTBuscadorRenta;
    // End of variables declaration//GEN-END:variables
}
