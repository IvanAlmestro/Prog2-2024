package tp11.ej4;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

public class TareaTerminal extends Tarea{
    private LocalDate fechaEstimadaInicio;
    private LocalDate fechaEstimadaFin;
    private ArrayList<Recurso> recursos;
    private String estado;

    @Override
    public ArrayList<Tarea> buscar(Condicion c1) {
        ArrayList<Tarea> resultado = new ArrayList<>();
        if(c1.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    public ArrayList<Recurso> getRecursos() {
        return new ArrayList<>(recursos);
    }

    @Override
    public Duration getTiempoEstimado() {
        return Duration.between(fechaEstimadaInicio, fechaEstimadaFin);
    }

    @Override
    public LocalDate getFechaInicio() {
        return null;
    }

    @Override
    public LocalDate getFechaFin() {
        return null;
    }

    @Override
    public String getEstado() {
        return estado;
    }

    @Override
    public boolean esPosibleAsignar(Recurso re) {

    }
}
