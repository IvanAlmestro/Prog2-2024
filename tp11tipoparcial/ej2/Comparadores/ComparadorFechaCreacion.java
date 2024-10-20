package tp11tipoparcial.ej2.Comparadores;

import tp11tipoparcial.ej2.ElementoSA;

import java.util.Comparator;

public class ComparadorFechaCreacion implements Comparator<ElementoSA> {


    @Override
    public int compare(ElementoSA o1, ElementoSA o2) {
        if(o1.getFechaCreacion().isBefore(o2.getFechaCreacion())){
            return 1;
        } else if (o1.getFechaCreacion().isAfter(o2.getFechaCreacion())) {
            return -1;
        }else{
            return 0;
        }
    }
}

