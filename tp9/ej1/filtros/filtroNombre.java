package tp9.ej1.filtros;

import tp9.ej1.ElementoSA;

public class filtroNombre extends filtro{

    private String nombre;
    
    public filtroNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(ElementoSA elem) {
        return elem.getNombre().contains(nombre);
    }
    
    
}
