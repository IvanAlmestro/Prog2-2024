package tp2.ej2;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Reunion> reuniones;

    public Agenda() {
        this.reuniones = new ArrayList<>(reuniones);
    }
    
    public void addReunion(Reunion r){
        boolean hayReunion = false;
        for (Reunion reunion : reuniones) {
            if(reunion.getFecha().equals(r.getFecha())){
                System.out.println("Ya hay una reunion esa fecha");
                hayReunion=true;
            }
        }
        if(hayReunion==false){
            reuniones.add(r);
            System.out.println("Se agrego con éxito");
        }

    }

}
