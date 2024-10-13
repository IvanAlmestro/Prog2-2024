package tp9.ej1.filtros;

import tp9.ej1.ElementoSA;

public class filtroNombreIgual extends filtro{
    private String nombre;

    public filtroNombreIgual(String nombre){
        this.nombre = nombre;
    }
    @Override
    public boolean cumple(ElementoSA elem) {
        return elem.getNombre().equals(nombre);
    }
    
}
