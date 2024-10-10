package tp8.ej3;

public abstract class Entidad {
    private String nombre;
    private double fuerza;
    protected double peso;
    protected int edad;


    public Entidad(String nombre, double fuerza, double peso, int edad){
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.peso = peso;
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
   

    public Entidad(double peso) {
        this.peso = peso;
    }


    public double getFuerza() {
        return fuerza;
    }


    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }


    public abstract double getPeso();

    public abstract int getEdad();
    public abstract int getCantMiembros();
}
