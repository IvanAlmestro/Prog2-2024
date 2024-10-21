package parciales.parcial2023;

import java.util.ArrayList;

public abstract class Pieza {
    protected String nombre;
    protected String descripcion;
    protected double PLAnecesario;
    protected int tiempoEstimado;
    private static double costoPorGramoPLA = 0.5; // precio por gramo de PLA
    private static double costoPorSegundo = 0.01;

    public Pieza( String descripcion, String nombre) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public void setPLAnecesario(double PLAnecesario) {
        this.PLAnecesario = PLAnecesario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getTiempoEstimado();
    public abstract double getPLAnecesario();
    public abstract ArrayList<String> getColores();
    public abstract int getCantPiezas();
    public abstract ArrayList<Pieza> buscar(Condicion c);
    public  double getCosto() {
        return (getPLAnecesario() * costoPorGramoPLA) + (getTiempoEstimado() * costoPorSegundo);
    }

}
