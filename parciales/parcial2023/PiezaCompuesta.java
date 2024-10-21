package parciales.parcial2023;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PiezaCompuesta extends  Pieza{
    private ArrayList<Pieza> piezas;
    private int gramoAdicional;
    private int segundosExtra;

    public PiezaCompuesta(String descripcion, String nombre, int gramoAdicional, int segundosExtra) {
        super(descripcion, nombre);
        this.gramoAdicional = gramoAdicional;
        this.segundosExtra =segundosExtra;
    }

    public int getSegundosExtra() {
        return segundosExtra;
    }

    public void setSegundosExtra(int segundosExtra) {
        this.segundosExtra = segundosExtra;
    }

    public int getGramoAdicional() {
        return gramoAdicional;
    }

    public void setGramoAdicional(int gramoAdicional) {
        this.gramoAdicional = gramoAdicional;
    }

    public ArrayList<Pieza> getPiezas() {
        return new ArrayList<>(piezas);
    }

    @Override
    public int getTiempoEstimado() {
        int total= 0;
        for (Pieza p : piezas){
            total+=p.getTiempoEstimado();
        }
    return total;
    }

    @Override
    public double getPLAnecesario() {
        double total= 0;
        for (Pieza p: piezas){
            total+=p.getPLAnecesario();
        }
        return total + getCantPiezas()*gramoAdicional;
    }

    @Override
    public ArrayList<String> getColores() {
        ArrayList<String> listaColores = new ArrayList<>();
        for (Pieza p: piezas){
            ArrayList<String> listaHijo = p.getColores();
            for (String color : listaHijo){
                if(!listaColores.contains(color)){
                    listaColores.add(color);
                }

            }

        }
        return listaColores;
    }

    @Override
    public int getCantPiezas() {
        int cant= 0;
        for (Pieza pieza: piezas){
            cant += pieza.getCantPiezas();
        }
        return cant;
    }

    @Override
    public ArrayList<Pieza> buscar(Condicion c1) {
        ArrayList<Pieza> resultado = new ArrayList<>();
        for (Pieza pieza: piezas){
            resultado.addAll(pieza.buscar(c1));

        }
        return resultado;
    }


}
