package tp7.ej3;

import java.util.ArrayList;

public class Vivero {
    private ArrayList<Planta> plantas;
    private String nombre;
    
    public Vivero( String nombre) {
        this.plantas = new ArrayList<>() ;
        this.nombre = nombre;
    }

    public ArrayList<Planta> getPlantas() {
        return plantas;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  void addPlanta(Planta p)
   {
        this.plantas.add(p);
   } 

   public ArrayList<Planta> buscar(Criterio c1){
        ArrayList<Planta> plantasCumplen = new ArrayList<>();
        for(int i = 0; i < plantas.size(); i++){
            if(c1.cumple(plantas.get(i))){
                plantasCumplen.add(plantas.get(i));
            }
        }
        return plantasCumplen;
   }
}
