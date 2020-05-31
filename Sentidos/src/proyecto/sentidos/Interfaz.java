package proyecto.sentidos;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Interfaz {
    static class AdaptadorDeVentana extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent event) {
            super.windowClosing(event);
            event.getWindow().dispose();
        }
    }

    Frame frame;
    AdaptadorDeVentana adaptadorDeVentana;

    Interfaz(String nombre, int ancho, int alto) {
        adaptadorDeVentana = new AdaptadorDeVentana();
        frame = new Frame(nombre);
        frame.setSize(ancho, alto);
        frame.setLocationRelativeTo(null);
        frame.addWindowListener(adaptadorDeVentana);
    }

    void mostrar() {
        frame.setVisible(true);
    }
}
