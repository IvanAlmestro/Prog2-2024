package tp11.ej2.filtros;

import tp11.ej2.ElementoSA;

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
