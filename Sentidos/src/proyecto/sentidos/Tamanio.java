package proyecto.sentidos;

public class Tamanio {
    int ancho;
    int alto;

    Tamanio(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    Tamanio(Tamanio tamanio) {
        ancho = tamanio.ancho;
        alto = tamanio.alto;
    }

    void actualizar(Tamanio tamanio) {
        ancho = tamanio.ancho;
        alto = tamanio.alto;
    }
}
