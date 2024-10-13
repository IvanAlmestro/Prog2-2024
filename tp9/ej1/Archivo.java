package tp9.ej1;
import java.time.LocalDate;
import java.util.ArrayList;

import tp9.ej1.filtros.filtro;
public class Archivo extends ElementoSA{
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private double tamanio;

    
    public Archivo(String nombre, LocalDate fechaCreacion, LocalDate fechaModificacion, double tamanio) {
        super(nombre, fechaCreacion);
        this.fechaModificacion = fechaModificacion;
        this.tamanio = tamanio;
        this.fechaCreacion = LocalDate.now();
    }



    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }
        
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
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



    @Override
    public ArrayList<ElementoSA> buscar(filtro f1) {
        
            ArrayList<ElementoSA> resultado = new ArrayList<>();
            
            if (f1.cumple(this))
                resultado.add(this);
            
            return resultado;
        
    }

    
}
