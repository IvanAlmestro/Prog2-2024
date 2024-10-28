package tp11.ej4;

import java.lang.reflect.Array;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

public class TareaCompuesta extends Tarea{
    ArrayList<Tarea> tareas;
    @Override
    public ArrayList<Tarea> buscar(Condicion c1) {
        ArrayList<Tarea> resultado = new ArrayList<>();
        for(Tarea t: tareas){
            resultado.addAll(t.buscar(c1));
        }
        return resultado;
    }

    @Override
    public ArrayList<Recurso> getRecursos() {
        ArrayList<Recurso> resultado = new ArrayList<>();
        for (Tarea t: tareas){
            resultado.addAll(t.getRecursos());
        }
        return resultado;
    }

    @Override
    public Duration getTiempoEstimado() {

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
        return "";
    }

    @Override
    public boolean esPosibleAsignar(Recurso re) {
        return false;
    }
}
