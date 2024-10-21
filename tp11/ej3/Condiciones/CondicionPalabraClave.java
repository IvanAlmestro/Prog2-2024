package tp11.ej3.Condiciones;

import tp11.ej3.Noticia;

public class CondicionPalabraClave extends Condicion {
    private String palabra;
    public CondicionPalabraClave(String palabra) {
        this.palabra = palabra;
    }
    @Override
    public boolean cumple(Noticia n) {
        return n.getPalabrasClave().contains(palabra);
    }
    
}
