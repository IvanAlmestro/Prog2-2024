package tp8.ej1;
import java.time.LocalDate;

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


    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public abstract double getTamanio();
       

    public abstract int getCantArchivos();
}
