/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Gestionar categoria, mostrar agregar nuevo y borrar
 * Programadores : Cristhian Guzman, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : jFcategoria- Interfaz
 */
package JFrame;

import Modelo.Categoria;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class jFcategoria extends javax.swing.JFrame {

    /**
     * Creates new form jFcategoria
     */
    public int valor;
    public jFcategoria() {
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
        jTCategoriaID = new javax.swing.JTextField();
        jLNombreCategoria = new javax.swing.JLabel();
        jLIDCategoria = new javax.swing.JLabel();
        jLFechaActualizacion = new javax.swing.JLabel();
        jTnombreCategoria = new javax.swing.JTextField();
        jLFechaActu = new javax.swing.JLabel();
        jPbotones = new javax.swing.JPanel();
        jBnuevo = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCategoria = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPingreso.setBackground(new java.awt.Color(255, 255, 255));
        jPingreso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos categoría", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Decker", 0, 14), new java.awt.Color(238, 112, 82))); // NOI18N
        jPingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTCategoriaID.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTCategoriaID.setForeground(new java.awt.Color(102, 102, 102));
        jTCategoriaID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTCategoriaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCategoriaIDActionPerformed(evt);
            }
        });
        jPingreso.add(jTCategoriaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 20));

        jLNombreCategoria.setBackground(new java.awt.Color(238, 112, 82));
        jLNombreCategoria.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLNombreCategoria.setForeground(new java.awt.Color(51, 51, 51));
        jLNombreCategoria.setText("Nombre Categoría:");
        jPingreso.add(jLNombreCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        jLIDCategoria.setBackground(new java.awt.Color(238, 112, 82));
        jLIDCategoria.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLIDCategoria.setForeground(new java.awt.Color(51, 51, 51));
        jLIDCategoria.setText("Categoría ID:");
        jPingreso.add(jLIDCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));

        jLFechaActualizacion.setBackground(new java.awt.Color(238, 112, 82));
        jLFechaActualizacion.setFont(new java.awt.Font("Decker", 0, 13)); // NOI18N
        jLFechaActualizacion.setForeground(new java.awt.Color(51, 51, 51));
        jLFechaActualizacion.setText("Fecha actualización:");
        jPingreso.add(jLFechaActualizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        jTnombreCategoria.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTnombreCategoria.setForeground(new java.awt.Color(102, 102, 102));
        jTnombreCategoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTnombreCategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTnombreCategoriaFocusGained(evt);
            }
        });
        jTnombreCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnombreCategoriaActionPerformed(evt);
            }
        });
        jPingreso.add(jTnombreCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 240, -1));
        jPingreso.add(jLFechaActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 100, 20));

        jPanel1.add(jPingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 330, 150));

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

        jTableCategoria.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTableCategoria.setForeground(new java.awt.Color(51, 51, 51));
        jTableCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Categoría", "Nombre Categoría"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableCategoria);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 330, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jTCategoriaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCategoriaIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCategoriaIDActionPerformed

    private void jTnombreCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnombreCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnombreCategoriaActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jTnombreCategoriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnombreCategoriaFocusGained
        // TODO add your handling code here:
        if (jTnombreCategoria.getText().equalsIgnoreCase("Campo Requerido")) {
            jTnombreCategoria.setForeground(Color.BLACK);
            jTnombreCategoria.setText("");
        }
    }//GEN-LAST:event_jTnombreCategoriaFocusGained

    public int validarCampos()
    {
        int rtdo = 1;

        if (jTnombreCategoria.getText().equals("") || jTnombreCategoria.getText().equals("Campo Requerido")) {

            rtdo = 0;
            jTnombreCategoria.setForeground(Color.red);
            jTnombreCategoria.setText("Campo Requerido");

        }
        

        return rtdo;
        
    }
    
    
    
    
    public void activarCampos(Boolean b) {
        jTnombreCategoria.setEnabled(b);
        //jTLenguajeID.setEnabled(b);
    }

    public void setearCampos() {

        jTnombreCategoria.setText("");
        jTCategoriaID.setText("");
        jLFechaActu.setText("");
        
    }

    public void nuevaAccion() {
        activarCampos(false);
        setearCampos();
        jBnuevo.setText("Nuevo");
        jBmodificar.setText("Modificar");
        jBeliminar.setVisible(true);
    }
    
    public JButton getjBeliminar() {
        return jBeliminar;
    }

    public JButton getjBmodificar() {
        return jBmodificar;
    }

    public JButton getjBnuevo() {
        return jBnuevo;
    }

    public JLabel getjLFechaActu() {
        return jLFechaActu;
    }

    public JLabel getjLFechaActualizacion() {
        return jLFechaActualizacion;
    }

    public JLabel getjLIDCategoria() {
        return jLIDCategoria;
    }

    public JLabel getjLNombreCategoria() {
        return jLNombreCategoria;
    }

    public JTextField getjTCategoriaID() {
        return jTCategoriaID;
    }

    public JTable getjTableCategoria() {
        return jTableCategoria;
    }

    public JTextField getjTnombreCategoria() {
        return jTnombreCategoria;
    }

     private void limpiarListadoTabla(){
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTableCategoria.getModel();
        for(int i=modelo.getRowCount()-1; i>=0 ; i--){
            modelo.removeRow(i);
        }
    }
    
    //Método para cargar los lenguajes a la tabla 
    public void cargarCategoriaTabla(ArrayList<Categoria> listadoCategoria)
     {
        DefaultTableModel model_categoria;
        model_categoria = (DefaultTableModel) jTableCategoria.getModel();        
        limpiarListadoTabla();
        for(int i= 0; i < listadoCategoria.size(); i++){
              model_categoria.addRow(new Object[]{
              listadoCategoria.get(i).getCategoriaId(),
              listadoCategoria.get(i).getNombreCategoria()});
        }
        
        valor = Integer.parseInt(""+model_categoria.getValueAt(model_categoria.getRowCount()-1, 0))+1;
        jTCategoriaID.setEnabled(false);
     }
    
    //Escuchas
    public void addListenerBtnNuevo(ActionListener listenCategoria){
       
        jBnuevo.addActionListener(listenCategoria);       
    }
    
    public void addListenerBtnEliminar(ActionListener listenCategoria){
       
        jBeliminar.addActionListener(listenCategoria);       
    }

    public void addListenerBtnModificar(ActionListener listenCategoria){
        jBmodificar.addActionListener(listenCategoria);       
    }
    
    public void addMouseListenerTabla(MouseListener listenCategoria) {
        jTableCategoria.addMouseListener(listenCategoria);
    }
    
    public void gestionMensajes(String mensaje, String titulo, int icono){
         JOptionPane.showMessageDialog(this,mensaje, titulo, icono);
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
            java.util.logging.Logger.getLogger(jFcategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFcategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFcategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFcategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFcategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JLabel jLFechaActu;
    private javax.swing.JLabel jLFechaActualizacion;
    private javax.swing.JLabel jLIDCategoria;
    private javax.swing.JLabel jLNombreCategoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPbotones;
    private javax.swing.JPanel jPingreso;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTCategoriaID;
    private javax.swing.JTable jTableCategoria;
    private javax.swing.JTextField jTnombreCategoria;
    // End of variables declaration//GEN-END:variables
}
