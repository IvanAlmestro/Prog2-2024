package tp11tipoparcial.ej2.filtros;

import tp11tipoparcial.ej2.ElementoSA;

public class filtroAND extends filtro {
    private filtro filtro1;
    private filtro filtro2;
    @Override
    public boolean cumple(ElementoSA elem) {
        return filtro1.cumple(elem) && filtro2.cumple(elem);
    }

}
