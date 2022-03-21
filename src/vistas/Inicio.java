/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author jose_
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     * @param nombre
     * @param lbl
     * @return 
     */
    
    public final Icon getFoto(String nombre, JLabel lbl) {
        int ancho = lbl.getWidth();
        int alto = lbl.getHeight();
        Image img = new ImageIcon(getClass().getResource("/img/" + nombre + ".png")).getImage();
        ImageIcon aux = new ImageIcon(img);
        int altoOriginal = aux.getIconHeight();
        int anchoOriginal = aux.getIconWidth();
        ImageIcon img2 = new ImageIcon(img.getScaledInstance((anchoOriginal * alto) / altoOriginal, alto, Image.SCALE_SMOOTH));
        return img2;
    }
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblLogo.setIcon(getFoto("logo", lblLogo));
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnInfo = new javax.swing.JLabel();
        btnJugar = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 29, 59));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(216, 33, 72));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 950, 10));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(218, 219, 189));
        jLabel3.setText("Desarrollado por: José Alejandro Pérez Arenas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 940, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(218, 219, 189));
        jLabel2.setText("MEMORAMA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        btnSalir.setFont(new java.awt.Font("Roboto Light", 0, 60)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(218, 219, 189));
        btnSalir.setText("SALIR");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));

        btnInfo.setFont(new java.awt.Font("Roboto Light", 0, 60)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(218, 219, 189));
        btnInfo.setText("INFO");
        btnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInfoMouseExited(evt);
            }
        });
        jPanel1.add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        btnJugar.setFont(new java.awt.Font("Roboto Light", 0, 60)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(218, 219, 189));
        btnJugar.setText("JUGAR");
        btnJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJugarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnJugarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnJugarMouseExited(evt);
            }
        });
        jPanel1.add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 470, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJugarMouseEntered
        btnJugar.setFont(new Font("Roboto Bold", Font.BOLD, 60));
                
    }//GEN-LAST:event_btnJugarMouseEntered

    private void btnJugarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJugarMouseExited
        btnJugar.setFont(new Font("Roboto Light", Font.PLAIN, 60));
    }//GEN-LAST:event_btnJugarMouseExited

    private void btnInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseEntered
        btnInfo.setFont(new Font("Roboto Bold", Font.BOLD, 60));
    }//GEN-LAST:event_btnInfoMouseEntered

    private void btnInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseExited
         btnInfo.setFont(new Font("Roboto Light", Font.PLAIN, 60));
    }//GEN-LAST:event_btnInfoMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setFont(new Font("Roboto Bold", Font.BOLD, 60));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setFont(new Font("Roboto Light", Font.PLAIN, 60));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJugarMouseClicked
        Niveles frame2 = new Niveles();
        frame2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnJugarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnInfo;
    private javax.swing.JLabel btnJugar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
