/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Gestionar lenguaje, mostrar agregar nuevo y borrar
 * Programadores : Cristhian Guzman, Juan Martinez, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : jFlenguaje- Interfaz
 */
package JFrame;


import Modelo.Lenguaje;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class jFlenguaje extends javax.swing.JFrame {

    /**
     * Creates new form jFlenguaje
     */
    public int valor;

    public jFlenguaje() {
        initComponents();
        activarCampos(false);
        jTLenguajeID.setEnabled(false);
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
        jTLenguajeID = new javax.swing.JTextField();
        jLNombreLenguaje = new javax.swing.JLabel();
        jLIDLenguaje = new javax.swing.JLabel();
        jLFechaActualizacion = new javax.swing.JLabel();
        jTnombreLenguaje = new javax.swing.JTextField();
        jLFechaActu = new javax.swing.JLabel();
        jPbotones = new javax.swing.JPanel();
        jBnuevo = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableLenguaje = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPingreso.setBackground(new java.awt.Color(255, 255, 255));
        jPingreso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos lenguaje", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Decker", 0, 14), new java.awt.Color(238, 112, 82))); // NOI18N
        jPingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTLenguajeID.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTLenguajeID.setForeground(new java.awt.Color(102, 102, 102));
        jTLenguajeID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTLenguajeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTLenguajeIDActionPerformed(evt);
            }
        });
        jPingreso.add(jTLenguajeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 20));

        jLNombreLenguaje.setBackground(new java.awt.Color(238, 112, 82));
        jLNombreLenguaje.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLNombreLenguaje.setForeground(new java.awt.Color(51, 51, 51));
        jLNombreLenguaje.setText("Nombre Lenguaje:");
        jPingreso.add(jLNombreLenguaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        jLIDLenguaje.setBackground(new java.awt.Color(238, 112, 82));
        jLIDLenguaje.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLIDLenguaje.setForeground(new java.awt.Color(51, 51, 51));
        jLIDLenguaje.setText("Lenguaje ID:");
        jPingreso.add(jLIDLenguaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));

        jLFechaActualizacion.setBackground(new java.awt.Color(238, 112, 82));
        jLFechaActualizacion.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLFechaActualizacion.setForeground(new java.awt.Color(51, 51, 51));
        jLFechaActualizacion.setText("Fecha actualización:");
        jPingreso.add(jLFechaActualizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        jTnombreLenguaje.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTnombreLenguaje.setForeground(new java.awt.Color(102, 102, 102));
        jTnombreLenguaje.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTnombreLenguaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnombreLenguajeActionPerformed(evt);
            }
        });
        jPingreso.add(jTnombreLenguaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 240, -1));
        jPingreso.add(jLFechaActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 100, 20));

        jPanel1.add(jPingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 330, 150));
        jPingreso.getAccessibleContext().setAccessibleName("Datos Lenguaje");

        jPbotones.setBackground(new java.awt.Color(255, 255, 255));
        jPbotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPbotones.setForeground(new java.awt.Color(102, 102, 102));
        jPbotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBnuevo.setBackground(new java.awt.Color(238, 112, 82));
        jBnuevo.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jBnuevo.setForeground(new java.awt.Color(238, 112, 82));
        jBnuevo.setText("Nuevo");
        jBnuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jBnuevo.setContentAreaFilled(false);
        jBnuevo.setDefaultCapable(false);
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });
        jPbotones.add(jBnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 60, 30));

        jBmodificar.setBackground(new java.awt.Color(238, 112, 82));
        jBmodificar.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jBmodificar.setForeground(new java.awt.Color(238, 112, 82));
        jBmodificar.setText("Modificar");
        jBmodificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jBmodificar.setContentAreaFilled(false);
        jPbotones.add(jBmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 80, 30));

        jBeliminar.setBackground(new java.awt.Color(238, 112, 82));
        jBeliminar.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jBeliminar.setForeground(new java.awt.Color(238, 112, 82));
        jBeliminar.setText("Eliminar");
        jBeliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jBeliminar.setContentAreaFilled(false);
        jPbotones.add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 70, 30));

        jPanel1.add(jPbotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 330, 50));

        jTableLenguaje.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTableLenguaje.setForeground(new java.awt.Color(51, 51, 51));
        jTableLenguaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Lenguaje", "Nombre Lenguaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableLenguaje);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 330, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jTnombreLenguajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnombreLenguajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnombreLenguajeActionPerformed

    private void jTLenguajeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTLenguajeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTLenguajeIDActionPerformed

    public void activarCampos(Boolean b) {
        jTnombreLenguaje.setEnabled(b);
        //jTLenguajeID.setEnabled(b);
    }

    public void setearCampos() {

        jTnombreLenguaje.setText("");
        jTLenguajeID.setText("");
        jLFechaActu.setText("");
        
    }

    public void nuevaAccion() {
        activarCampos(false);
        setearCampos();
        jBnuevo.setText("Nuevo");
        jBmodificar.setText("Modificar");
        jBeliminar.setVisible(true);
    }

    public void addListenerBtnNuevo(ActionListener listenLenguaje) {

        jBnuevo.addActionListener(listenLenguaje);
    }

    public void addListenerBtnEliminar(ActionListener listenLenguaje) {

        jBeliminar.addActionListener(listenLenguaje);
    }

    public void addListenerBtnModificar(ActionListener listenLenguaje) {
        jBmodificar.addActionListener(listenLenguaje);
    }

    public void addMouseListenerTabla(MouseListener listenLenguaje) {
        jTableLenguaje.addMouseListener(listenLenguaje);
    }

    public JTable getjTableLenguaje() {
        return jTableLenguaje;
    }

    public JLabel getjLFechaActu() {
        return jLFechaActu;
    }

    public JButton getjBeliminar() {
        return jBeliminar;
    }

    public JButton getjBnuevo() {
        return jBnuevo;
    }

    public JButton getjBmodificar() {
        return jBmodificar;
    }

    public JLabel getjLIDLenguaje() {
        return jLIDLenguaje;
    }

    public JLabel getjLNombreLenguaje() {
        return jLNombreLenguaje;
    }

    public JTextField getjTLenguajeID() {
        return jTLenguajeID;
    }

    public JTextField getjTnombreLenguaje() {
        return jTnombreLenguaje;
    }

    public void gestionMensajes(String mensaje, String titulo, int icono) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, icono);
    }

    private void limpiarListadoTabla() {
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTableLenguaje.getModel();
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    //Método para cargar los lenguajes a la tabla 
    public void cargarLenguajesTabla(ArrayList<Lenguaje> listadoLenguaje) {
        DefaultTableModel model_lenguaje;
        model_lenguaje = (DefaultTableModel) jTableLenguaje.getModel();
        limpiarListadoTabla();
        for (int i = 0; i < listadoLenguaje.size(); i++) {
            model_lenguaje.addRow(new Object[]{
                listadoLenguaje.get(i).getLenguageID(),
                listadoLenguaje.get(i).getNombreLenguaje()});
        }

        valor = Integer.parseInt("" + model_lenguaje.getValueAt(model_lenguaje.getRowCount() - 1, 0)) + 1;

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
            java.util.logging.Logger.getLogger(jFlenguaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFlenguaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFlenguaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFlenguaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFlenguaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JLabel jLFechaActu;
    private javax.swing.JLabel jLFechaActualizacion;
    private javax.swing.JLabel jLIDLenguaje;
    private javax.swing.JLabel jLNombreLenguaje;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPbotones;
    private javax.swing.JPanel jPingreso;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTLenguajeID;
    private javax.swing.JTable jTableLenguaje;
    private javax.swing.JTextField jTnombreLenguaje;
    // End of variables declaration//GEN-END:variables
}
