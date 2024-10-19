package tp9.ej4.Condiciones;

import tp9.ej4.Noticia;

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
