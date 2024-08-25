package tp1;
public class Electrodomestico {
    private String nombre;
    private int precio;
    private String color;
    private int consumo;
    private double peso;
    private int consumoMaximo=45;
    private int altaGama = 3;

    public Electrodomestico(String nombre){
        this(nombre, 100, "gris plata", 2, 10.0);
    }
    public Electrodomestico(String nombre, int precio){
        this(nombre, precio, "gris plata", 2, 10.0);
    }
    public Electrodomestico(String nombre, int precio, String color){
        this(nombre, precio, color, 2, 10.0);
    }

    public Electrodomestico(String nombre, int precio, String color, int consumo){
        this(nombre, precio, color, consumo, 10.0);
    }
    public Electrodomestico(String nombre, int precio, String color, int consumo, double peso){
        this.nombre =nombre;
        this.precio = precio;
        this.color = color;
        this.peso = peso;
        this.consumo = consumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public boolean bajoConsumo(){
        return this.consumo < this.consumoMaximo;
    }
    public double getBalance(){
        return this.precio/this.peso;
    }
    public boolean esAltaGama(){
        return this.getBalance() > this.altaGama;
    }
    public static void main(String[] args) {
        Electrodomestico heladera = new Electrodomestico("Heladera", 1200, "gris", 50, 1000.3);

        System.err.println("El producto es una: "+ heladera.getNombre() + heladera.getPrecio());
    }
}
