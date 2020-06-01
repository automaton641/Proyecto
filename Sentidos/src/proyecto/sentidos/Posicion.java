package proyecto.sentidos;

public class Posicion {
    int x;
    int y;

    Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void actualizar(Posicion posicion) {
        x = posicion.x;
        y = posicion.y;
    }

    public void actualizar(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
