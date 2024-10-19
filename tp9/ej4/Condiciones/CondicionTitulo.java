package tp9.ej4.Condiciones;

import tp9.ej4.Noticia;

public class CondicionTitulo extends Condicion {
    private String titulo;
    
    public CondicionTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getTitulo().equals(titulo);
    }
    
}
