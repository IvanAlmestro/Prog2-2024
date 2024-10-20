package tp11tipoparcial.ej2.Comparadores;

import tp11tipoparcial.ej2.ElementoSA;
import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<ElementoSA>{
    private Comparator c1;
    private Comparator c2;

    public ComparadorCompuesto(Comparator c1, Comparator c2){
        this.c1=c1;
        this.c2=c2;
    }
    @Override
    public int compare(ElementoSA o1, ElementoSA o2){
        int resultado = c1.compare(o1,o2);
        if(resultado == 0){
            return c2.compare(o1,o2);
        }
        return resultado;
    }
}
