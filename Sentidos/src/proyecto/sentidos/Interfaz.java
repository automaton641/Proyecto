package proyecto.sentidos;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

public class Interfaz {
    static class AdaptadorDeVentana extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent event) {
            super.windowClosing(event);
            event.getWindow().dispose();
        }
    }

    static class Lienzo extends Component {
        BufferedImage imagen;
        Pintor pintor;

        Lienzo(int ancho, int alto, Pintor pintor) {
            this.pintor = pintor;
            imagen = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
        }

        @Override
        public void paint(Graphics graphics) {
            super.paint(graphics);
            for (int x = 0; x < pintor.tamanio.ancho; x++) {
                for (int y = 0; y < pintor.tamanio.alto; y++) {
                    SColor sColor = pintor.pixeles[x][y];
                    Color color = new Color(sColor.rojo, sColor.verde, sColor.azul);
                    imagen.setRGB(x, y, color.getRGB());
                }
            }
            graphics.drawImage(imagen, 0, 0, this);
        }
    }

    Frame frame;
    AdaptadorDeVentana adaptadorDeVentana;
    Lienzo lienzo;

    Interfaz(String nombre, int ancho, int alto, Pintor pintor) {
        lienzo = new Lienzo(ancho, alto, pintor);
        adaptadorDeVentana = new AdaptadorDeVentana();
        frame = new Frame(nombre);
        frame.setSize(ancho, alto);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.addWindowListener(adaptadorDeVentana);
        frame.add(lienzo);
    }

    void mostrar() {
        frame.setVisible(true);
    }

    public void dibujar() {
        frame.repaint();
    }

}
