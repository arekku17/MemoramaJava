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
public class MemoDificil extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     *
     * @param nombre
     * @param lbl
     * @return
     */
    Nivel nvl = null;
    int dificultad = 0;
    int size = 16;
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

    public MemoDificil(Nivel nvl, int dificultad) {
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
        lblCarta9.setIcon(getFoto("carta", lblCarta8));
        lblCarta10.setIcon(getFoto("carta", lblCarta8));
        lblCarta11.setIcon(getFoto("carta", lblCarta8));
        lblCarta12.setIcon(getFoto("carta", lblCarta8));
        lblCarta13.setIcon(getFoto("carta", lblCarta8));
        lblCarta14.setIcon(getFoto("carta", lblCarta8));
        lblCarta15.setIcon(getFoto("carta", lblCarta8));
        lblCarta16.setIcon(getFoto("carta", lblCarta8));
        lblCarta17.setIcon(getFoto("carta", lblCarta8));
        lblCarta18.setIcon(getFoto("carta", lblCarta8));
        lblCarta19.setIcon(getFoto("carta", lblCarta8));
        lblCarta20.setIcon(getFoto("carta", lblCarta8));
        lblCarta21.setIcon(getFoto("carta", lblCarta8));
        lblCarta22.setIcon(getFoto("carta", lblCarta8));
        lblCarta23.setIcon(getFoto("carta", lblCarta8));
        lblCarta24.setIcon(getFoto("carta", lblCarta8));
        lblCarta25.setIcon(getFoto("carta", lblCarta8));
        lblCarta26.setIcon(getFoto("carta", lblCarta8));
        lblCarta27.setIcon(getFoto("carta", lblCarta8));
        lblCarta28.setIcon(getFoto("carta", lblCarta8));
        lblCarta29.setIcon(getFoto("carta", lblCarta8));
        lblCarta30.setIcon(getFoto("carta", lblCarta8));
        lblCarta31.setIcon(getFoto("carta", lblCarta8));
        lblCarta32.setIcon(getFoto("carta", lblCarta8));
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
        lblFind5.setIcon(reescalar(correctas.get(4).getImagen(), lblFind4));
        lblFind6.setIcon(reescalar(correctas.get(5).getImagen(), lblFind4));
        lblFind7.setIcon(reescalar(correctas.get(6).getImagen(), lblFind4));
        lblFind8.setIcon(reescalar(correctas.get(7).getImagen(), lblFind4));
        lblFind9.setIcon(reescalar(correctas.get(8).getImagen(), lblFind1));
        lblFind10.setIcon(reescalar(correctas.get(9).getImagen(), lblFind2));
        lblFind11.setIcon(reescalar(correctas.get(10).getImagen(), lblFind3));
        lblFind12.setIcon(reescalar(correctas.get(11).getImagen(), lblFind4));
        lblFind13.setIcon(reescalar(correctas.get(12).getImagen(), lblFind4));
        lblFind14.setIcon(reescalar(correctas.get(13).getImagen(), lblFind4));
        lblFind15.setIcon(reescalar(correctas.get(14).getImagen(), lblFind4));
        lblFind16.setIcon(reescalar(correctas.get(15).getImagen(), lblFind4));
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
        lblCarta9 = new javax.swing.JLabel();
        lblCarta10 = new javax.swing.JLabel();
        lblCarta11 = new javax.swing.JLabel();
        lblCarta12 = new javax.swing.JLabel();
        lblCarta13 = new javax.swing.JLabel();
        lblCarta14 = new javax.swing.JLabel();
        lblCarta15 = new javax.swing.JLabel();
        lblCarta24 = new javax.swing.JLabel();
        lblCarta23 = new javax.swing.JLabel();
        lblCarta22 = new javax.swing.JLabel();
        lblCarta21 = new javax.swing.JLabel();
        lblCarta20 = new javax.swing.JLabel();
        lblCarta19 = new javax.swing.JLabel();
        lblCarta18 = new javax.swing.JLabel();
        lblCarta17 = new javax.swing.JLabel();
        lblCarta16 = new javax.swing.JLabel();
        lblFind5 = new javax.swing.JLabel();
        lblFind6 = new javax.swing.JLabel();
        lblFind7 = new javax.swing.JLabel();
        lblFind8 = new javax.swing.JLabel();
        lblCarta25 = new javax.swing.JLabel();
        lblCarta26 = new javax.swing.JLabel();
        lblCarta27 = new javax.swing.JLabel();
        lblCarta28 = new javax.swing.JLabel();
        lblCarta29 = new javax.swing.JLabel();
        lblCarta30 = new javax.swing.JLabel();
        lblCarta31 = new javax.swing.JLabel();
        lblCarta32 = new javax.swing.JLabel();
        lblFind9 = new javax.swing.JLabel();
        lblFind10 = new javax.swing.JLabel();
        lblFind11 = new javax.swing.JLabel();
        lblFind12 = new javax.swing.JLabel();
        lblFind13 = new javax.swing.JLabel();
        lblFind14 = new javax.swing.JLabel();
        lblFind15 = new javax.swing.JLabel();
        lblFind16 = new javax.swing.JLabel();
        hours = new javax.swing.JLabel();
        minutes1 = new javax.swing.JLabel();
        seconds = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 29, 59));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(iconNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 100));

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
        jPanel1.add(lblCarta8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 60, 90));

        lblCarta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta1MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 60, 90));

        lblCarta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta2MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 60, 90));

        lblCarta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta3MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 60, 90));

        lblCarta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta4MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 60, 90));

        lblCarta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta5MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 150, 60, 90));

        lblCarta6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta6MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 60, 90));

        lblCarta7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta7MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 60, 90));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(218, 219, 189));
        jLabel3.setText("MEMORAMA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        lblFind.setFont(new java.awt.Font("Roboto Black", 1, 10)); // NOI18N
        lblFind.setForeground(new java.awt.Color(218, 219, 189));
        lblFind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFind.setText("CARTAS ENCONTRADAS:");
        lblFind.setToolTipText("");
        jPanel1.add(lblFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 160, 50));

        lblScore2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblScore2.setForeground(new java.awt.Color(218, 219, 189));
        lblScore2.setText("PUNTAJE:");
        jPanel1.add(lblScore2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, -1, -1));

        lblFind4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 40, 60));

        lblFind1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 40, 60));

        lblFind2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 40, 60));

        lblFind3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 40, 60));

        lblCarta9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta9MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 60, 90));

        lblCarta10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta10MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 60, 90));

        lblCarta11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta11MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 60, 90));

        lblCarta12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta12MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 60, 90));

        lblCarta13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta13MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 60, 90));

        lblCarta14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta14MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 60, 90));

        lblCarta15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta15MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 60, 90));

        lblCarta24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta24MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta24, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 260, 60, 90));

        lblCarta23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta23MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta23, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 260, 60, 90));

        lblCarta22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta22MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta22, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, 60, 90));

        lblCarta21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta21MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta21, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 60, 90));

        lblCarta20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta20MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 60, 90));

        lblCarta19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta19MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 60, 90));

        lblCarta18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta18MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 60, 90));

        lblCarta17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta17MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 60, 90));

        lblCarta16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta16MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 60, 90));

        lblFind5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 40, 60));

        lblFind6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 40, 60));

        lblFind7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 40, 60));

        lblFind8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 40, 60));

        lblCarta25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta25MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta25, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, 60, 90));

        lblCarta26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta26MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta26, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 60, 90));

        lblCarta27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta27MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta27, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 60, 90));

        lblCarta28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta28MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta28, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 60, 90));

        lblCarta29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta29MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta29, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 60, 90));

        lblCarta30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta30MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 60, 90));

        lblCarta31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta31MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta31, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 60, 90));

        lblCarta32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        lblCarta32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCarta32MousePressed(evt);
            }
        });
        jPanel1.add(lblCarta32, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 60, 90));

        lblFind9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 40, 60));

        lblFind10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 40, 60));

        lblFind11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 40, 60));

        lblFind12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 40, 60));

        lblFind13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, 40, 60));

        lblFind14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 480, 40, 60));

        lblFind15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind15, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 480, 40, 60));

        lblFind16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        jPanel1.add(lblFind16, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 480, 40, 60));

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

    private void lblCarta32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta32MousePressed
        int numero = 31;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta32.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta32MousePressed

    private void lblCarta31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta31MousePressed
        int numero = 30;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta31.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta31MousePressed

    private void lblCarta30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta30MousePressed
        int numero = 29;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta30.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta30MousePressed

    private void lblCarta29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta29MousePressed
        int numero = 28;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta29.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta29MousePressed

    private void lblCarta28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta28MousePressed
        int numero = 27;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta28.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta28MousePressed

    private void lblCarta27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta27MousePressed
        int numero = 26;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta27.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta27MousePressed

    private void lblCarta26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta26MousePressed
        int numero = 25;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta26.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta26MousePressed

    private void lblCarta25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta25MousePressed
        int numero = 24;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta25.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta25MousePressed

    private void lblCarta16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta16MousePressed
        int numero = 15;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta16.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta16MousePressed

    private void lblCarta17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta17MousePressed
       int numero = 16;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta17.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta17MousePressed

    private void lblCarta18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta18MousePressed
        int numero = 17;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta18.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta18MousePressed

    private void lblCarta19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta19MousePressed
        int numero = 18;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta19.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta19MousePressed

    private void lblCarta20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta20MousePressed
        int numero = 19;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta20.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta20MousePressed

    private void lblCarta21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta21MousePressed
        int numero = 20;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta21.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta21MousePressed

    private void lblCarta22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta22MousePressed
        int numero = 21;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta22.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta22MousePressed

    private void lblCarta23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta23MousePressed
        int numero = 22;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta23.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta23MousePressed

    private void lblCarta24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta24MousePressed
       int numero = 23;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta24.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta24MousePressed

    private void lblCarta15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta15MousePressed
        int numero = 14;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta15.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta15MousePressed

    private void lblCarta14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta14MousePressed
        int numero = 13;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta14.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta14MousePressed

    private void lblCarta13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta13MousePressed
        int numero = 12;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta13.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta13MousePressed

    private void lblCarta12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta12MousePressed
        int numero = 11;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta12.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta12MousePressed

    private void lblCarta11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta11MousePressed
        int numero = 10;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta11.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta11MousePressed

    private void lblCarta10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta10MousePressed
        int numero = 9;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta10.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta10MousePressed

    private void lblCarta9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarta9MousePressed
        int numero = 8;
        if (listaCartas.get(numero).isFind() == false) {
            lblCarta9.setIcon(reescalar(listaCartas.get(numero).getImagen(), lblCarta8));
            audio.playSound("voltear");
            Timer t = new java.util.Timer();
            t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        validar(numero+1);
                        t.cancel();
                    }
                },
                500
            );
        }
    }//GEN-LAST:event_lblCarta9MousePressed

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

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        Inicio frame2 = new Inicio();
        frame2.setVisible(true);
        this.dispose();
        cronometro.setState(false);
    }//GEN-LAST:event_lblSalirMouseClicked

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
            case 9:
                lblPrimero = lblCarta9;
                break;
            case 10:
                lblPrimero = lblCarta10;
                break;
            case 11:
                lblPrimero = lblCarta11;
                break;
            case 12:
                lblPrimero = lblCarta12;
                break;
            case 13:
                lblPrimero = lblCarta13;
                break;
            case 14:
                lblPrimero = lblCarta14;
                break;
            case 15:
                lblPrimero = lblCarta15;
                break;
            case 16:
                lblPrimero = lblCarta16;
                break;
            case 17:
                lblPrimero = lblCarta17;
                break;
            case 18:
                lblPrimero = lblCarta18;
                break;
            case 19:
                lblPrimero = lblCarta19;
                break;
            case 20:
                lblPrimero = lblCarta20;
                break;
            case 21:
                lblPrimero = lblCarta21;
                break;
            case 22:
                lblPrimero = lblCarta22;
                break;
            case 23:
                lblPrimero = lblCarta23;
                break;
            case 24:
                lblPrimero = lblCarta24;
                break;
            case 25:
                lblPrimero = lblCarta25;
                break;
            case 26:
                lblPrimero = lblCarta26;
                break;
            case 27:
                lblPrimero = lblCarta27;
                break;
            case 28:
                lblPrimero = lblCarta28;
                break;
            case 29:
                lblPrimero = lblCarta29;
                break;
            case 30:
                lblPrimero = lblCarta30;
                break;
            case 31:
                lblPrimero = lblCarta31;
                break;
            case 32:
                lblPrimero = lblCarta32;
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
            case 9:
                lblSegundo = lblCarta9;
                break;
            case 10:
                lblSegundo = lblCarta10;
                break;
            case 11:
                lblSegundo = lblCarta11;
                break;
            case 12:
                lblSegundo = lblCarta12;
                break;
            case 13:
                lblSegundo = lblCarta13;
                break;
            case 14:
                lblSegundo = lblCarta14;
                break;
            case 15:
                lblSegundo = lblCarta15;
                break;
            case 16:
                lblSegundo = lblCarta16;
                break;
            case 17:
                lblSegundo = lblCarta17;
                break;
            case 18:
                lblSegundo = lblCarta18;
                break;
            case 19:
                lblSegundo = lblCarta19;
                break;
            case 20:
                lblSegundo = lblCarta20;
                break;
            case 21:
                lblSegundo = lblCarta21;
                break;
            case 22:
                lblSegundo = lblCarta22;
                break;
            case 23:
                lblSegundo = lblCarta23;
                break;
            case 24:
                lblSegundo = lblCarta24;
                break;
            case 25:
                lblSegundo = lblCarta25;
                break;
            case 26:
                lblSegundo = lblCarta26;
                break;
            case 27:
                lblSegundo = lblCarta27;
                break;
            case 28:
                lblSegundo = lblCarta28;
                break;
            case 29:
                lblSegundo = lblCarta29;
                break;
            case 30:
                lblSegundo = lblCarta30;
                break;
            case 31:
                lblSegundo = lblCarta31;
                break;
            case 32:
                lblSegundo = lblCarta32;
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
            java.util.logging.Logger.getLogger(MemoDificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemoDificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemoDificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemoDificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemoDificil(null, 0).setVisible(true);
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
    private javax.swing.JLabel lblCarta10;
    private javax.swing.JLabel lblCarta11;
    private javax.swing.JLabel lblCarta12;
    private javax.swing.JLabel lblCarta13;
    private javax.swing.JLabel lblCarta14;
    private javax.swing.JLabel lblCarta15;
    private javax.swing.JLabel lblCarta16;
    private javax.swing.JLabel lblCarta17;
    private javax.swing.JLabel lblCarta18;
    private javax.swing.JLabel lblCarta19;
    private javax.swing.JLabel lblCarta2;
    private javax.swing.JLabel lblCarta20;
    private javax.swing.JLabel lblCarta21;
    private javax.swing.JLabel lblCarta22;
    private javax.swing.JLabel lblCarta23;
    private javax.swing.JLabel lblCarta24;
    private javax.swing.JLabel lblCarta25;
    private javax.swing.JLabel lblCarta26;
    private javax.swing.JLabel lblCarta27;
    private javax.swing.JLabel lblCarta28;
    private javax.swing.JLabel lblCarta29;
    private javax.swing.JLabel lblCarta3;
    private javax.swing.JLabel lblCarta30;
    private javax.swing.JLabel lblCarta31;
    private javax.swing.JLabel lblCarta32;
    private javax.swing.JLabel lblCarta4;
    private javax.swing.JLabel lblCarta5;
    private javax.swing.JLabel lblCarta6;
    private javax.swing.JLabel lblCarta7;
    private javax.swing.JLabel lblCarta8;
    private javax.swing.JLabel lblCarta9;
    private javax.swing.JLabel lblFind;
    private javax.swing.JLabel lblFind1;
    private javax.swing.JLabel lblFind10;
    private javax.swing.JLabel lblFind11;
    private javax.swing.JLabel lblFind12;
    private javax.swing.JLabel lblFind13;
    private javax.swing.JLabel lblFind14;
    private javax.swing.JLabel lblFind15;
    private javax.swing.JLabel lblFind16;
    private javax.swing.JLabel lblFind2;
    private javax.swing.JLabel lblFind3;
    private javax.swing.JLabel lblFind4;
    private javax.swing.JLabel lblFind5;
    private javax.swing.JLabel lblFind6;
    private javax.swing.JLabel lblFind7;
    private javax.swing.JLabel lblFind8;
    private javax.swing.JLabel lblFind9;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblScore2;
    private javax.swing.JLabel minutes1;
    private javax.swing.JLabel seconds;
    // End of variables declaration//GEN-END:variables
}
