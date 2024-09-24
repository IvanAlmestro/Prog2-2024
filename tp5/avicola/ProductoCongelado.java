import java.time.LocalDate;

public class ProductoCongelado extends Producto {
    private int codigoSupervision;
    private String temperatura;

    public ProductoCongelado(LocalDate fechaVencimiento, int lote, LocalDate fechaEnvasado, String granjaOrigen, int codigoSupervision, String temperatura) {
        super(fechaVencimiento, lote, fechaEnvasado, granjaOrigen);

        this.codigoSupervision = codigoSupervision;
        this.temperatura = temperatura;
    }

    public int getCodigoSupervision() {
        return codigoSupervision;
    }

    public void setCodigoSupervision(int codigoSupervision) {
        this.codigoSupervision = codigoSupervision;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
    
}
