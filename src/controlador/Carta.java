package controlador;

import javax.swing.ImageIcon;

public class Carta {
    int valor;
    boolean find;
    ImageIcon imagen = new ImageIcon();

    public Carta(int valor, boolean find, ImageIcon imagen) {
        this.valor = valor;
        this.find = find;
        this.imagen = imagen;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean isFind() {
        return find;
    }

    public void setFind(boolean find) {
        this.find = find;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
    
}
