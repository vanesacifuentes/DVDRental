/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternalFrame;

import Controlador.ControllerCategoria;
import Controlador.ControllerLenguaje;
import Modelo.*;
import JFrame.jFcategoria;
import JFrame.jFlenguaje;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nicol
 */
public class iFpelicula extends javax.swing.JInternalFrame {

    /**
     * Creates new form iFpelicula
     */
    
    int valor;
    public iFpelicula() {
        initComponents();
        activarCampos(false);

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
        jPingreso1 = new javax.swing.JPanel();
        jTid_peli = new javax.swing.JTextField();
        jTtitulo = new javax.swing.JTextField();
        jLlanguaje = new javax.swing.JLabel();
        jLaño = new javax.swing.JLabel();
        jLtitulo = new javax.swing.JLabel();
        jLtextoCompleto = new javax.swing.JLabel();
        jTaño = new javax.swing.JTextField();
        jLcategoria = new javax.swing.JLabel();
        jsinopsis = new javax.swing.JLabel();
        jLid = new javax.swing.JLabel();
        jLprecio = new javax.swing.JLabel();
        jLduracion = new javax.swing.JLabel();
        jTtarifa = new javax.swing.JTextField();
        jTduracion = new javax.swing.JTextField();
        jLcostoRe = new javax.swing.JLabel();
        jLclasificacion = new javax.swing.JLabel();
        jTcostoRe = new javax.swing.JTextField();
        jLcaracteristicas = new javax.swing.JLabel();
        jTcarateristicas = new javax.swing.JTextField();
        jTtextoCompleto = new javax.swing.JTextField();
        jLultimaAc = new javax.swing.JLabel();
        jTDuracionAlquiler = new javax.swing.JTextField();
        jLActor = new javax.swing.JLabel();
        jCBactor = new javax.swing.JComboBox();
        jCBlenguaje = new javax.swing.JComboBox();
        jCBcategoria = new javax.swing.JComboBox();
        tAsinopsis = new java.awt.TextArea();
        jCBClasificacion = new javax.swing.JComboBox<>();
        jBagregarActor = new javax.swing.JButton();
        jBagrgarCate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jBLenguaje = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPtabla1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPbotones1 = new javax.swing.JPanel();
        jBnuevo = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPingreso1.setBackground(new java.awt.Color(255, 255, 255));
        jPingreso1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos película", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Decker", 0, 14), new java.awt.Color(238, 112, 82))); // NOI18N
        jPingreso1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTid_peli.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTid_peli.setForeground(new java.awt.Color(102, 102, 102));
        jTid_peli.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTid_peli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTid_peliActionPerformed(evt);
            }
        });
        jPingreso1.add(jTid_peli, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 110, 20));

        jTtitulo.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTtitulo.setForeground(new java.awt.Color(102, 102, 102));
        jTtitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTtitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtituloActionPerformed(evt);
            }
        });
        jPingreso1.add(jTtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 240, 20));

        jLlanguaje.setBackground(new java.awt.Color(238, 112, 82));
        jLlanguaje.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLlanguaje.setForeground(new java.awt.Color(51, 51, 51));
        jLlanguaje.setText("Lenguaje:");
        jPingreso1.add(jLlanguaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 20));

        jLaño.setBackground(new java.awt.Color(238, 112, 82));
        jLaño.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLaño.setForeground(new java.awt.Color(51, 51, 51));
        jLaño.setText("Año de lanzamiento:");
        jPingreso1.add(jLaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 20));

        jLtitulo.setBackground(new java.awt.Color(238, 112, 82));
        jLtitulo.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLtitulo.setForeground(new java.awt.Color(51, 51, 51));
        jLtitulo.setText("Título:");
        jPingreso1.add(jLtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 20));

        jLtextoCompleto.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLtextoCompleto.setForeground(new java.awt.Color(51, 51, 51));
        jLtextoCompleto.setText("Texto completo:");
        jPingreso1.add(jLtextoCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jTaño.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTaño.setForeground(new java.awt.Color(102, 102, 102));
        jTaño.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTañoActionPerformed(evt);
            }
        });
        jTaño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTañoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTañoKeyTyped(evt);
            }
        });
        jPingreso1.add(jTaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 90, 20));

        jLcategoria.setBackground(new java.awt.Color(238, 112, 82));
        jLcategoria.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLcategoria.setForeground(new java.awt.Color(51, 51, 51));
        jLcategoria.setText("Categoría:");
        jPingreso1.add(jLcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jsinopsis.setBackground(new java.awt.Color(238, 112, 82));
        jsinopsis.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jsinopsis.setForeground(new java.awt.Color(51, 51, 51));
        jsinopsis.setText("Sinopsis:");
        jPingreso1.add(jsinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        jLid.setBackground(new java.awt.Color(238, 112, 82));
        jLid.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLid.setForeground(new java.awt.Color(51, 51, 51));
        jLid.setText("ID pelicula:");
        jPingreso1.add(jLid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLprecio.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLprecio.setText("Precio:");
        jPingreso1.add(jLprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jLduracion.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLduracion.setForeground(new java.awt.Color(51, 51, 51));
        jLduracion.setText("Duración:");
        jPingreso1.add(jLduracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 70, -1));

        jTtarifa.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTtarifa.setForeground(new java.awt.Color(102, 102, 102));
        jTtarifa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTtarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtarifaActionPerformed(evt);
            }
        });
        jTtarifa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTtarifaKeyTyped(evt);
            }
        });
        jPingreso1.add(jTtarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 90, 20));

        jTduracion.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTduracion.setForeground(new java.awt.Color(102, 102, 102));
        jTduracion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTduracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTduracionActionPerformed(evt);
            }
        });
        jTduracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTduracionKeyTyped(evt);
            }
        });
        jPingreso1.add(jTduracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 90, 20));

        jLcostoRe.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLcostoRe.setForeground(new java.awt.Color(51, 51, 51));
        jLcostoRe.setText("Costo de reemplazo:");
        jPingreso1.add(jLcostoRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLclasificacion.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLclasificacion.setText("Clasificación:");
        jPingreso1.add(jLclasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jTcostoRe.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTcostoRe.setForeground(new java.awt.Color(102, 102, 102));
        jTcostoRe.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTcostoRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcostoReActionPerformed(evt);
            }
        });
        jTcostoRe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTcostoReKeyTyped(evt);
            }
        });
        jPingreso1.add(jTcostoRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 90, 20));

        jLcaracteristicas.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLcaracteristicas.setForeground(new java.awt.Color(51, 51, 51));
        jLcaracteristicas.setText("Caracteristicas especiales:");
        jPingreso1.add(jLcaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jTcarateristicas.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTcarateristicas.setForeground(new java.awt.Color(102, 102, 102));
        jTcarateristicas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTcarateristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcarateristicasActionPerformed(evt);
            }
        });
        jPingreso1.add(jTcarateristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 240, 20));

        jTtextoCompleto.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTtextoCompleto.setForeground(new java.awt.Color(102, 102, 102));
        jTtextoCompleto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTtextoCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtextoCompletoActionPerformed(evt);
            }
        });
        jPingreso1.add(jTtextoCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 240, 20));

        jLultimaAc.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLultimaAc.setForeground(new java.awt.Color(51, 51, 51));
        jLultimaAc.setText("Duración Alquiler:");
        jPingreso1.add(jLultimaAc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 120, -1));

        jTDuracionAlquiler.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTDuracionAlquiler.setForeground(new java.awt.Color(102, 102, 102));
        jTDuracionAlquiler.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTDuracionAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDuracionAlquilerActionPerformed(evt);
            }
        });
        jTDuracionAlquiler.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDuracionAlquilerKeyTyped(evt);
            }
        });
        jPingreso1.add(jTDuracionAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 90, 20));

        jLActor.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLActor.setForeground(new java.awt.Color(51, 51, 51));
        jLActor.setText("Actor:");
        jPingreso1.add(jLActor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jCBactor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBactorActionPerformed(evt);
            }
        });
        jPingreso1.add(jCBactor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 90, -1));

        jCBlenguaje.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBlenguaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBlenguajeActionPerformed(evt);
            }
        });
        jPingreso1.add(jCBlenguaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 90, -1));

        jCBcategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBcategoriaActionPerformed(evt);
            }
        });
        jPingreso1.add(jCBcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 90, -1));
        jPingreso1.add(tAsinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 240, 100));

        jCBClasificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBClasificacionActionPerformed(evt);
            }
        });
        jPingreso1.add(jCBClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 90, -1));

        jBagregarActor.setText("+");
        jBagregarActor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActorActionPerformed(evt);
            }
        });
        jPingreso1.add(jBagregarActor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 20, -1));

        jBagrgarCate.setText("+");
        jBagrgarCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagrgarCateActionPerformed(evt);
            }
        });
        jPingreso1.add(jBagrgarCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 20, -1));

        jScrollPane1.setViewportView(jList1);

        jPingreso1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 140, 50));

        jScrollPane2.setViewportView(jList2);

        jPingreso1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 140, 50));

        jBLenguaje.setText("+");
        jBLenguaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLenguajeActionPerformed(evt);
            }
        });
        jPingreso1.add(jBLenguaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 20, -1));

        jButton1.setText("Quitar");
        jPingreso1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jButton2.setText("Quitar");
        jPingreso1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        jPanel1.add(jPingreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 660, 460));

        jPtabla1.setBackground(new java.awt.Color(255, 255, 255));
        jPtabla1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPtabla1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(51, 51, 51));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID ", "Título", "Año Lanzamiento", "Duración"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPtabla1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 90));

        jPanel1.add(jPtabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 660, 90));

        jPbotones1.setBackground(new java.awt.Color(255, 255, 255));
        jPbotones1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPbotones1.setForeground(new java.awt.Color(102, 102, 102));
        jPbotones1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPbotones1.add(jBnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 60, 30));

        jBmodificar.setBackground(new java.awt.Color(238, 112, 82));
        jBmodificar.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jBmodificar.setForeground(new java.awt.Color(238, 112, 82));
        jBmodificar.setText("Modificar");
        jBmodificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jBmodificar.setContentAreaFilled(false);
        jPbotones1.add(jBmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 80, 30));

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
        jPbotones1.add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 70, 30));

        jPanel1.add(jPbotones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 660, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTid_peliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTid_peliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTid_peliActionPerformed

    private void jTtituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtituloActionPerformed

    private void jTañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTañoActionPerformed

    private void jTtarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtarifaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtarifaActionPerformed

    private void jTduracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTduracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTduracionActionPerformed

    private void jTcostoReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcostoReActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcostoReActionPerformed

    private void jTcarateristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcarateristicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcarateristicasActionPerformed

    private void jTtextoCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtextoCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtextoCompletoActionPerformed

    private void jTDuracionAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDuracionAlquilerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDuracionAlquilerActionPerformed

    private void jCBactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBactorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBactorActionPerformed

    private void jCBlenguajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBlenguajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBlenguajeActionPerformed

    private void jCBcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBcategoriaActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jCBClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBClasificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBClasificacionActionPerformed

    private void jTañoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTañoKeyPressed
        // TODO add your handling code here:
       //evt.consume();
//        char h =  evt.getKeyChar();
//        
//        String cadena = Character.toString(h);
//        try{
//            int a = Integer.parseInt(cadena);
//        }catch(NumberFormatException e)
//        {
//            
//        }
        
        
        
        
        
    }//GEN-LAST:event_jTañoKeyPressed

    private void jTañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTañoKeyTyped
        validaNumero(evt.getKeyChar(),evt); 
    }//GEN-LAST:event_jTañoKeyTyped

    private void jTtarifaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTtarifaKeyTyped
        validaNumero(evt.getKeyChar(),evt);
    }//GEN-LAST:event_jTtarifaKeyTyped

    private void jTDuracionAlquilerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDuracionAlquilerKeyTyped
        validaNumero(evt.getKeyChar(),evt);
    }//GEN-LAST:event_jTDuracionAlquilerKeyTyped

    private void jTcostoReKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcostoReKeyTyped
        validaNumero(evt.getKeyChar(),evt);
    }//GEN-LAST:event_jTcostoReKeyTyped

    private void jTduracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTduracionKeyTyped
        validaNumero(evt.getKeyChar(),evt);
    }//GEN-LAST:event_jTduracionKeyTyped

    private void jBagregarActorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBagregarActorActionPerformed

    private void jBagrgarCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagrgarCateActionPerformed
        // TODO add your handling code here:
        jFcategoria vista = new jFcategoria();
        CategoriaDAO modelo = new CategoriaDAO();
        ControllerCategoria categoriaControlador = new ControllerCategoria(vista, modelo);
        vista.setVisible(true);
        
    }//GEN-LAST:event_jBagrgarCateActionPerformed

    private void jBLenguajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLenguajeActionPerformed
//        jFlenguaje vista = new jFlenguaje();
//        LenguajeDAO modelo = new LenguajeDAO();
//        ControllerLenguaje lenguajeControlador = new ControllerLenguaje(vista, modelo);
//        vista.setVisible(true);
    }//GEN-LAST:event_jBLenguajeActionPerformed

    public void validaNumero(char c,KeyEvent evt)
    {
        if(!Character.isDigit(c))
           evt.consume();
    }
    
    
    public void activarCampos(Boolean b) {
        jTDuracionAlquiler.setEnabled(b);
        jTaño.setEnabled(b);
        jTtitulo.setEnabled(b);
        jCBlenguaje.setEnabled(b);
        jCBcategoria.setEnabled(b);
        jCBactor.setEnabled(b);
        jCBClasificacion.setEnabled(b);
        jTtarifa.setEnabled(b);
        jTduracion.setEnabled(b);
        jTcostoRe.setEnabled(b);
        jTcarateristicas.setEnabled(b);
        jTtextoCompleto.setEnabled(b);
        tAsinopsis.setEnabled(b);
    }

    public void setearCampos() {
        
        jTDuracionAlquiler.setText("");
        jTaño.setText("");
        jTtitulo.setText("");
        jCBlenguaje.setSelectedIndex(0);
        jCBcategoria.setSelectedIndex(0);
        jCBactor.setSelectedIndex(0);
        jCBClasificacion.setSelectedIndex(0);
        jTtarifa.setText("");
        jTduracion.setText("");
        jTcostoRe.setText("");
        jTcarateristicas.setText("");
        jTtextoCompleto.setText("");
        tAsinopsis.setText("");
        jTid_peli.setText("" + valor);
        
        
        
    }

    public void addListenerBtnNuevo(ActionListener listenPelicula) {
        jBnuevo.addActionListener(listenPelicula);
    }

    public void addMouseListenerTabla(MouseListener listener) {
        jTable2.addMouseListener(listener);

    }

    public void cargarPeliculasTabla(ArrayList<Pelicula> listadoPelicula) {
        DefaultTableModel defaultCombo;
        defaultCombo = (DefaultTableModel) jTable2.getModel();
        limpiarListadoTabla();
        for (int i = 0; i < listadoPelicula.size(); i++) {
            defaultCombo.addRow(new Object[]{
                listadoPelicula.get(i).getPeliculaId(),
                listadoPelicula.get(i).getTitulo(),
                //listadoPelicula.get(i).getDescripcion(),
                listadoPelicula.get(i).getAnhoLanzamiento(),
                //listadoPelicula.get(i).getLenguajeID(),
                //listadoPelicula.get(i).getDuracionRenta(),
                // listadoPelicula.get(i).getTarifaRenta(),
                listadoPelicula.get(i).getLongitud() + " Minutos", //listadoPelicula.get(i).getCostoReemplazo(),
            //listadoPelicula.get(i).getClasificacion(),
            //listadoPelicula.get(i).getUltimaActualizacion(),
            //listadoPelicula.get(i).getCaracteristicasEspeciales(),
            //listadoPelicula.get(i).getTextoCompleto()});      
            });
        }

        //Muestra en el campo de texto de la Interfaz el ID cliente Consecutivo
        valor = Integer.parseInt("" + defaultCombo.getValueAt(defaultCombo.getRowCount() - 1, 0)) + 1;
        jTid_peli.setText("" + valor);
        jTid_peli.setEnabled(false);

    }

    public void cargarClasificacionCombo() {
        DefaultComboBoxModel model;

        String[] arregloClasificacion = new String[5];

        arregloClasificacion[0] = "G";
        arregloClasificacion[1] = "NC-17";
        arregloClasificacion[2] = "PG-13";
        arregloClasificacion[3] = "R";
        arregloClasificacion[4] = "PG";
        model = new DefaultComboBoxModel(arregloClasificacion);

        jCBClasificacion.setModel(model);

    }

    private void limpiarListadoTabla() {
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable2.getModel();
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    /* 
     public void activarControles(boolean estado){
        txtCodigo.setEnabled(estado);
        txtNombre.setEnabled(estado);
        cbxNivel.setEnabled(estado);
        txtCreditos.setEnabled(estado);        
        btnBorrar.setEnabled(!estado);
        btnCerrar.setEnabled(!estado);
        jtListado.setEnabled(!estado);
    }*/

    public void cargarCategoriasCombo(ArrayList<Categoria> listadoCategoria) {
        DefaultComboBoxModel model;
        String[] arregloCategorias = new String[listadoCategoria.size()];

        for (int a = 0; a < listadoCategoria.size(); a++) {
            arregloCategorias[a] = listadoCategoria.get(a).getNombreCategoria();
        }

        model = new DefaultComboBoxModel(arregloCategorias);

        jCBcategoria.setModel(model);
    }

    public void cargarLenguajesCombo(ArrayList<Lenguaje> listadoLenguaje) {
        DefaultComboBoxModel model;
        String[] arregloCategorias = new String[listadoLenguaje.size()];

        for (int a = 0; a < listadoLenguaje.size(); a++) {
            arregloCategorias[a] = listadoLenguaje.get(a).getNombreLenguaje();
        }

        model = new DefaultComboBoxModel(arregloCategorias);

        jCBlenguaje.setModel(model);

    }

    //Método para cargar actores al comboBox Actores
    public void cargarActorCombo(ArrayList<Actor> listadoActores) {
        DefaultComboBoxModel model;

        String[] arregloActores = new String[listadoActores.size()];

        for (int a = 0; a < listadoActores.size(); a++) {
            arregloActores[a] = listadoActores.get(a).getNombreActor() + " " + listadoActores.get(a).getApellidoActor();
        }
        model = new DefaultComboBoxModel(arregloActores);

        jCBactor.setModel(model);
    }

    public void gestionMensajes(String mensaje, String titulo, int icono) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, icono);
    }

    public JComboBox getjCBactor() {
        return jCBactor;
    }

    public JComboBox getjCBcategoria() {
        return jCBcategoria;
    }

    public JComboBox getjCBlenguaje() {
        return jCBlenguaje;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public JTextField getjTaño() {
        return jTaño;
    }

    public JTextField getjTcarateristicas() {
        return jTcarateristicas;
    }

    public JComboBox getjCBClasificacion() {
        return jCBClasificacion;
    }

    public JTextField getjTcostoRe() {
        return jTcostoRe;
    }

    public JTable getjTable2() {
        return jTable2;
    }

    public JTextField getjTduracion() {
        return jTduracion;
    }

    public JTextField getjTid_peli() {
        return jTid_peli;
    }

    public JTextField getjTtarifa() {
        return jTtarifa;
    }

    public JTextField getjTtextoCompleto() {
        return jTtextoCompleto;
    }

    public JTextField getjTtitulo() {
        return jTtitulo;
    }

    public JTextField getjTDuracionAlquiler() {
        return jTDuracionAlquiler;
    }

    public TextArea gettAsinopsis() {
        return tAsinopsis;
    }

    public JButton getjBagregarActor() {
        return jBagregarActor;
    }

    public JButton getjBagregarLen() {
        return jBLenguaje;
    }

    public JButton getjBagrgarCate() {
        return jBagrgarCate;
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

    public JButton getjBLenguaje() {

        return jBLenguaje;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLenguaje;
    private javax.swing.JButton jBagregarActor;
    private javax.swing.JButton jBagrgarCate;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCBClasificacion;
    private javax.swing.JComboBox jCBactor;
    private javax.swing.JComboBox jCBcategoria;
    private javax.swing.JComboBox jCBlenguaje;
    private javax.swing.JLabel jLActor;
    private javax.swing.JLabel jLaño;
    private javax.swing.JLabel jLcaracteristicas;
    private javax.swing.JLabel jLcategoria;
    private javax.swing.JLabel jLclasificacion;
    private javax.swing.JLabel jLcostoRe;
    private javax.swing.JLabel jLduracion;
    private javax.swing.JLabel jLid;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JLabel jLlanguaje;
    private javax.swing.JLabel jLprecio;
    private javax.swing.JLabel jLtextoCompleto;
    private javax.swing.JLabel jLtitulo;
    private javax.swing.JLabel jLultimaAc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPbotones1;
    private javax.swing.JPanel jPingreso1;
    private javax.swing.JPanel jPtabla1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTDuracionAlquiler;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTaño;
    private javax.swing.JTextField jTcarateristicas;
    private javax.swing.JTextField jTcostoRe;
    private javax.swing.JTextField jTduracion;
    private javax.swing.JTextField jTid_peli;
    private javax.swing.JTextField jTtarifa;
    private javax.swing.JTextField jTtextoCompleto;
    private javax.swing.JTextField jTtitulo;
    private javax.swing.JLabel jsinopsis;
    private java.awt.TextArea tAsinopsis;
    // End of variables declaration//GEN-END:variables
}
