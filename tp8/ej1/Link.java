package tp8.ej1;
import java.time.LocalDate;
public class Link extends Archivo{

    private double tamanioFijo;
    private ElementoSA destino;


    public Link(String nombre, LocalDate fechaCreacion){
        super(nombre, fechaCreacion, fechaCreacion, 1);
        this.destino = null;
        
    }
    @Override


    public double getTamanio() {
        return tamanioFijo;
    }
    public double getTamanioFijo() {
        return tamanioFijo;
    }

    public ElementoSA getDestino() {
        return destino;
    }
    public void setDestino(ElementoSA destino) {
        this.destino = destino;
    }
    public String toString(){
        return "acceso directo a: " + getDestino();
    }
}
