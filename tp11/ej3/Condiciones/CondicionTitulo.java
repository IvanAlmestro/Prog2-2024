package tp11.ej3.Condiciones;

import tp11.ej3.Noticia;


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
