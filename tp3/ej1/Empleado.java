package tp3.ej1;
import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private ArrayList<Encuesta> encuestasRealizadas;


    public Empleado(String nombre, int DNI) {

        this.nombre = nombre;
        this.encuestasRealizadas = new ArrayList<>(encuestasRealizadas);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public ArrayList<Encuesta> getEncuestas() {
        return new ArrayList<Encuesta>(encuestasRealizadas);
    }

    public void addEncuesta(Encuesta encuesta, int dniEncuestado){
        int contador = 0;
        //encuesta 1 44535277
        //encuesta 1 44535277
        
        //son iguales por lo que no entra y agrega la encuesta
        for (Encuesta enc : encuestasRealizadas) {
            if(enc.getDniEncuestado() == dniEncuestado && encuesta.getNombre() == enc.getNombre()){
   
                contador++;
            }
        }
        if(contador == 0 ){
            this.encuestasRealizadas.add(encuesta);
        }
      
    }

        


    public int getEncuestasRealizadas(){
        return this.getEncuestas().size();
    }
    
}
