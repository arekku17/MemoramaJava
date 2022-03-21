/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Image;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author theto
 */
public class Galeria {

    private ArrayList<ImageIcon> fotos = new ArrayList<>();
    int longitud;

    public Galeria(LinkedList<Nivel> lista) {
        //Se cargan las fotos
        longitud = lista.size();
        for (int i = 0; i < longitud; i++) {
            fotos.add(new javax.swing.ImageIcon(getClass().getResource("/img/icon" + lista.get(i).getNivel() + ".png")));
        }
    }
    
    public Icon getFoto(int num, JLabel lbl) {
        int alto = lbl.getHeight();
        Image img = fotos.get(num).getImage();
        ImageIcon aux = new ImageIcon(img);
        int altoOriginal = aux.getIconHeight();
        int anchoOriginal = aux.getIconWidth();
        ImageIcon img2 = new ImageIcon(img.getScaledInstance((anchoOriginal * alto) / altoOriginal, alto, Image.SCALE_SMOOTH));
        return img2;
    }

    public int getLength() {
        return fotos.size();
    }
}
