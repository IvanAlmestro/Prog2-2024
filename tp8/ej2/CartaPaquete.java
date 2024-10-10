package tp8.ej2;

public class CartaPaquete extends Envio {
    private String direccionDestino;
    private String direccionOrigen;
    private boolean aDomicilio;
    private double peso;

    
    public CartaPaquete(String direccionDestino, String direccionOrigen, boolean aDomicilio, double peso) {
        this.direccionDestino = direccionDestino;
        this.direccionOrigen = direccionOrigen;
        this.aDomicilio = aDomicilio;
        this.peso = peso;
    }


    public String getDireccionDestino() {
        return direccionDestino;
    }


    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }


    public String getDireccionOrigen() {
        return direccionOrigen;
    }


    public void setDireccionOrigen(String direccionOrigen) {
        this.direccionOrigen = direccionOrigen;
    }


    public boolean isaDomicilio() {
        return aDomicilio;
    }


    public void setaDomicilio(boolean aDomicilio) {
        this.aDomicilio = aDomicilio;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    
}
