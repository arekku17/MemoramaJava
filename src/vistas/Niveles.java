/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.Galeria;
import controlador.ListaEnlazada;
import controlador.Nivel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.LinkedList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author jose_
 */
public class Niveles extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     * @param nombre
     * @param lbl
     * @return 
     */
    
    ListaEnlazada lista = new ListaEnlazada();
    LinkedList<Nivel> listAux = new LinkedList<>();
    
    Galeria carro = null;
    
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
    
    public Niveles() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        lista.addFirst(new Nivel(2,"Animales"));
        lista.addFirst(new Nivel(1,"Frutas"));
        lista.addFirst(new Nivel(0,"Paisajes"));
        listAux = lista.obtenerLista();
        carro = new Galeria(listAux);
        
        lblVolver.setIcon(getFoto("arrowLeft", lblVolver));
        lblAtras.setIcon(getFoto("arrowLeft", lblAtras));
        lblDelante.setIcon(getFoto("arrowRight", lblDelante));
       
        pintar();
    }
    
    public void pintar(){
        lblNivel.setIcon(carro.getFoto(listAux.get(0).getNum(), lblNivel));
        txtNivel.setText(listAux.get(0).getNivel().toUpperCase());
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
        txtNivel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblVolver = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        lblDelante = new javax.swing.JLabel();
        lblAtras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 29, 59));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(216, 33, 72));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 950, 10));

        txtNivel.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        txtNivel.setForeground(new java.awt.Color(218, 219, 189));
        txtNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNivel.setText("ANIMALES");
        jPanel1.add(txtNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 370, 60));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(218, 219, 189));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NIVELES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        jPanel1.add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        lblNivel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNivelMousePressed(evt);
            }
        });
        jPanel1.add(lblNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 280, 270));

        lblDelante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblDelanteMousePressed(evt);
            }
        });
        jPanel1.add(lblDelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 150, 150));

        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAtrasMousePressed(evt);
            }
        });
        jPanel1.add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 150, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        Inicio frame2 = new Inicio();
        frame2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVolverMouseClicked

    private void lblAtrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMousePressed
        lista.shift(1);
        listAux = lista.obtenerLista();
        pintar();
    }//GEN-LAST:event_lblAtrasMousePressed

    private void lblDelanteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDelanteMousePressed
         lista.shift(-1);
         listAux = lista.obtenerLista();
         pintar();
    }//GEN-LAST:event_lblDelanteMousePressed

    private void lblNivelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNivelMousePressed
        Dificultad frame2 = new Dificultad(listAux.get(0));
        frame2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblNivelMousePressed

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
            java.util.logging.Logger.getLogger(Niveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Niveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Niveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Niveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Niveles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblDelante;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JLabel txtNivel;
    // End of variables declaration//GEN-END:variables
}
