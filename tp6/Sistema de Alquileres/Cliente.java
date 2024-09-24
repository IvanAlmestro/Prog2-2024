import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente{
    private ArrayList<Item> items;
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaVencimiento;
    
    public Cliente(String nombre, LocalDate fechaInicio, LocalDate fechaVencimiento) {
        this.items = new ArrayList<>(items);
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
    }

    public ArrayList<Item> getItems() {
        return new ArrayList<>(items);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaVencimiento = fechaFin;
    }

    
}