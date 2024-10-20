package tp11tipoparcial.ej2.filtros;

import tp11tipoparcial.ej2.ElementoSA;

public class filtroNOT extends filtro {
    private filtro filtro1;

    public filtroNOT(filtro filtro1){
        this.filtro1 = filtro1;
    }

    @Override
    public boolean cumple(ElementoSA elem) {
       return !filtro1.cumple(elem);
    }


}
