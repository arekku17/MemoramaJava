package vistas;

import controlador.Cronometro;

public class Main {

    public static void main(String[] args) {
        Cronometro cronometro = Cronometro.getInstance();
        cronometro.start();
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }
    
}
