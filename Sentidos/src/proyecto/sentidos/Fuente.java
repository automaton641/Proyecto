package proyecto.sentidos;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Fuente {
    Font interna;
    Fuente(String direccion) {
        InputStream flujoDeDatos = getClass().getClassLoader().getResourceAsStream(direccion);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, flujoDeDatos));
        } catch (FontFormatException | IOException exception) {
            exception.printStackTrace();
            System.exit(1);
        }
    }
}
