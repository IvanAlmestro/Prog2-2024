package parciales.parcial2023;

import java.util.ArrayList;

public class PiezaSimple extends Pieza {
    private String color;

    public PiezaSimple(int tiempoEstimado, double PLAnecesario, String descripcion, String nombre) {
        super(descripcion, nombre);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getTiempoEstimado() {
        return this.tiempoEstimado;
    }

    @Override
    public double getPLAnecesario() {
       return this.PLAnecesario;
    }

    @Override
    public ArrayList<String> getColores() {
        ArrayList<String> colores =new ArrayList<>();
        colores.add(this.color);
        return colores;
    }

    @Override
    public int getCantPiezas() {
        return 1;
    }

    @Override
    public ArrayList<Pieza> buscar(Condicion c1) {
        ArrayList<Pieza> resultado = new ArrayList<>();
        if(c1.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }

}
