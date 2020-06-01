package proyecto.sentidos;

public class Pintor {
    Tamanio tamanio;
    SColor[][] pixeles;
    public Pintor(int ancho, int alto) {
        tamanio = new Tamanio(ancho, alto);
        pixeles = new SColor[ancho][alto];
        for (int x = 0; x < ancho; x++) {
            for (int y = 0; y < alto; y++) {
                pixeles[x][y] = new SColor(0f,0f,0f);
            }
        }
    }
    void dibujarRectangulo(Posicion posicion, Tamanio tamanio, SColor color) {
        int xi = posicion.x;
        int xf = xi + tamanio.ancho;
        int yi = posicion.y;
        int yf = yi + tamanio.alto;
        for (int x = xi; x < xf; x++) {
            if (x < this.tamanio.ancho) {
                for (int y = yi; y < yf; y++) {
                    if (y < this.tamanio.alto) {
                        pixeles[x][y].actualizar(color);
                    }
                }
            }
        }
    }
}
