/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author cindy
 */
public class MetodoCostoMinimo extends javax.swing.JPanel {

    public MetodoCostoMinimo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnDF = new javax.swing.JButton();
        btnFI = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar2 = new javax.swing.JButton();
        txtDemanda = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRespuesta1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(230, 230, 230));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 48, 71));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Resultados");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 100, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 48, 71));
        jLabel2.setText("MÉTODO COSTO MÍNIMO ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, 25));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(33, 48, 71));
        jLabel17.setText("Demanda:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, 30));

        btnDF.setBackground(new java.awt.Color(204, 204, 204));
        btnDF.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnDF.setForeground(new java.awt.Color(33, 48, 71));
        btnDF.setText("DEMANDA FINAL");
        btnDF.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(33, 48, 71), null));
        btnDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDFActionPerformed(evt);
            }
        });
        add(btnDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 130, 30));

        btnFI.setBackground(new java.awt.Color(204, 204, 204));
        btnFI.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnFI.setForeground(new java.awt.Color(33, 48, 71));
        btnFI.setText("FORMA INICIAL");
        btnFI.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(33, 48, 71), null));
        btnFI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFIActionPerformed(evt);
            }
        });
        add(btnFI, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 130, 30));

        btnCalcular.setBackground(new java.awt.Color(204, 204, 204));
        btnCalcular.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(33, 48, 71));
        btnCalcular.setText("CALCULAR");
        btnCalcular.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(33, 48, 71), null));
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 100, 30));

        btnLimpiar2.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnLimpiar2.setForeground(new java.awt.Color(33, 48, 71));
        btnLimpiar2.setText("LIMPIAR");
        btnLimpiar2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(33, 48, 71), null));
        btnLimpiar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar2ActionPerformed(evt);
            }
        });
        add(btnLimpiar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 100, 30));

        txtDemanda.setBackground(new java.awt.Color(204, 204, 204));
        txtDemanda.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtDemanda.setForeground(new java.awt.Color(33, 48, 71));
        txtDemanda.setBorder(null);
        add(txtDemanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 100, 30));

        txtTipo.setBackground(new java.awt.Color(230, 230, 230));
        txtTipo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        txtTipo.setForeground(new java.awt.Color(33, 48, 71));
        txtTipo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTipo.setBorder(null);
        add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 370, 25));

        jSeparator1.setBackground(new java.awt.Color(33, 48, 71));
        jSeparator1.setForeground(new java.awt.Color(33, 48, 71));
        jSeparator1.setOpaque(true);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 980, 2));

        jSeparator2.setBackground(new java.awt.Color(33, 48, 71));
        jSeparator2.setForeground(new java.awt.Color(33, 48, 71));
        jSeparator2.setOpaque(true);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 663, 980, 2));

        jSeparator3.setBackground(new java.awt.Color(33, 48, 71));
        jSeparator3.setForeground(new java.awt.Color(33, 48, 71));
        jSeparator3.setOpaque(true);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(942, -7, 2, 700));

        jLabel7.setBackground(new java.awt.Color(230, 230, 230));
        jLabel7.setOpaque(true);
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 485, 150, 40));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(33, 48, 71));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("RESPUESTA");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 140, 20));

        jLabel5.setBackground(new java.awt.Color(230, 230, 230));
        jLabel5.setOpaque(true);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 520, 30, 160));

        jLabel6.setBackground(new java.awt.Color(230, 230, 230));
        jLabel6.setOpaque(true);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 520, 30, 160));

        jLabel3.setBackground(new java.awt.Color(230, 230, 230));
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 650, 150, 40));

        txtRespuesta1.setBackground(new java.awt.Color(204, 204, 204));
        txtRespuesta1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtRespuesta1.setForeground(new java.awt.Color(33, 48, 71));
        txtRespuesta1.setBorder(null);
        add(txtRespuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 130, 25));

        tblDatos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        tblDatos.setForeground(new java.awt.Color(33, 48, 71));
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 710, 170));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 340, 210));

        jTextPane1.setBackground(new java.awt.Color(230, 230, 230));
        jTextPane1.setText("⠐⣪⡑⣤⣶⣶⣶⣦⡔⣩⡒⠀ ⢸⣯⣾⣿⢏⣿⣏⢿⣿⣮⣿⠀ ⢸⣿⢸⡗⣶⠙⢱⡖⣿⢸⣿⠀ ⢸⡿⠀⠳⣄⣐⣂⡴⠃⠸⣿⠀ ⣾⠃⠀⡵⡔⠕⠕⡰⡅⠀⢻⡆ ⢹⡆⠘⢴⠙⠑⠉⢳⡱⠀⣾⠁ ⠊⠀⠀⠈⡖⡖⡖⡎⠀⠀⠈⠂ ⠀⠀⠀⠀⠉⠁⠉⠁⠀⠀⠀⠀");
        jTextPane1.setToolTipText("");
        jScrollPane2.setViewportView(jTextPane1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, 130, 140));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDFActionPerformed
        
        // Mostrar la imagen en el JLabel
        txtTipo.setText(" - DEMANDA FICTISIA");
        
        String demandaTexto = txtDemanda.getText().trim();
        if (demandaTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un número de demandas");
            return;
        }

        int numDemandas;
        try {
            numDemandas = Integer.parseInt(demandaTexto);
            if (numDemandas <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido mayor que 0");
            return;
        }

        // --- Construir nombres de columnas ---
        String[] columnas = new String[numDemandas + 3]; // +3: Suministro, DF, Oferta
        columnas[0] = "Suministro";
        for (int i = 1; i <= numDemandas; i++) {
            columnas[i] = "D" + i;
        }
        columnas[columnas.length - 2] = "DF";       // Penúltima columna
        columnas[columnas.length - 1] = "Oferta";   // Última columna

        // --- Crear modelo vacío ---
        javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(columnas, 0);
        tblDatos.setModel(modelo);

        // --- Agregar filas de Suministro ---
        for (int i = 1; i < numDemandas; i++) { // desde 1 hasta numDemandas-1
            Object[] fila = new Object[columnas.length];
            fila[0] = "Suministro " + i;
            modelo.addRow(fila);
        }

        // --- Agregar fila de Demanda ---
        Object[] filaDemanda = new Object[columnas.length];
        filaDemanda[0] = "Demanda";
        modelo.addRow(filaDemanda);

        // --- Ajustar ancho de columnas ---
        tblDatos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        javax.swing.table.TableColumnModel columnModel = tblDatos.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            if (i == 0 || i == columnModel.getColumnCount() - 1 || i == columnModel.getColumnCount() - 2) {
                columnModel.getColumn(i).setPreferredWidth(100); // Suministro, DF y Oferta
            } else {
                columnModel.getColumn(i).setPreferredWidth(80);  // Demanda
            }
        }
    }//GEN-LAST:event_btnDFActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnFIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFIActionPerformed
       
        // Mostrar la imagen en el JLabel
        txtTipo.setText(" - FORMA INICIAL");
        
        String demandaTexto = txtDemanda.getText().trim();
        if (demandaTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un número de demandas");
            return;
        }

        int numDemandas;
        try {
            numDemandas = Integer.parseInt(demandaTexto);
            if (numDemandas <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido mayor que 0");
            return;
        }

        // --- Construir nombres de columnas ---
        String[] columnas = new String[numDemandas + 2]; // +2 por Suministro y Oferta
        columnas[0] = "Suministro";
        for (int i = 1; i <= numDemandas; i++) {
            columnas[i] = "D" + i;
        }
        columnas[columnas.length - 1] = "Oferta";

        // --- Crear modelo vacío ---
        javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(columnas, 0);
        tblDatos.setModel(modelo);

        // --- Agregar filas de Suministro ---
        for (int i = 1; i < numDemandas; i++) { // desde 1 hasta numDemandas-1
            Object[] fila = new Object[columnas.length];
            fila[0] = "Suministro " + i;
            modelo.addRow(fila);
        }

        // --- Agregar fila de Demanda ---
        Object[] filaDemanda = new Object[columnas.length];
        filaDemanda[0] = "Demanda";
        modelo.addRow(filaDemanda);

        // --- Ajustar ancho de columnas ---
        tblDatos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        javax.swing.table.TableColumnModel columnModel = tblDatos.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            if (i == 0 || i == columnModel.getColumnCount() - 1) {
                columnModel.getColumn(i).setPreferredWidth(100); // Suministro y Oferta
            } else {
                columnModel.getColumn(i).setPreferredWidth(80);  // Demanda
            }
        }
    }//GEN-LAST:event_btnFIActionPerformed

    private void btnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    public javax.swing.JButton btnDF;
    public javax.swing.JButton btnFI;
    public javax.swing.JButton btnLimpiar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    public javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtDemanda;
    private javax.swing.JTextField txtRespuesta1;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
