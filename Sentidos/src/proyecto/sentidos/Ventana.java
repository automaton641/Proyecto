package proyecto.sentidos;

public class Ventana {
    Interfaz interfaz;
    public Ventana(String nombre, int ancho, int alto) {
        interfaz = new Interfaz(nombre, ancho, alto);
    }

    public void mostrar() {
        interfaz.mostrar();
    }
}
