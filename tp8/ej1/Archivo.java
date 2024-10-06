package tp8.ej1;
import java.time.LocalDate;
public class Archivo extends ElementoSA{

    private LocalDate fechaModificacion;
    private double tamanio;

    
    public Archivo(String nombre, LocalDate fechaCreacion, LocalDate fechaModificacion, double tamanio) {
        super(nombre, fechaCreacion);
        this.fechaModificacion = LocalDate.now();
        this.tamanio = tamanio;
    }



    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }


    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }


    public double getTamanio() {
        return tamanio;
    }


    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }



    @Override
    public int getCantArchivos() {
        return 1;
    }



    @Override
    public String toString() {
        return "Archivo [fechaModificacion=" + fechaModificacion + ", tamanio=" + tamanio + ", getNombre()="
                + getNombre() + "]";
    }

    
}
