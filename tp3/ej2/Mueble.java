package tp3.ej2;

public class Mueble {
    private double peso;
    private double costo;
    private String color;
    private String tipoMadera;
    private double valorVenta;
    private String nombre;
    private double porcentaje;

    public Mueble(double peso, double costo, String color, String tipoMadera, double valorVenta, String nombre, double porcentaje) {
        this.peso = peso;
        this.costo = costo;
        this.color = color;
        this.tipoMadera = tipoMadera;
        this.valorVenta = valorVenta;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }
    
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getCosto() {
        return costo ;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTipoMadera() {
        return tipoMadera;
    }
    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    // aca calculamos el valor de venta segun cuanto sea el porcentaje 
    public double getValorVenta() {
        return valorVenta * porcentaje;
    }
    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    
}
