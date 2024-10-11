package tp8.ej5;
import java.util.ArrayList;
public class Pregunta extends Unidad{
    private String enunciado;
    private int puntaje;
    private int tiempoEstimado;
    private ArrayList<String> conceptos;

    public Pregunta(String enunciado, int puntaje, int tiempoEstimado) {
        this.enunciado = enunciado;
        this.puntaje = puntaje;
        this.tiempoEstimado = tiempoEstimado;
        this.conceptos = new ArrayList<>();
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public ArrayList<String> getConceptos() {
        return conceptos;
    }

    public void setConceptos(ArrayList<String> conceptos) {
        this.conceptos = conceptos;
    }

    
}
