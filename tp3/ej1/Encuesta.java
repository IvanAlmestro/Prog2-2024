package tp3.ej1;
import java.util.ArrayList;

public class Encuesta {
    private String nombre;
    private ArrayList<String> preguntas;


    private int dniEncuestado;
    private Empleado empleado;



    public Encuesta(String nombre, int dniEncuestado, Empleado empleado) {
        this.nombre = nombre;
        this.preguntas = new ArrayList<>(preguntas);

        this.dniEncuestado = dniEncuestado;
        this.empleado = empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public int getDniEncuestado() {
        return dniEncuestado;
    }

    public void setDniEncuestado(int dniEncuestado) {
        this.dniEncuestado = dniEncuestado;
    }

    public ArrayList<String> getPreguntas() {
        return new ArrayList<String>(preguntas);
    }

    
}
