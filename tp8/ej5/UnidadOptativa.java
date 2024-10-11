package tp8.ej5;

import java.util.ArrayList;

public class UnidadOptativa extends Unidad{

    @Override
    public int getPuntaje() {
        int mayorPuntaje = -1;
        for (Unidad unidad : unidades) {
            int unidadActual = unidad.getPuntaje();
            if(unidadActual > mayorPuntaje){
                mayorPuntaje = unidadActual;
            }
        }
        return mayorPuntaje;
    }
    
    @Override
    public int getTiempoEstimado() {
        int mayorTiempo = -1;
        for (Unidad unidad : unidades) {
            int unidadActual = unidad.getTiempoEstimado();
            if(unidadActual > mayorTiempo){
                mayorTiempo = unidadActual;
            }
        }
        return mayorTiempo;
    }

}