package tp11.ej2.filtros;

import tp11.ej2.ElementoSA;

import java.time.LocalDate;

public class filtroFechaModificado extends filtro {
    private LocalDate fecha;
    @Override
    public boolean cumple(ElementoSA elem) {
        return elem.getFechaModificacion().isAfter(fecha);
    }
    
}
