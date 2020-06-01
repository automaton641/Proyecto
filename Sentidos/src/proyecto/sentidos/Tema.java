package proyecto.sentidos;

public class Tema {
    SColor fondo;
    SColor frente;
    Fuente fuente;
    public Tema() {
        fondo = new SColor(0f, 0f, 0f);
        frente = new SColor(1f, 1f, 1f);
        fuente = new Fuente("JetBrainsMono-1.03/ttf/JetBrainsMono-ExtraBold.ttf");
    }
}
