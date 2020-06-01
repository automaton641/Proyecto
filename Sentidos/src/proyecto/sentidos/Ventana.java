package proyecto.sentidos;

public class Ventana {
    Tamanio tamanio;
    Interfaz interfaz;
    Visual raiz;
    Pintor pintor;
    public Ventana(String nombre, int ancho, int alto) {
        tamanio = new Tamanio(ancho, alto);
        pintor = new Pintor(ancho, alto);
        interfaz = new Interfaz(nombre, ancho, alto, pintor);
    }

    public void mostrar() {
        interfaz.mostrar();
    }

    public void dibujar() {
        if (raiz != null) {
            raiz.dibujar(pintor);
        }
        interfaz.dibujar();
    }

    public void establecerRaiz(Visual visual) {
        raiz = visual;
        raiz.posicion.actualizar(0,0);
        raiz.tamanio.actualizar(tamanio);
        dibujar();
    }
}
