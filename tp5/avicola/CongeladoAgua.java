import java.time.LocalDate;

public class CongeladoAgua extends ProductoCongelado {
    private String salinidad;
    private int gramosSal;
    private int litros;
    
    public CongeladoAgua(LocalDate fechaVencimiento, int lote, LocalDate fechaEnvasado, String granjaOrigen,
            int codigoSupervision, String temperatura, String salinidad, int gramosSal, int litros) {
        super(fechaVencimiento, lote, fechaEnvasado, granjaOrigen, codigoSupervision, temperatura);
        this.salinidad = salinidad;
        this.gramosSal = gramosSal;
        this.litros = litros;
    }

    public String getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(String salinidad) {
        this.salinidad = salinidad;
    }

    public int getGramosSal() {
        return gramosSal;
    }

    public void setGramosSal(int gramosSal) {
        this.gramosSal = gramosSal;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    
}
