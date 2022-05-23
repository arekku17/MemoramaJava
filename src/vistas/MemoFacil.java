/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.Carta;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import controlador.Nivel;
import controlador.ControlAudio;
import controlador.CronometroJuego;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Timer;

/**
 *
 * @author jose_
 */
public class MemoFacil extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     *
     * @param nombre
     * @param lbl
     * @return
     */
    Nivel nvl = null;
    int dificultad = 0;
    int size = 4;
    LinkedList<Carta> listAux = new LinkedList<>();
    LinkedList<Carta> listaCartas = new LinkedList<>();
    LinkedList<Carta> correctas = new LinkedList<>();
    ControlAudio audio = new ControlAudio();
    Carta primera = null;
    Carta segunda = null;
    int posPrimera = 0;
    int posSegunda = 0;
    int score = 0;
    int numCartasFind = 0;
    CronometroJuego cronometro = new CronometroJuego();

    public void cargarCartas() {
        for (int i = 0; i < 16; i++) {
            ImageIcon img = new javax.swing.ImageIcon(getClass().getResource("/img/" + nvl.getNivel() + "/" + (i + 1) + ".png"));
            listAux.add(new Carta(i, false, img));
        }
        Collections.shuffle(listAux);
    }

    public void listarCartas() {
        ImageIcon img = new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"));
        for (int i = 0; i < size; i++) {
            correctas.add(new Carta(0, false, img));
            listaCartas.add(listAux.get(i));
            listaCartas.add(listAux.get(i));
        }
        Collections.shuffle(listaCartas);
    }

    public final Icon reescalar(ImageIcon imgCarta, JLabel lbl) {
        int alto = lbl.getHeight();
        Image img = imgCarta.getImage();
        int altoOriginal = imgCarta.getIconHeight();
        int anchoOriginal = imgCarta.getIconWidth();
        ImageIcon img2 = new ImageIcon(img.getScaledInstance((anchoOriginal * alto) / altoOriginal, alto, Image.SCALE_SMOOTH));
        return img2;
    }

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

    public MemoFacil(Nivel nvl, int dificultad) {
        this.nvl = nvl;
        this.dificultad = dificultad;
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        

        //Se cargan y barajan las cartas
        cargarCartas();
        listarCartas();

        //Se pinta todo lo necesario
        iconNivel.setIcon(getFoto("icon" + nvl.getNivel(), iconNivel));
        lblCarta8.setIcon(getFoto("carta", lblCarta8));
        lblCarta1.setIcon(getFoto("carta", lblCarta8));
        lblCarta2.setIcon(getFoto("carta", lblCarta8));
        lblCarta3.setIcon(getFoto("carta", lblCarta8));
        lblCarta4.setIcon(getFoto("carta", lblCarta8));
        lblCarta5.setIcon(getFoto("carta", lblCarta8));
        lblCarta6.setIcon(getFoto("carta", lblCarta8));
        lblCarta7.setIcon(getFoto("carta", lblCarta8));
        pintarFind();
        lblScore2.setText("PUNTAJE: " + score);
        
        //Cronometro del juego
        cronometro.setLblHours(hours);
        cronometro.setLblMinutes(minutes1);
        cronometro.setLblSeconds(seconds);
        cronometro.start();

    }

    public void pintarFind() {
        lblFind1.setIcon(reescalar(correctas.get(0).getImagen(), lblFind1));
        lblFind2.setIcon(reescalar(correctas.get(1).getImagen(), lblFind2));
        lblFind3.setIcon(reescalar(correctas.get(2).getImagen(), lblFind3));
        lblFind4.setIcon(reescalar(correctas.get(3).getImagen(), lblFind4));
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
        iconNivel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        lblCarta8 = new javax.swing.JLabel();
        lblCarta1 = new javax.swing.JLabel();
        lblCarta2 = new javax.swing.JLabel();
        lblCarta3 = new javax.swing.JLabel();
        lblCarta4 = new javax.swing.JLabel();
        lblCarta5 = new javax.swing.JLabel();
        lblCarta6 = new javax.swing.JLabel();
        lblCarta7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFind = new javax.swing.JLabel();
        lblScore2 = new javax.swing.JLabel();
        lblFind4 = new javax.swing.JLabel();
        lblFind1 = new javax.swing.JLabel();
        lblFind2 = new javax.swing.JLabel();
        lblFind3 = new javax.swing.JLabel();
        hours = new javax.swing.JLabel();
        minutes1 = new javax.swing.JLabel();
        seconds = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 29, 59));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(iconNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 120));

        jPanel2.setBackground(new java.awt.Color(216, 33, 72));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 950, 10));

        lblSalir.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(218, 219, 189));
        lblSalir.setText("SALIR");
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });
        jPanel1.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        lblCarta8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta8MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 90, 130));

        lblCarta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta1MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 90, 130));

        lblCarta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta2MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 90, 130));

        lblCarta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta3MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 90, 130));

        lblCarta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta4MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 90, 130));

        lblCarta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta5MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 90, 130));

        lblCarta6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta6MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 90, 130));

        lblCarta7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta7MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 90, 130));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(218, 219, 189));
        jLabel3.setText("MEMORAMA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        lblFind.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblFind.setForeground(new java.awt.Color(218, 219, 189));
        lblFind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFind.setText("CARTAS ENCONTRADAS:");
        lblFind.setToolTipText("");
        jPanel1.add(lblFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 240, -1));

        lblScore2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblScore2.setForeground(new java.awt.Color(218, 219, 189));
        lblScore2.setText("PUNTAJE:");
        jPanel1.add(lblScore2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, -1, -1));

        lblFind4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 60, 80));

        lblFind1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 60, 80));

        lblFind2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 60, 80));

        lblFind3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 60, 80));

        hours.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        hours.setForeground(new java.awt.Color(218, 219, 189));
        hours.setText("00");
        jPanel1.add(hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, -1));

        minutes1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        minutes1.setForeground(new java.awt.Color(218, 219, 189));
        minutes1.setText(":00");
        jPanel1.add(minutes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, -1));

        seconds.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        seconds.setForeground(new java.awt.Color(218, 219, 189));
        seconds.setText(":00");
        jPanel1.add(seconds, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void resetCartas(int pos1, int pos2) {
        JLabel lblPrimero = null;
        JLabel lblSegundo = null;

        switch (pos1) {
            case 1:
                lblPrimero = lblCarta1;
                break;
            case 2:
                lblPrimero = lblCarta2;
                break;
            case 3:
                lblPrimero = lblCarta3;
                break;
            case 4:
                lblPrimero = lblCarta4;
                break;
            case 5:
                lblPrimero = lblCarta5;
                break;
            case 6:
                lblPrimero = lblCarta6;
                break;
            case 7:
                lblPrimero = lblCarta7;
                break;
            case 8:
                lblPrimero = lblCarta8;
                break;
        }

        switch (pos2) {
            case 1:
                lblSegundo = lblCarta1;
                break;
            case 2:
                lblSegundo = lblCarta2;
                break;
            case 3:
                lblSegundo = lblCarta3;
                break;
            case 4:
                lblSegundo = lblCarta4;
                break;
            case 5:
                lblSegundo = lblCarta5;
                break;
            case 6:
                lblSegundo = lblCarta6;
                break;
            case 7:
                lblSegundo = lblCarta7;
                break;
            case 8:
                lblSegundo = lblCarta8;
                break;

        }

        lblPrimero.setIcon(getFoto("carta", lblCarta8));
        lblSegundo.setIcon(getFoto("carta", lblCarta8));

    }

    public void validar(int num) {
        if (primera == null) {
            primera = listaCartas.get(num - 1);
            posPrimera = num;
        } else {
            posSegunda = num;
            if (posPrimera != posSegunda) {
                segunda = listaCartas.get(num - 1);
                if (primera.getValor() == segunda.getValor()) {
                    //Se coloca true el estado de encontradas a las cartas
                    listaCartas.get(posPrimera - 1).setFind(true);
                    listaCartas.get(posSegunda - 1).setFind(true);
                    //Se agrega una carta agregada a la parte de abajo
                    correctas.get(numCartasFind).setImagen(primera.getImagen());
                    pintarFind();
                    numCartasFind++;
                    //Se aumenta el score
                    score += 10;
                    audio.playSound("correcto");
                } else {
                    //Se voltean las cartas porque estaba mal
                    resetCartas(posPrimera, posSegunda);
                    audio.playSound("incorrecto");
                    if (score > 0) {
                        //Se resta score
                        score -= 10;
                        
                    }
                }
            }
            //Un reset de todo para volver a validar
            posPrimera = 0;
            posSegunda = 0;
            primera = null;
            segunda = null;
            lblScore2.setText("PUNTAJE: " + score);
        }

        if (numCartasFind == size) {
            Ganaste frame2 = new Ganaste(score, size*10);
            frame2.setVisible(true);
            this.setVisible(false);
            cronometro.setState(false);
        }
    }

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        Inicio frame2 = new Inicio();
        frame2.setVisible(true);
        this.dispose();
        cronometro.setState(false);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblCarta1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta1MousePressed
        if (listaCartas.get(0).isFind() == false) {
            lblCarta1.setIcon(reescalar(listaCartas.get(0).getImagen(), lblCarta1));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                    new java.util.TimerTask() {
                @Override
                public void run() {
                    validar(1);
                    t.cancel();
                }
            },
                    500
            );

        }

    }//GEN-LAST:event_lblCarta1MousePressed

    private void lblCarta2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta2MousePressed
        if (listaCartas.get(1).isFind() == false) {
            lblCarta2.setIcon(reescalar(listaCartas.get(1).getImagen(), lblCarta2));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                    new java.util.TimerTask() {
                @Override
                public void run() {
                    validar(2);
                    t.cancel();
                }
            },
                    500
            );
        }
    }//GEN-LAST:event_lblCarta2MousePressed

    private void lblCarta3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta3MousePressed
        if (listaCartas.get(2).isFind() == false) {
            lblCarta3.setIcon(reescalar(listaCartas.get(2).getImagen(), lblCarta3));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                    new java.util.TimerTask() {
                @Override
                public void run() {
                    validar(3);
                    t.cancel();
                }
            },
                    500
            );
        }
    }//GEN-LAST:event_lblCarta3MousePressed

    private void lblCarta4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta4MousePressed
        if (listaCartas.get(3).isFind() == false) {
            lblCarta4.setIcon(reescalar(listaCartas.get(3).getImagen(), lblCarta4));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                    new java.util.TimerTask() {
                @Override
                public void run() {
                    validar(4);
                    t.cancel();
                }
            },
                    500
            );
        }
    }//GEN-LAST:event_lblCarta4MousePressed

    private void lblCarta5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta5MousePressed
        if (listaCartas.get(4).isFind() == false) {
            lblCarta5.setIcon(reescalar(listaCartas.get(4).getImagen(), lblCarta5));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                    new java.util.TimerTask() {
                @Override
                public void run() {
                    validar(5);
                    t.cancel();
                }
            },
                    500
            );
        }
    }//GEN-LAST:event_lblCarta5MousePressed

    private void lblCarta6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta6MousePressed
        if (listaCartas.get(5).isFind() == false) {
            lblCarta6.setIcon(reescalar(listaCartas.get(5).getImagen(), lblCarta6));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                    new java.util.TimerTask() {
                @Override
                public void run() {
                    validar(6);
                    t.cancel();
                }
            },
                    500
            );
        }
    }//GEN-LAST:event_lblCarta6MousePressed

    private void lblCarta7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta7MousePressed
        if (listaCartas.get(6).isFind() == false) {
            lblCarta7.setIcon(reescalar(listaCartas.get(6).getImagen(), lblCarta7));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                    new java.util.TimerTask() {
                @Override
                public void run() {
                    validar(7);
                    t.cancel();
                }
            },
                    500
            );
        }
    }//GEN-LAST:event_lblCarta7MousePressed

    private void lblCarta8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta8MousePressed
        if (listaCartas.get(7).isFind() == false) {
            lblCarta8.setIcon(reescalar(listaCartas.get(7).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                    new java.util.TimerTask() {
                @Override
                public void run() {
                    validar(8);
                    t.cancel();
                }
            },
                    500
            );
        }
    }//GEN-LAST:event_lblCarta8MousePressed

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
            java.util.logging.Logger.getLogger(MemoFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemoFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemoFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemoFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemoFacil(null, 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hours;
    private javax.swing.JLabel iconNivel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCarta1;
    private javax.swing.JLabel lblCarta2;
    private javax.swing.JLabel lblCarta3;
    private javax.swing.JLabel lblCarta4;
    private javax.swing.JLabel lblCarta5;
    private javax.swing.JLabel lblCarta6;
    private javax.swing.JLabel lblCarta7;
    private javax.swing.JLabel lblCarta8;
    private javax.swing.JLabel lblFind;
    private javax.swing.JLabel lblFind1;
    private javax.swing.JLabel lblFind2;
    private javax.swing.JLabel lblFind3;
    private javax.swing.JLabel lblFind4;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblScore2;
    private javax.swing.JLabel minutes1;
    private javax.swing.JLabel seconds;
    // End of variables declaration//GEN-END:variables
}
