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
        Module module = Fuente.class.getModule();
        final InputStream is;
        try {
            is = module.getResourceAsStream("proyecto");
            assert is != null;
            final InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
            final BufferedReader br = new BufferedReader(isr);
            br.lines().forEach(System.out::println);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
            /*
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            InputStream flujoDeDatos = getClass().getResourceAsStream(direccion);
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, flujoDeDatos));
        } catch (FontFormatException | IOException exception) {
            exception.printStackTrace();
            System.exit(1);
        }
        */
    }
}
