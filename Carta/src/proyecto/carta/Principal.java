package proyecto.carta;

import proyecto.sentidos.Ventana;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Ventana ventana = new Ventana("Carta", 1280, 720);
        ventana.mostrar();
    }
}
