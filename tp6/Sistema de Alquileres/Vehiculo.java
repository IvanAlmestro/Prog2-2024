public class Vehiculo extends Item{
    private String tipo;
    private String marca;
    private int kilometros;
    private String patente;
    private boolean estaAlquilado;

    public Vehiculo(String tipo, String marca, int kilometros, String patente) {
        this.tipo = tipo;
        this.estaAlquilado = false;
        this.marca = marca;
        this.kilometros = kilometros;
        this.patente = patente;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getKilometros() {
        return kilometros;
    }
    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    @Override
    public boolean puedeAlquilarse() {
       return this.estaAlquilado;
    }
    
    
}
