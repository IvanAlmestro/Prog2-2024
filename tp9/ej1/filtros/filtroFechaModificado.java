package tp9.ej1.filtros;

import java.time.LocalDate;

import tp9.ej1.ElementoSA;

public class filtroFechaModificado extends filtro{
    private LocalDate fecha;
    @Override
    public boolean cumple(ElementoSA elem) {
        return elem.getFechaModificacion().isAfter(fecha);
    }
    
}
