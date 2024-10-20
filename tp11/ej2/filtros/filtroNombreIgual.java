package tp11.ej2.filtros;

import tp11.ej2.ElementoSA;

public class filtroNombreIgual extends filtro {
    private String nombre;

    public filtroNombreIgual(String nombre){
        this.nombre = nombre;
    }
    @Override
    public boolean cumple(ElementoSA elem) {
        return elem.getNombre().equals(nombre);
    }
    
}
