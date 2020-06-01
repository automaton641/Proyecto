package proyecto.sentidos;

public class Visual {
    Posicion posicion;
    Tamanio tamanio;
    Tema tema;
    double contribucion;
    public Visual(Tema tema) {
        posicion = new Posicion(0,0);
        tamanio = new Tamanio(0,0);
        this.tema = tema;
        contribucion = 1.0;
    }

    public void dibujar(Pintor pintor) {
        pintor.dibujarRectangulo(posicion, tamanio, tema.fondo);
    }
}
