import java.time.LocalDate;

public class CongeladoNitrogeno extends ProductoCongelado {
    private String metodo;
    private String tiempo;
    
    public CongeladoNitrogeno(LocalDate fechaVencimiento, int lote, LocalDate fechaEnvasado, String granjaOrigen,
            int codigoSupervision, String temperatura, String metodo, String tiempo) {
        super(fechaVencimiento, lote, fechaEnvasado, granjaOrigen, codigoSupervision, temperatura);
        this.metodo = metodo;
        this.tiempo = tiempo;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    
}
