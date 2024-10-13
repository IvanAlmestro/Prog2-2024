package tp9.ej1.filtros;

import java.time.LocalDate;

import tp9.ej1.ElementoSA;

public class filtroFechaCreacion extends filtro{
    private LocalDate fecha;
    
    public filtroFechaCreacion(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean cumple(ElementoSA elem) {
        return elem.getFechaCreacion().isAfter(fecha);
       
    }
    
}
