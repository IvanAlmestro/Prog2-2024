package tp11.ej2.Comparadores;

import tp11.ej2.ElementoSA;

public class ComparadorTamaño implements Comparator<ElementoSA> {
    public int compare(ElementoSA o1, ElementoSA o2){
        return Double.compare(o1.getTamanio(), o2.getTamanio());

    }
}
