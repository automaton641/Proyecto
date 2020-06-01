package proyecto.sentidos;

public class SColor {
    float rojo;
    float verde;
    float azul;
    public SColor(float rojo, float verde, float azul) {
        this.rojo = rojo;
        this.verde = verde;
        this.azul = azul;
    }
    void actualizar(SColor color) {
        this.rojo = color.rojo;
        this.verde = color.verde;
        this.azul = color.azul;
    }
}
