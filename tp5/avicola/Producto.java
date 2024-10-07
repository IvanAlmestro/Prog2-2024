
import java.time.LocalDate;

public class Producto{

    private LocalDate fechaVencimiento;
    private int lote;
    private LocalDate fechaEnvasado;
    private String granjaOrigen;

    public Producto(LocalDate fechaVencimiento, int lote, LocalDate fechaEnvasado, String granjaOrigen) {
        this.fechaVencimiento = fechaVencimiento;
        this.lote = lote;
        this.fechaEnvasado = fechaEnvasado;
        this.granjaOrigen = granjaOrigen;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }
    
    public String toString(){
        return (
        "fecha vencimiento "+ this.getFechaVencimiento() + 
        " fecha envasado: "+ this.getFechaEnvasado() + 
        " lote: " + this.getLote() + 
        " granja origen: " + this.getGranjaOrigen());
        
    }
}
