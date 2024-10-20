package tp11.ej2.filtros;

import tp11.ej2.ElementoSA;

public class filtroOR extends filtro {
    private filtro filtro1;
    private filtro filtro2;
    
    @Override
    public boolean cumple(ElementoSA elem) {
        return filtro1.cumple(elem) || filtro2.cumple(elem);
    }

}