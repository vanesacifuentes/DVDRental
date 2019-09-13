/*
 * Programa      : PROYECTO PROGRAMACION INTERACTIVA 2019- DVD RENTAL
 * Fecha         : Septiembre-2019
 * Objetivo      : Interfaz Alquiler de película
 * Programadores : Cristhian Guzman, Juan Martinez, Nathalia Riascos, Vanesa Cifuentes
 * Clase         : iFalquiler- Interfaz
 */
package InternalFrame;

import Modelo.Cliente;
import Modelo.Pelicula;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;


public class iFalquiler extends javax.swing.JInternalFrame {

    /**
     * Creates new form iFalquiler
     */
    DefaultListModel modeloBuscarPelicula;
    DefaultListModel modeloBuscarCliente;

    public iFalquiler() {
        initComponents();
        modeloBuscarPelicula = new DefaultListModel();
        jListBusquedaPeliculas.setModel(modeloBuscarPelicula);
        
        modeloBuscarCliente = new DefaultListModel();
        jListClienteID.setModel(modeloBuscarCliente);
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
        jButton1 = new javax.swing.JButton();
        jTBuscador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListBusquedaPeliculas = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPbotones1 = new javax.swing.JPanel();
        jBAlquilar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jPinformacionPeliculs = new javax.swing.JPanel();
        jLidAlquiler = new javax.swing.JLabel();
        jLtitulo = new javax.swing.JLabel();
        jLprecio = new javax.swing.JLabel();
        jLduracion = new javax.swing.JLabel();
        jLidPelicula = new javax.swing.JLabel();
        jTIDAlquiler = new javax.swing.JTextField();
        jTIDPelicula = new javax.swing.JTextField();
        jTxTitulo = new javax.swing.JTextField();
        jTPrecio = new javax.swing.JTextField();
        jLBuscarCliente1 = new javax.swing.JLabel();
        jTBuscarCliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListClienteID = new javax.swing.JList<>();
        jLCodigoCliente = new javax.swing.JLabel();
        jTCodigoCliente = new javax.swing.JTextField();
        JBRegistroCliente = new javax.swing.JButton();
        jTDuracion = new javax.swing.JTextField();
        jLabelEtiqueta = new javax.swing.JLabel();
        jLabelSinopsis = new javax.swing.JLabel();
        jLSinopsisTexto = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscador3.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 50, 40));

        jTBuscador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTBuscador.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBuscadorActionPerformed(evt);
            }
        });
        jTBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBuscadorKeyReleased(evt);
            }
        });
        jPanel2.add(jTBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 250, 40));

        jLabel1.setBackground(new java.awt.Color(238, 112, 82));
        jLabel1.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 112, 82));
        jLabel1.setText("Buscar Película:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 40));

        jListBusquedaPeliculas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jListBusquedaPeliculas.setFocusable(false);
        jListBusquedaPeliculas.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jListBusquedaPeliculas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 250, 62));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 130));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPbotones1.setBackground(new java.awt.Color(255, 255, 255));
        jPbotones1.setForeground(new java.awt.Color(102, 102, 102));
        jPbotones1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBAlquilar.setBackground(new java.awt.Color(238, 112, 82));
        jBAlquilar.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jBAlquilar.setForeground(new java.awt.Color(238, 112, 82));
        jBAlquilar.setText("Alquilar");
        jBAlquilar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jBAlquilar.setContentAreaFilled(false);
        jBAlquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlquilarActionPerformed(evt);
            }
        });
        jPbotones1.add(jBAlquilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 90, 30));

        jBeliminar.setBackground(new java.awt.Color(238, 112, 82));
        jBeliminar.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jBeliminar.setForeground(new java.awt.Color(238, 112, 82));
        jBeliminar.setText("Eliminar");
        jBeliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jBeliminar.setContentAreaFilled(false);
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });
        jPbotones1.add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 80, 30));

        jBmodificar.setBackground(new java.awt.Color(238, 112, 82));
        jBmodificar.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jBmodificar.setForeground(new java.awt.Color(238, 112, 82));
        jBmodificar.setText("Modificar");
        jBmodificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jBmodificar.setContentAreaFilled(false);
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });
        jPbotones1.add(jBmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 90, 30));

        jPanel4.add(jPbotones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 400, 80));

        jPinformacionPeliculs.setBackground(new java.awt.Color(255, 255, 255));
        jPinformacionPeliculs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLidAlquiler.setBackground(new java.awt.Color(238, 112, 82));
        jLidAlquiler.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLidAlquiler.setForeground(new java.awt.Color(238, 112, 82));
        jLidAlquiler.setText("ID Alquiler:");
        jPinformacionPeliculs.add(jLidAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLtitulo.setBackground(new java.awt.Color(238, 112, 82));
        jLtitulo.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLtitulo.setForeground(new java.awt.Color(238, 112, 82));
        jLtitulo.setText("Título:");
        jLtitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPinformacionPeliculs.add(jLtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, 30));

        jLprecio.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLprecio.setForeground(new java.awt.Color(238, 112, 82));
        jLprecio.setText("Precio:");
        jPinformacionPeliculs.add(jLprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLduracion.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLduracion.setForeground(new java.awt.Color(238, 112, 82));
        jLduracion.setText("Duración:");
        jPinformacionPeliculs.add(jLduracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, -1));

        jLidPelicula.setBackground(new java.awt.Color(238, 112, 82));
        jLidPelicula.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLidPelicula.setForeground(new java.awt.Color(238, 112, 82));
        jLidPelicula.setText("ID película:");
        jPinformacionPeliculs.add(jLidPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        jPinformacionPeliculs.add(jTIDAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 200, 30));
        jPinformacionPeliculs.add(jTIDPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 200, 30));

        jTxTitulo.setMinimumSize(new java.awt.Dimension(8, 20));
        jPinformacionPeliculs.add(jTxTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 200, 30));
        jPinformacionPeliculs.add(jTPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 200, 30));

        jLBuscarCliente1.setBackground(new java.awt.Color(238, 112, 82));
        jLBuscarCliente1.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLBuscarCliente1.setForeground(new java.awt.Color(238, 112, 82));
        jLBuscarCliente1.setText("Buscar Cliente:");
        jLBuscarCliente1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPinformacionPeliculs.add(jLBuscarCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 30));
        jPinformacionPeliculs.add(jTBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 200, 30));

        jListClienteID.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListClienteID);

        jPinformacionPeliculs.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 200, 50));

        jLCodigoCliente.setBackground(new java.awt.Color(238, 112, 82));
        jLCodigoCliente.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLCodigoCliente.setForeground(new java.awt.Color(238, 112, 82));
        jLCodigoCliente.setText("Codigo Cliente:");
        jLCodigoCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPinformacionPeliculs.add(jLCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, 30));
        jPinformacionPeliculs.add(jTCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 200, 30));

        JBRegistroCliente.setBackground(new java.awt.Color(238, 112, 82));
        JBRegistroCliente.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        JBRegistroCliente.setForeground(new java.awt.Color(238, 112, 82));
        JBRegistroCliente.setText("Registrar");
        JBRegistroCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        JBRegistroCliente.setContentAreaFilled(false);
        JBRegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRegistroClienteActionPerformed(evt);
            }
        });
        jPinformacionPeliculs.add(JBRegistroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 80, 30));
        jPinformacionPeliculs.add(jTDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 200, 30));

        jPanel4.add(jPinformacionPeliculs, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 360, 380));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 470, 500));

        jLabelEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Harry1png.png"))); // NOI18N
        jLabelEtiqueta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabelEtiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 220, 300));

        jLabelSinopsis.setBackground(new java.awt.Color(238, 112, 82));
        jLabelSinopsis.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelSinopsis.setForeground(new java.awt.Color(238, 112, 82));
        jLabelSinopsis.setText("Sinopsis:");
        jPanel1.add(jLabelSinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, -1, -1));

        jLSinopsisTexto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(jLSinopsisTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 220, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBAlquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlquilarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAlquilarActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jTBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscadorKeyReleased
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTBuscadorKeyReleased

    private void jTBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscadorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JBRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRegistroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBRegistroClienteActionPerformed

    //Método para cargar al JList el listado por nombre de Pelicula
    public void cargarPeliculasLista(ArrayList<Pelicula> listaPelicula) {
        modeloBuscarPelicula.removeAllElements();
        for (int i = 0; i < listaPelicula.size(); i++) {
            modeloBuscarPelicula.addElement(listaPelicula.get(i).getTitulo());

        }
        
    }
    
    //Método para cargar al JList el listado por id de Cliente
    public void cargarClientesLista(ArrayList<Cliente> listaCliente) {
        modeloBuscarCliente.removeAllElements();
        for (int i = 0; i < listaCliente.size(); i++) {
            modeloBuscarCliente.addElement(listaCliente.get(i).getNombreCliente());

        }
      
    }

    public JList<String> getjListBusquedaPeliculas() {
        return jListBusquedaPeliculas;
    }

    public JTextField getjTBuscador() {
        return jTBuscador;
    }

    public DefaultListModel getModelo() {
        return modeloBuscarPelicula;
    }

    public JTextField getjTDuracion() {
        return jTDuracion;
    }

    public JTextField getjTIDAlquiler() {
        return jTIDAlquiler;
    }

    public JTextField getjTIDPelicula() {
        return jTIDPelicula;
    }

    public JTextField getjTPrecio() {
        return jTPrecio;
    }

    public JTextField getjTxTitulo() {
        return jTxTitulo;
    }

    public JList<String> getjListClienteID() {
        return jListClienteID;
    }

    public JTextField getjTBuscarCliente() {
        return jTBuscarCliente;
    }

    public JLabel getjLabelEtiqueta() {
        return jLabelEtiqueta; 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBRegistroCliente;
    private javax.swing.JButton jBAlquilar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLBuscarCliente1;
    private javax.swing.JLabel jLCodigoCliente;
    private javax.swing.JLabel jLSinopsisTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEtiqueta;
    private javax.swing.JLabel jLabelSinopsis;
    private javax.swing.JLabel jLduracion;
    private javax.swing.JLabel jLidAlquiler;
    private javax.swing.JLabel jLidPelicula;
    private javax.swing.JList<String> jListBusquedaPeliculas;
    private javax.swing.JList<String> jListClienteID;
    private javax.swing.JLabel jLprecio;
    private javax.swing.JLabel jLtitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPbotones1;
    private javax.swing.JPanel jPinformacionPeliculs;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTBuscador;
    private javax.swing.JTextField jTBuscarCliente;
    private javax.swing.JTextField jTCodigoCliente;
    private javax.swing.JTextField jTDuracion;
    private javax.swing.JTextField jTIDAlquiler;
    private javax.swing.JTextField jTIDPelicula;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTextField jTxTitulo;
    // End of variables declaration//GEN-END:variables
}
