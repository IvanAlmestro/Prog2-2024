package tp11tipoparcial.ej2.filtros;

import tp11tipoparcial.ej2.ElementoSA;

public class filtroNombre extends filtro {

    private String nombre;
    
    public filtroNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(ElementoSA elem) {
        return elem.getNombre().contains(nombre);
    }
    
    
}
