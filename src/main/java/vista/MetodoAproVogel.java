/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author cindy
 */
public class MetodoAproVogel extends javax.swing.JPanel {

    public MetodoAproVogel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(230, 230, 230));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 48, 71));
        jLabel2.setText("MÉTODO GRÁFICO ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 25));

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(33, 48, 71));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(33, 48, 71), null));
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 600, 100, 30));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(33, 48, 71));
        jLabel17.setText("RESPUESTA");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        txtRespuesta.setBackground(new java.awt.Color(204, 204, 204));
        txtRespuesta.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtRespuesta.setForeground(new java.awt.Color(33, 48, 71));
        txtRespuesta.setBorder(null);
        add(txtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 190, 25));

        txtTipo.setBackground(new java.awt.Color(230, 230, 230));
        txtTipo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        txtTipo.setForeground(new java.awt.Color(33, 48, 71));
        txtTipo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTipo.setBorder(null);
        add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 190, 25));

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

        jLabel3.setBackground(new java.awt.Color(230, 230, 230));
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 650, 150, 40));

        jLabel5.setBackground(new java.awt.Color(230, 230, 230));
        jLabel5.setOpaque(true);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 520, 30, 160));

        jLabel6.setBackground(new java.awt.Color(230, 230, 230));
        jLabel6.setOpaque(true);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 520, 30, 160));

        jLabel7.setBackground(new java.awt.Color(230, 230, 230));
        jLabel7.setOpaque(true);
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 485, 150, 40));

        jTextPane1.setBackground(new java.awt.Color(230, 230, 230));
        jTextPane1.setText("⠐⣪⡑⣤⣶⣶⣶⣦⡔⣩⡒⠀ ⢸⣯⣾⣿⢏⣿⣏⢿⣿⣮⣿⠀ ⢸⣿⢸⡗⣶⠙⢱⡖⣿⢸⣿⠀ ⢸⡿⠀⠳⣄⣐⣂⡴⠃⠸⣿⠀ ⣾⠃⠀⡵⡔⠕⠕⡰⡅⠀⢻⡆ ⢹⡆⠘⢴⠙⠑⠉⢳⡱⠀⣾⠁ ⠊⠀⠀⠈⡖⡖⡖⡎⠀⠀⠈⠂ ⠀⠀⠀⠀⠉⠁⠉⠁⠀⠀⠀⠀");
        jTextPane1.setToolTipText("");
        jScrollPane2.setViewportView(jTextPane1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, 130, 140));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField txtRespuesta;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
