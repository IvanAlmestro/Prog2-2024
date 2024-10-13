package tp9.ej1;
import java.time.LocalDate;
import java.util.ArrayList;

import tp9.ej1.filtros.filtro;

public abstract class ElementoSA {
    
    private String nombre;
    private LocalDate fechaCreacion;

    
    public ElementoSA(String nombre, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract ArrayList<ElementoSA> buscar(filtro f1);
    
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    
    public abstract double getTamanio();
       

    public abstract int getCantArchivos();


}
