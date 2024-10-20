package tp11.ej2;
import tp11.ej2.filtros.filtro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoSA {
    
    private String nombre;
    protected LocalDate fechaCreacion;
    protected LocalDate fechaModificacion;
    
    public ElementoSA(String nombre, LocalDate fechaCreacion, LocalDate fechaMo) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }
    
    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract ArrayList<ElementoSA> buscar(filtro f1);
    
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
    
    public abstract ArrayList<ElementoSA> buscarOrdenado(filtro f1, Comparator comp);
    
    public abstract double getTamanio();
       

    public abstract int getCantArchivos();


}
