package tp8.ej3;

import java.util.ArrayList;

public class Tripulacion extends Entidad{

    private ArrayList<Entidad> entidades;

    public Tripulacion(String nombre, double fuerza, double peso, int edad) {
        super(nombre, fuerza, peso, edad);
       
    }

    

    @Override
    public double getFuerza() {
        double total= 0.0;
        for (Entidad ent : entidades) {
            total+=ent.getFuerza();
        }
        return total;
    }


    @Override
    public double getPeso() {
       return entidades.get(0).getPeso();
    }


    @Override
    public int getEdad() {
        int mayorEdad=-1;
        for (Entidad ent : entidades) {
                int edadActual = ent.getEdad();
                if(mayorEdad<edadActual){
                    mayorEdad =edadActual;
                }
        }
        return mayorEdad;
    }

    @Override
    public int getCantMiembros() {
        int sum=0;
        for (Entidad ent : entidades) {
            sum+= ent.getCantMiembros();
        }
        return sum;
    }



    public ArrayList<Entidad> getEntidades() {
        return entidades;
    }



    public void setEntidades(ArrayList<Entidad> entidades) {
        this.entidades = entidades;
    }
    
}
