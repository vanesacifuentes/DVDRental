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
import JFrame.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
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
        jTBuscadorPelicula = new javax.swing.JTextField();
        jLCantidadDisponibles = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListBusquedaPeliculas = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLCantidadTotal = new javax.swing.JLabel();
        jLCantTotalnum = new javax.swing.JLabel();
        jLCantidadDisponum = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPinformacionPeliculs1 = new javax.swing.JPanel();
        jLCodigoCliente = new javax.swing.JLabel();
        jTBuscarCliente = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListClienteID = new javax.swing.JList<>();
        jLBuscarCliente4 = new javax.swing.JLabel();
        jLNombreCliente = new javax.swing.JLabel();
        jLIDCliente = new javax.swing.JLabel();
        jPinformacionPeliculs2 = new javax.swing.JPanel();
        jLidAlquiler2 = new javax.swing.JLabel();
        jLtitulo4 = new javax.swing.JLabel();
        jTIDAlquiler = new javax.swing.JTextField();
        jLCodigoCliente2 = new javax.swing.JLabel();
        jLTitulo = new javax.swing.JLabel();
        jLtitulo5 = new javax.swing.JLabel();
        jLPrecio = new javax.swing.JLabel();
        jDateChooserDev = new com.toedter.calendar.JDateChooser();
        jPbotones1 = new javax.swing.JPanel();
        jBAlquilar = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jLabelEtiqueta = new javax.swing.JLabel();
        jLabelSinopsis = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTAreaSinopsis = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(761, 681));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda Película", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(238, 112, 82))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscador3.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 40, 40));

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
        jPanel2.add(jTBuscadorPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 250, 30));

        jLCantidadDisponibles.setBackground(new java.awt.Color(238, 112, 82));
        jLCantidadDisponibles.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLCantidadDisponibles.setForeground(new java.awt.Color(51, 51, 51));
        jLCantidadDisponibles.setText("Cantidad disponibles:");
        jPanel2.add(jLCantidadDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 40));

        jListBusquedaPeliculas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jListBusquedaPeliculas.setFocusable(false);
        jListBusquedaPeliculas.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jListBusquedaPeliculas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 250, 60));

        jLabel2.setBackground(new java.awt.Color(238, 112, 82));
        jLabel2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Ingrese Película:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 40));

        jLCantidadTotal.setBackground(new java.awt.Color(238, 112, 82));
        jLCantidadTotal.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLCantidadTotal.setForeground(new java.awt.Color(51, 51, 51));
        jLCantidadTotal.setText("Cantidad total:");
        jPanel2.add(jLCantidadTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 40));

        jLCantTotalnum.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(jLCantTotalnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 60, 20));

        jLCantidadDisponum.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(jLCantidadDisponum, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 60, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 440, 200));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPinformacionPeliculs1.setBackground(new java.awt.Color(255, 255, 255));
        jPinformacionPeliculs1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(238, 112, 82))); // NOI18N
        jPinformacionPeliculs1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLCodigoCliente.setBackground(new java.awt.Color(238, 112, 82));
        jLCodigoCliente.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLCodigoCliente.setForeground(new java.awt.Color(51, 51, 51));
        jLCodigoCliente.setText("Nombre Cliente:");
        jLCodigoCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPinformacionPeliculs1.add(jLCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 30));

        jTBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBuscarClienteActionPerformed(evt);
            }
        });
        jPinformacionPeliculs1.add(jTBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 200, 30));

        jScrollPane5.setViewportView(jListClienteID);

        jPinformacionPeliculs1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 200, 60));

        jLBuscarCliente4.setBackground(new java.awt.Color(238, 112, 82));
        jLBuscarCliente4.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLBuscarCliente4.setForeground(new java.awt.Color(51, 51, 51));
        jLBuscarCliente4.setText("Buscar Cliente:");
        jLBuscarCliente4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPinformacionPeliculs1.add(jLBuscarCliente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        jLNombreCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPinformacionPeliculs1.add(jLNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 210, 30));

        jLIDCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPinformacionPeliculs1.add(jLIDCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 104, 50, 40));

        jPanel4.add(jPinformacionPeliculs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 440, 160));

        jPinformacionPeliculs2.setBackground(new java.awt.Color(255, 255, 255));
        jPinformacionPeliculs2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Película", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(238, 112, 82))); // NOI18N
        jPinformacionPeliculs2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLidAlquiler2.setBackground(new java.awt.Color(238, 112, 82));
        jLidAlquiler2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLidAlquiler2.setForeground(new java.awt.Color(51, 51, 51));
        jLidAlquiler2.setText("ID Alquiler:");
        jPinformacionPeliculs2.add(jLidAlquiler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLtitulo4.setBackground(new java.awt.Color(238, 112, 82));
        jLtitulo4.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLtitulo4.setForeground(new java.awt.Color(51, 51, 51));
        jLtitulo4.setText("Precio:");
        jLtitulo4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPinformacionPeliculs2.add(jLtitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 60, 30));
        jPinformacionPeliculs2.add(jTIDAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 80, 30));

        jLCodigoCliente2.setBackground(new java.awt.Color(238, 112, 82));
        jLCodigoCliente2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLCodigoCliente2.setForeground(new java.awt.Color(51, 51, 51));
        jLCodigoCliente2.setText("Fecha Devolución:");
        jLCodigoCliente2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPinformacionPeliculs2.add(jLCodigoCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 30));

        jLTitulo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPinformacionPeliculs2.add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 240, 30));

        jLtitulo5.setBackground(new java.awt.Color(238, 112, 82));
        jLtitulo5.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLtitulo5.setForeground(new java.awt.Color(51, 51, 51));
        jLtitulo5.setText("Título:");
        jLtitulo5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPinformacionPeliculs2.add(jLtitulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 40, 30));

        jLPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPinformacionPeliculs2.add(jLPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 90, 30));

        jDateChooserDev.setDateFormatString("yyyy/MM/dd HH:mm:ss");
        jDateChooserDev.setMinSelectableDate(new java.util.Date(1568523600000L));
        jPinformacionPeliculs2.add(jDateChooserDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 120, 30));

        jPanel4.add(jPinformacionPeliculs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 440, 190));

        jPbotones1.setBackground(new java.awt.Color(255, 255, 255));
        jPbotones1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
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
        jPbotones1.add(jBAlquilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 90, 30));

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
        jPbotones1.add(jBmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 90, 30));

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

        jPanel4.add(jPbotones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 440, 70));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 480, 470));

        jLabelEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Harry1png.png"))); // NOI18N
        jLabelEtiqueta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabelEtiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 220, 300));

        jLabelSinopsis.setBackground(new java.awt.Color(238, 112, 82));
        jLabelSinopsis.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabelSinopsis.setForeground(new java.awt.Color(238, 112, 82));
        jLabelSinopsis.setText("Sinopsis:");
        jPanel1.add(jLabelSinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        jTAreaSinopsis.setEditable(false);
        jTAreaSinopsis.setColumns(20);
        jTAreaSinopsis.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTAreaSinopsis.setRows(5);
        jTAreaSinopsis.setAutoscrolls(false);
        jTAreaSinopsis.setBorder(null);
        jTAreaSinopsis.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTAreaSinopsis.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTAreaSinopsis.setDropMode(javax.swing.DropMode.INSERT);
        jScrollPane3.setViewportView(jTAreaSinopsis);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 220, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, Short.MAX_VALUE)
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

    private void jTBuscadorPeliculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscadorPeliculaKeyReleased
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTBuscadorPeliculaKeyReleased

    private void jTBuscadorPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBuscadorPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscadorPeliculaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        jFinventario inventarioView = new jFinventario();
        inventarioView.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBuscarClienteActionPerformed

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
    
    //Mensajes
    public void gestionMensajes(String mensaje, String titulo, int icono) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, icono);
    }

    public JList<String> getjListBusquedaPeliculas() {
        return jListBusquedaPeliculas;
    }

    public JTextField getjTBuscadorPelicula() {
        return jTBuscadorPelicula;
    }

    public DefaultListModel getModeloBuscarPeliculas() {
        return modeloBuscarPelicula;
    }

    public DefaultListModel getModeloBuscarCliente() {
        return modeloBuscarCliente;
    }

    public JLabel getjLIDCliente() {
        return jLIDCliente;
    }
    

    public JButton getjBAlquilar() {
        return jBAlquilar;
    }

    public JButton getjBeliminar() {
        return jBeliminar;
    }

    public JButton getjBmodificar() {
        return jBmodificar;
    }


    public JTextArea getjTAreaSinopsis() {
        return jTAreaSinopsis;
    }

    public JTextField getjTBuscarCliente() {
        return jTBuscarCliente;
    }

    public JLabel getjLPrecio() {
        return jLPrecio;
    }

    public JLabel getjLTitulo() {
        return jLTitulo;
    }

    public JTextField getjTIDAlquiler() {
        return jTIDAlquiler;
    }

    public JDateChooser getjDateChooserDev() {
        return jDateChooserDev;
    }

    public JList<String> getjListClienteID() {
        return jListClienteID;
    }

    public JLabel getjLCodigoCliente() {
        return jLCodigoCliente;
    }

    public JLabel getjLNombreCliente() {
        return jLNombreCliente;
    }

    public JLabel getjLCantTotalnum() {
        return jLCantTotalnum;
    }

    public JLabel getjLCantidadDisponum() {
        return jLCantidadDisponum;
    }
    
    
    
    

 
    //Escuchas
      public void addListenerBtnActualizar(ActionListener listenalquiler) {
        jBAlquilar.addActionListener(listenalquiler);
    }
    
    public void addListenerBtnModificar(ActionListener listenalquiler) {
        jBmodificar.addActionListener(listenalquiler);
    }
    
    public void addListenerBtnEliminar(ActionListener listenalquiler) {
        jBeliminar.addActionListener(listenalquiler);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlquilar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooserDev;
    private javax.swing.JLabel jLBuscarCliente4;
    private javax.swing.JLabel jLCantTotalnum;
    private javax.swing.JLabel jLCantidadDisponibles;
    private javax.swing.JLabel jLCantidadDisponum;
    private javax.swing.JLabel jLCantidadTotal;
    private javax.swing.JLabel jLCodigoCliente;
    private javax.swing.JLabel jLCodigoCliente2;
    private javax.swing.JLabel jLIDCliente;
    private javax.swing.JLabel jLNombreCliente;
    private javax.swing.JLabel jLPrecio;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEtiqueta;
    private javax.swing.JLabel jLabelSinopsis;
    private javax.swing.JLabel jLidAlquiler2;
    private javax.swing.JList<String> jListBusquedaPeliculas;
    private javax.swing.JList<String> jListClienteID;
    private javax.swing.JLabel jLtitulo4;
    private javax.swing.JLabel jLtitulo5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPbotones1;
    private javax.swing.JPanel jPinformacionPeliculs1;
    private javax.swing.JPanel jPinformacionPeliculs2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTAreaSinopsis;
    private javax.swing.JTextField jTBuscadorPelicula;
    private javax.swing.JTextField jTBuscarCliente;
    private javax.swing.JTextField jTIDAlquiler;
    // End of variables declaration//GEN-END:variables
}
