/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : jFinventario Interfaz inventario
 * Programadores : Cristhian Guzman, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : jFinventario
 */
package JFrame;

import Modelo.Pelicula;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

import Modelo.Pelicula;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class jFinventario extends javax.swing.JFrame {

    /**
     * Creates new form jFalquilar
     */
    public jFinventario() {
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jPingreso = new javax.swing.JPanel();
        jPtabla1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableinventario = new javax.swing.JTable();
        jPbotones = new javax.swing.JPanel();
        jBnuevo = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jPingreso1 = new javax.swing.JPanel();
        jPtabla2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableinventarioRentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPingreso.setBackground(new java.awt.Color(255, 255, 255));
        jPingreso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Inventario de Películas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Decker", 0, 14), new java.awt.Color(238, 112, 82))); // NOI18N
        jPingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPtabla1.setBackground(new java.awt.Color(255, 255, 255));
        jPtabla1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPtabla1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableinventario.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTableinventario.setForeground(new java.awt.Color(51, 51, 51));
        jTableinventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No. Alquiler", "No. Inventario", "Titulo Pelicula", "Cliente", "Telefono", "Direccion"
            }
        ));
        jScrollPane3.setViewportView(jTableinventario);

        jPtabla1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 140));

        jPingreso.add(jPtabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 640, 140));

        jPanel1.add(jPingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 660, 200));

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
        jPbotones.add(jBnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 60, 30));

        jBmodificar.setBackground(new java.awt.Color(238, 112, 82));
        jBmodificar.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jBmodificar.setForeground(new java.awt.Color(238, 112, 82));
        jBmodificar.setText("Modificar");
        jBmodificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jBmodificar.setContentAreaFilled(false);
        jPbotones.add(jBmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 80, 30));

        jBeliminar.setBackground(new java.awt.Color(238, 112, 82));
        jBeliminar.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jBeliminar.setForeground(new java.awt.Color(238, 112, 82));
        jBeliminar.setText("Eliminar");
        jBeliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jBeliminar.setContentAreaFilled(false);
        jPbotones.add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 70, 30));

        jPanel1.add(jPbotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 660, 50));

        jPingreso1.setBackground(new java.awt.Color(255, 255, 255));
        jPingreso1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Inventario de Rentas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Decker", 0, 14), new java.awt.Color(238, 112, 82))); // NOI18N
        jPingreso1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPtabla2.setBackground(new java.awt.Color(255, 255, 255));
        jPtabla2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPtabla2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableinventarioRentas.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTableinventarioRentas.setForeground(new java.awt.Color(51, 51, 51));
        jTableinventarioRentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No. Alquiler", "No. Inventario", "Titulo Pelicula", "Cliente", "Telefono", "Direccion"
            }
        ));
        jScrollPane4.setViewportView(jTableinventarioRentas);

        jPtabla2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 140));

        jPingreso1.add(jPtabla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 640, 140));

        jPanel1.add(jPingreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 660, 190));

        jLabel1.setText("Tienda");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 40, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBnuevoActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    public void cargarInfoAlquilerTabla(ArrayList<ArrayList> listadoAlquiler)
    {
        DefaultTableModel defaultCombo;
        defaultCombo = (DefaultTableModel) jTableinventarioRentas.getModel();
        limpiarListadoTabla();
        for (int i = 0; i < listadoAlquiler.size(); i++) {
            defaultCombo.addRow(new Object[]{
                listadoAlquiler.get(i).get(0),
                listadoAlquiler.get(i).get(1),
                listadoAlquiler.get(i).get(2),
                listadoAlquiler.get(i).get(3)+" "+listadoAlquiler.get(i).get(4),
                listadoAlquiler.get(i).get(5),
                listadoAlquiler.get(i).get(6),
                
                
     
            });
        }
        
    }
    
     //Limpiar el listado
    private void limpiarListadoTabla() {
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTableinventarioRentas.getModel();
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    
    public void cargarInfoInventarioTabla()
    {
        
    }

   
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
            java.util.logging.Logger.getLogger(jFinventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFinventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFinventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFinventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFinventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPbotones;
    private javax.swing.JPanel jPingreso;
    private javax.swing.JPanel jPingreso1;
    private javax.swing.JPanel jPtabla1;
    private javax.swing.JPanel jPtabla2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableinventario;
    private javax.swing.JTable jTableinventarioRentas;
    // End of variables declaration//GEN-END:variables
}
