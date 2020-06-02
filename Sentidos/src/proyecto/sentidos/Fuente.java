package proyecto.sentidos;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Fuente {
    Font interna;
    Fuente(String direccion) {
        InputStream is = ClassLoader.getSystemResourceAsStream("./proyecto");
        assert is != null;
        InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        br.lines().forEach(System.out::println);
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
