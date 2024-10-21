package tp11.ej3.Condiciones;

import tp11.ej3.Noticia;


public class CondicionTextoMayor extends Condicion {
    int valor;
    public CondicionTextoMayor(int valor){
        this.valor = valor;
    }
    @Override
    public boolean cumple(Noticia n) {
        return n.getTexto().length() > valor;
    }
    
}
