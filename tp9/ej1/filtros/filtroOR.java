package tp9.ej1.filtros;

import tp9.ej1.ElementoSA;

public class filtroOR extends filtro {
    private filtro filtro1;
    private filtro filtro2;
    
    @Override
    public boolean cumple(ElementoSA elem) {
        return filtro1.cumple(elem) || filtro2.cumple(elem);
    }

}