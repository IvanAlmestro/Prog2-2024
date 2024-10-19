package tp9.ej4.Condiciones;

import tp9.ej4.Noticia;

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
