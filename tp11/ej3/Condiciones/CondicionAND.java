package tp11.ej3.Condiciones;

import tp11.ej3.Noticia;


public class CondicionAND extends Condicion {
    private Condicion c1;
    private Condicion c2;
    public CondicionAND(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    @Override
    public boolean cumple(Noticia n) {
        return c1.cumple(n) && c2.cumple(n);
    }
    
    
}
