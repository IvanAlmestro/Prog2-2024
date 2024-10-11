package tp8.ej5;
import java.util.ArrayList;

public abstract class Unidad {
    protected ArrayList<Unidad> unidades;

    public abstract int getPuntaje();

    public  ArrayList<String> getConceptos(){
        ArrayList<String> aux = new ArrayList<>();
        int i = 0;
        //recorro primero los unidades
        while (i < unidades.size()) {
            Unidad actual= unidades.get(i);
            //me guardo los conceptos de la unidad Actual, que es una lista de conceptos
            ArrayList<String> conceptoActuales = actual.getConceptos();
            // recorro la lista de conceptos de la unidad actual
            for (String conceptoActual : conceptoActuales) {
                // Si el concepto no está ya en la lista auxiliar, lo agrego
                if(!aux.contains(conceptoActual)){
                    aux.add(conceptoActual);
                }
            }
   
            i++;
        }
        //retorno lista sin duplicados de conceptos.
         return aux;   
        
    }

    public abstract int getTiempoEstimado();


    public void addUnidad(Unidad unidad){
        if(!(unidades.contains(unidad))){
            this.unidades.add(unidad);
        }
    
    }

}
