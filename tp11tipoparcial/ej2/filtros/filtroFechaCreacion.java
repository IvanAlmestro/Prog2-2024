package tp11tipoparcial.ej2.filtros;

import tp11tipoparcial.ej2.ElementoSA;

import java.time.LocalDate;

public class filtroFechaCreacion extends filtro {
    private LocalDate fecha;
    
    public filtroFechaCreacion(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean cumple(ElementoSA elem) {
        return elem.getFechaCreacion().isAfter(fecha);
       
    }
    
}
