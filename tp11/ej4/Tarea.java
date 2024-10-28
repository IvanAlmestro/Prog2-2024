package tp11.ej4;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Tarea {
    private String nombre;

    public abstract ArrayList<Tarea> buscar(Condicion c1);
    public abstract ArrayList<Recurso> getRecursos();
    public abstract Duration getTiempoEstimado();
    public abstract LocalDate getFechaInicio();
    public abstract LocalDate getFechaFin();
    public abstract String getEstado();
    public abstract  boolean esPosibleAsignar(Recurso re);
}
