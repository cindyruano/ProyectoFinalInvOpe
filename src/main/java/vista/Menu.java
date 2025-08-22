/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import vista.MetodoGrafico;
import vista.MetodoSimplex;

/**
 *
 * @author cindy
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Colores predeterminados
        Color bgOriginal = new Color(33, 48, 71);   // fondo normal
        Color fgOriginal = new Color(230, 230, 230); // texto normal

        // Colores para hover
        Color bgHover = new Color(50, 65, 95);      // fondo más claro al pasar el mouse
        Color fgHover = new Color(255, 255, 255);   // texto más claro al pasar el mouse

        // Colores para click
        Color bgClick = new Color(20, 30, 50);      // fondo más oscuro al presionar
        Color fgClick = new Color(200, 200, 200);   // texto al presionar

        btnGrafico.setBackground(bgOriginal);
        btnGrafico.setForeground(fgOriginal);
        btnSimplex.setBackground(bgOriginal);
        btnSimplex.setForeground(fgOriginal);

        // ---------------- btnGrafico ----------------
        btnGrafico.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGrafico.setBackground(bgHover);
                btnGrafico.setForeground(fgHover);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGrafico.setBackground(bgOriginal);
                btnGrafico.setForeground(fgOriginal);
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGrafico.setBackground(bgClick);
                btnGrafico.setForeground(fgClick);
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGrafico.setBackground(bgHover);
                btnGrafico.setForeground(fgHover);
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MetodoGrafico grafico = new MetodoGrafico();
                mostrarPanel(fondoDe, grafico);
            }
        });
        // ---------------- btnSimplex ----------------
        btnSimplex.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSimplex.setBackground(bgHover);
                btnSimplex.setForeground(fgHover);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSimplex.setBackground(bgOriginal);
                btnSimplex.setForeground(fgOriginal);
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSimplex.setBackground(bgClick);
                btnSimplex.setForeground(fgClick);
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSimplex.setBackground(bgHover);
                btnSimplex.setForeground(fgHover);
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MetodoSimplex grafico = new MetodoSimplex();
                mostrarPanel(fondoDe, grafico);
            }
        });

        // Eventos de los paneles
        btnGrafico.addMouseListener(
                new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt
            ) {
                MetodoGrafico grafico = new MetodoGrafico();
                mostrarPanel(fondoDe, grafico);
            }
        }
        );

        btnSimplex.addMouseListener(
                new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt
            ) {
                MetodoSimplex simplex = new MetodoSimplex();
                mostrarPanel(fondoDe, simplex);
            }
        }
        );
    }

    //Método para mostrar paneles dentro de un JLabel
    public void mostrarPanel(JLabel contenedor, JPanel panel) {
        contenedor.removeAll();
        panel.setSize(contenedor.getSize());
        panel.setLocation(0, 0);
        contenedor.setLayout(new BorderLayout());
        contenedor.add(panel, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
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
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGrafico = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSimplex = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        fondoIz = new javax.swing.JLabel();
        fondoDe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(33, 48, 71));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MENU");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 310, 40));

        jSeparator2.setBackground(new java.awt.Color(230, 230, 230));
        jSeparator2.setForeground(new java.awt.Color(230, 230, 230));
        jSeparator2.setOpaque(true);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 250, 2));

        jSeparator3.setBackground(new java.awt.Color(230, 230, 230));
        jSeparator3.setForeground(new java.awt.Color(230, 230, 230));
        jSeparator3.setOpaque(true);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 250, 2));

        jLabel6.setBackground(new java.awt.Color(33, 48, 71));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 90, 130));

        jLabel8.setBackground(new java.awt.Color(33, 48, 71));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 40, 120));

        btnGrafico.setBackground(new java.awt.Color(33, 48, 71));
        btnGrafico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGrafico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(33, 48, 71));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(230, 230, 230));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Método Gráfico");
        btnGrafico.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 40));

        jLabel1.setForeground(new java.awt.Color(230, 230, 230));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("➤");
        btnGrafico.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 30, 40));

        jPanel1.add(btnGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 310, 40));

        btnSimplex.setBackground(new java.awt.Color(33, 48, 71));
        btnSimplex.setForeground(new java.awt.Color(33, 48, 71));
        btnSimplex.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(33, 48, 71));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(230, 230, 230));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Método Simplex");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimplex.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 40));

        jLabel2.setForeground(new java.awt.Color(230, 230, 230));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("➤");
        btnSimplex.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 40, 40));

        jPanel1.add(btnSimplex, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 310, 40));

        jLabel10.setBackground(new java.awt.Color(33, 48, 71));
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 170, 20));

        jLabel9.setBackground(new java.awt.Color(33, 48, 71));
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 260, 150));

        jTextPane1.setBackground(new java.awt.Color(33, 48, 71));
        jTextPane1.setBorder(null);
        jTextPane1.setForeground(new java.awt.Color(204, 204, 204));
        jTextPane1.setText("⠀⠀⣀⡀⠀⠀⠀⠀⣀⣀⠀ ⠀⡞⠉⠋⢧⣤⣤⠟⠁⠉⡷ ⠀⠳⠤⣤⣄⣽⠯⢥⣤⠴⠃ ⠀⠀⠀⢀⡏⠀⠀⠀⢣ ⠀⠀⠀⢸⠀⠀⠀⢠⡋ ⠀⠀⡀⠂⠀⠀⠀⠀⠃⢄⠀⠀ ⠀⠁");
        jTextPane1.setCaretColor(new java.awt.Color(33, 48, 71));
        jTextPane1.setDisabledTextColor(new java.awt.Color(33, 48, 71));
        jTextPane1.setSelectedTextColor(new java.awt.Color(33, 48, 71));
        jTextPane1.setSelectionColor(new java.awt.Color(33, 48, 71));
        jScrollPane2.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 170, 160));

        fondoIz.setBackground(new java.awt.Color(33, 48, 71));
        fondoIz.setOpaque(true);
        jPanel1.add(fondoIz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 680));

        fondoDe.setBackground(new java.awt.Color(230, 230, 230));
        fondoDe.setOpaque(true);
        jPanel1.add(fondoDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 960, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnGrafico;
    private javax.swing.JPanel btnSimplex;
    private javax.swing.JLabel fondoDe;
    private javax.swing.JLabel fondoIz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
