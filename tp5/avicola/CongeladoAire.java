import java.time.LocalDate;

public class CongeladoAire extends ProductoCongelado{
    private String composicionAire;

    public CongeladoAire(LocalDate fechaVencimiento, int lote, LocalDate fechaEnvasado, String granjaOrigen,
            int codigoSupervision, String temperatura, String composicionAire) {
        super(fechaVencimiento, lote, fechaEnvasado, granjaOrigen, codigoSupervision, temperatura);
        this.composicionAire = composicionAire;
    }

    public String getComposicionAire() {
        return composicionAire;
    }

    public void setComposicionAire(String composicionAire) {
        this.composicionAire = composicionAire;
    }

    
}
