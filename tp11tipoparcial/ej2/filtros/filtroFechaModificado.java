package tp11tipoparcial.ej2.filtros;

import tp11tipoparcial.ej2.ElementoSA;

import java.time.LocalDate;

public class filtroFechaModificado extends filtro {
    private LocalDate fecha;
    @Override
    public boolean cumple(ElementoSA elem) {
        return elem.getFechaModificacion().isAfter(fecha);
    }
    
}
