/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.RenderingHints;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
//import java.util.List;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cindy
 */
public class MetodoGrafico extends javax.swing.JPanel {

    public MetodoGrafico() {
        initComponents();
    }

//    private void initComponents() {
//        setLayout(new BorderLayout());
//
//        // Panel superior con tabla y campos
//        JPanel pnlSuperior = new JPanel(new BorderLayout());
//
//        // Modelo de tabla
//        String[] columnas = {"X", "Y", "Signo", "Z"};
//        Object[][] datos = {
//            {2, 3, "<=", 9},
//            {3, 2, "<=", 12},
//            {1, 0, "<=", 4}
//        };
//        tblRestricciones = new JTable(new javax.swing.table.DefaultTableModel(datos, columnas));
//        pnlSuperior.add(new JScrollPane(tblRestricciones), BorderLayout.CENTER);
//
//        // Panel de controles
//        JPanel pnlControles = new JPanel();
//        pnlControles.add(new JLabel("EX:"));
//        txtEX = new JTextField("2", 5);
//        pnlControles.add(txtEX);
//        pnlControles.add(new JLabel("EY:"));
//        txtEY = new JTextField("3", 5);
//        pnlControles.add(txtEY);
//
//        btnMinimizar = new JButton("Graficar");
//        pnlControles.add(btnMinimizar);
//
//        pnlSuperior.add(pnlControles, BorderLayout.SOUTH);
//
//        add(pnlSuperior, BorderLayout.NORTH);
//
//        // Panel de la gráfica
//        pnlGrafica = new JPanel();
//        pnlGrafica.setBackground(Color.WHITE);
//        add(pnlGrafica, BorderLayout.CENTER);
//
//        // Acción del botón
//        btnMinimizar.addActionListener(evt -> graficar());
//    }
//
//    // 🔹 Obtiene puntos de la tabla
//    private List<double[]> obtenerPuntos() {
//        List<double[]> puntos = new ArrayList<>();
//
//        for (int i = 0; i < tblRestricciones.getRowCount(); i++) {
//            double a = Double.parseDouble(tblRestricciones.getValueAt(i, 0).toString());
//            double b = Double.parseDouble(tblRestricciones.getValueAt(i, 1).toString());
//            double c = Double.parseDouble(tblRestricciones.getValueAt(i, 3).toString());
//
//            if (a != 0 && b != 0) {
//                puntos.add(new double[]{c / a, 0}); // intersección con X
//                puntos.add(new double[]{0, c / b}); // intersección con Y
//            } else {
//                if (a != 0 && b == 0) {
//                    puntos.add(new double[]{c / a, 0}); // recta vertical
//                } else if (b != 0 && a == 0) {
//                    puntos.add(new double[]{0, c / b}); // recta horizontal
//                }
//            }
//        }
//
//        return puntos;
//    }
//
//    // 🔹 Graficar en pnlGrafica
//    private void graficar() {
//        try {
//            double ex = Double.parseDouble(txtEX.getText());
//            double ey = Double.parseDouble(txtEY.getText());
//
//            List<double[]> puntos = obtenerPuntos();
//
//            pnlGrafica.removeAll();
//            pnlGrafica.setLayout(new BorderLayout());
//            pnlGrafica.add(new PanelGrafico(puntos, ex, ey), BorderLayout.CENTER);
//            pnlGrafica.revalidate();
//            pnlGrafica.repaint();
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Error en los datos: " + e.getMessage());
//        }
//    }
//
//    // 🔹 Clase interna para dibujar la gráfica
//    private class PanelGrafico extends JPanel {
//
//        private List<double[]> puntos;
//        private double ex, ey;
//
//        public PanelGrafico(List<double[]> puntos, double ex, double ey) {
//            this.puntos = puntos;
//            this.ex = ex;
//            this.ey = ey;
//        }
//
//        @Override
//        protected void paintComponent(Graphics g) {
//            super.paintComponent(g);
//
//            Graphics2D g2 = (Graphics2D) g;
//            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//
//            int w = getWidth();
//            int h = getHeight();
//
//            // 🔹 Dibujar ejes
//            g2.setColor(Color.LIGHT_GRAY);
//            g2.drawLine(0, h / 2, w, h / 2); // eje X
//            g2.drawLine(w / 2, 0, w / 2, h); // eje Y
//
//            // 🔹 Escala
//            int escala = 40;
//
//            // 🔹 Dibujar puntos de restricciones
//            g2.setColor(Color.BLUE);
//            for (double[] p : puntos) {
//                int x = (int) (w / 2 + p[0] * escala);
//                int y = (int) (h / 2 - p[1] * escala);
//                g2.fillOval(x - 4, y - 4, 8, 8);
//            }
//
//            // 🔹 Dibujar punto EX,EY
//            g2.setColor(Color.RED);
//            int px = (int) (w / 2 + ex * escala);
//            int py = (int) (h / 2 - ey * escala);
//            g2.fillOval(px - 5, py - 5, 10, 10);
//
//            g2.drawString("(" + ex + ", " + ey + ")", px + 5, py - 5);
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEX = new javax.swing.JTextField();
        txtEY = new javax.swing.JTextField();
        txtRX1 = new javax.swing.JTextField();
        txtRX2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        pnlGrafica = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btnMaximizar = new javax.swing.JButton();
        txtTipo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPuntosIn = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRestricciones = new javax.swing.JTable();

        setBackground(new java.awt.Color(230, 230, 230));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 48, 71));
        jLabel1.setText("Ecuación");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 48, 71));
        jLabel2.setText("MÉTODO GRÁFICO ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 25));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(33, 48, 71));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Restricciones");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 270, -1));

        txtEX.setBackground(new java.awt.Color(204, 204, 204));
        txtEX.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtEX.setForeground(new java.awt.Color(33, 48, 71));
        txtEX.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEX.setBorder(null);
        add(txtEX, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 110, 50, 25));

        txtEY.setBackground(new java.awt.Color(204, 204, 204));
        txtEY.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtEY.setForeground(new java.awt.Color(33, 48, 71));
        txtEY.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEY.setBorder(null);
        add(txtEY, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 50, 25));

        txtRX1.setBackground(new java.awt.Color(204, 204, 204));
        txtRX1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtRX1.setForeground(new java.awt.Color(33, 48, 71));
        txtRX1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRX1.setBorder(null);
        add(txtRX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 90, 50, 25));

        txtRX2.setBackground(new java.awt.Color(204, 204, 204));
        txtRX2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtRX2.setForeground(new java.awt.Color(33, 48, 71));
        txtRX2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRX2.setBorder(null);
        add(txtRX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 120, 50, 25));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(33, 48, 71));
        jLabel10.setText("X  +");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 30, -1));

        btnMinimizar.setBackground(new java.awt.Color(204, 204, 204));
        btnMinimizar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(33, 48, 71));
        btnMinimizar.setText("MINIMIZAR");
        btnMinimizar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(33, 48, 71), null));
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 100, 30));

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
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 100, 30));
        add(pnlGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 590, 470));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(33, 48, 71));
        jLabel17.setText("RESPUESTA");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, -1, -1));

        txtRespuesta.setBackground(new java.awt.Color(204, 204, 204));
        txtRespuesta.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtRespuesta.setForeground(new java.awt.Color(33, 48, 71));
        txtRespuesta.setBorder(null);
        add(txtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 190, 25));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(33, 48, 71));
        jLabel18.setText("Puntos de Intersección");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, -1, -1));

        btnMaximizar.setBackground(new java.awt.Color(204, 204, 204));
        btnMaximizar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnMaximizar.setForeground(new java.awt.Color(33, 48, 71));
        btnMaximizar.setText("MAXIMIZAR");
        btnMaximizar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(33, 48, 71), null));
        btnMaximizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMaximizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaximizarActionPerformed(evt);
            }
        });
        add(btnMaximizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 100, 30));

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

        tblPuntosIn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        tblPuntosIn.setForeground(new java.awt.Color(33, 48, 71));
        tblPuntosIn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "X", "Y", "Z"
            }
        ));
        jScrollPane1.setViewportView(tblPuntosIn);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 190, 110));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(33, 48, 71));
        jLabel14.setText("Y");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 110, 20, 25));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(33, 48, 71));
        jLabel19.setText("X  +");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 30, -1));

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(33, 48, 71));
        jLabel23.setText("X   +");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 50, 25));

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

        tblRestricciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "X", "Y", "Signo", "Z"
            }
        ));
        jScrollPane3.setViewportView(tblRestricciones);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 180, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //ECUACION
        txtEX.setText("");
        txtEY.setText("");

        //RESTRICCIONES
        txtRX1.setText("");
        txtRX2.setText("");

        //RESPUESTA
        txtRespuesta.setText("");

        //TABLA
        int filas = tblPuntosIn.getRowCount();
        int columnas = tblPuntosIn.getColumnCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tblPuntosIn.setValueAt("", i, j);
            }
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        txtTipo.setText(" - MINIMIZAR");

        //LEER VALORES
        double ex = Double.parseDouble(txtEX.getText());
        double ey = Double.parseDouble(txtEY.getText());

        //INICIALIZAR VARIABLES
        double minZ = Double.MAX_VALUE;
        Object xMin = null;
        Object yMin = null;

        //RECORRER TABLA
        DecimalFormat df = new DecimalFormat("#.##");

        for (int i = 0; i < tblPuntosIn.getRowCount(); i++) {
            Object xObj = tblPuntosIn.getValueAt(i, 0);
            Object yObj = tblPuntosIn.getValueAt(i, 1);

            if (xObj != null && yObj != null) {
                double x = Double.parseDouble(xObj.toString());
                double y = Double.parseDouble(yObj.toString());
                double z = ex * x + ey * y;

                //z no entero
                String zStr;
                if (z == (long) z) {
                    zStr = String.valueOf((long) z); //entero
                } else {
                    zStr = df.format(z); //decimal
                }

                //GUARDAR VALORES Z
                tblPuntosIn.setValueAt(z, i, 2);

                //VERIFICAR SI ES MINIMO
                if (z < minZ) {
                    minZ = z;
                    xMin = x;
                    yMin = y;
                }
            }
        }

        //RESPUESTA
        String resultado = txtEX.getText() + " (" + xMin + ") + " + txtEY.getText() + " (" + yMin + ")";
        txtRespuesta.setText(resultado);
//
//        try {
//            // 1️⃣ Tomamos el punto ingresado en los JTextField
//            double puntoX = Double.parseDouble(txtEX.getText());
//            double puntoY = Double.parseDouble(txtEY.getText());
//
//            // 2️⃣ Calculamos los puntos de las restricciones
//            List<double[]> puntos = obtenerPuntos();
//
//            // 3️⃣ Creamos el gráfico con esos puntos y el punto (X,Y)
//            PanelGrafico grafico = new PanelGrafico(puntos, puntoX, puntoY);
//
//            // 4️⃣ Limpiamos y mostramos la gráfica en pnlGrafica
//            pnlGrafica.removeAll();
//            pnlGrafica.setLayout(new BorderLayout());
//            pnlGrafica.add(grafico, BorderLayout.CENTER);
//            pnlGrafica.revalidate();
//            pnlGrafica.repaint();
//
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(this,
//                    "Por favor ingresa valores válidos en X y Y",
//                    "Error", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnMaximizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaximizarActionPerformed
        txtTipo.setText(" - MAXIMIZAR");

        //LEER VALORES
        double ex = Double.parseDouble(txtEX.getText());
        double ey = Double.parseDouble(txtEY.getText());

        //INICIALIZAR VARIABLES
        double maxZ = Double.NEGATIVE_INFINITY;
        Object xMax = null;
        Object yMax = null;

        DecimalFormat df = new DecimalFormat("#.##");

        //RECORRER TABLA
        for (int i = 0; i < tblPuntosIn.getRowCount(); i++) {
            Object xObj = tblPuntosIn.getValueAt(i, 0);
            Object yObj = tblPuntosIn.getValueAt(i, 1);

            if (xObj != null && yObj != null) {
                double x = Double.parseDouble(xObj.toString());
                double y = Double.parseDouble(yObj.toString());
                double z = ex * x + ey * y;

                //z no entero
                String zStr;
                if (z == (long) z) {
                    zStr = String.valueOf((long) z); //entero
                } else {
                    zStr = df.format(z); //decimal
                }

                //GUARDAR VALORES Z
                tblPuntosIn.setValueAt(zStr, i, 2);

                //VERIFICAR SI ES MAXIMO
                if (z > maxZ) {
                    maxZ = z;
                    xMax = x;
                    yMax = y;
                }
            }
        }

        //RESPUESTA
        String resultado = ex + " (" + xMax + ") + " + ey + " (" + yMax + ")";
        txtRespuesta.setText(resultado);
    }//GEN-LAST:event_btnMaximizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMaximizar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextPane jTextPane1;
    public javax.swing.JPanel pnlGrafica;
    private javax.swing.JTable tblPuntosIn;
    private transient javax.swing.JTable tblRestricciones;
    private javax.swing.JTextField txtEX;
    private javax.swing.JTextField txtEY;
    private javax.swing.JTextField txtRX1;
    private javax.swing.JTextField txtRX2;
    private javax.swing.JTextField txtRespuesta;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
