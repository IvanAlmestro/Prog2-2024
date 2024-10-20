package tp11tipoparcial.ej2.filtros;

import tp11tipoparcial.ej2.ElementoSA;

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
