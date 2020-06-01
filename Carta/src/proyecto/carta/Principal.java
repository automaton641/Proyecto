package proyecto.carta;

import proyecto.sentidos.Boton;
import proyecto.sentidos.Tema;
import proyecto.sentidos.Ventana;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Ventana ventana = new Ventana("Carta", 1280, 720);
        Tema tema = new Tema();
        Boton boton = new Boton("Hola Carta", tema);
        ventana.establecerRaiz(boton);
        ventana.mostrar();
    }
}
