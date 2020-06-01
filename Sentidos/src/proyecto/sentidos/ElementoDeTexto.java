package proyecto.sentidos;

public class ElementoDeTexto extends Visual {
    String texto;

    public ElementoDeTexto(String texto, Tema tema) {
        super(tema);
        this.texto = texto;
    }

    public void dibujar(Pintor pintor) {
        super.dibujar(pintor);
        Consola.Linea("dibujando");
    }
}
