import java.util.ArrayList;

public class Evaluador {
    private ArrayList<String> temasConocidos;
    private ArrayList<Trabajo> trabajos;
    private String nombre;
    
    

    public Evaluador(String nombre) {
        this.temasConocidos = new ArrayList<>();
        this.trabajos = new ArrayList<>();
        this.nombre = nombre;
    }

    public void addTrabajo(Trabajo trabajo){
        if(this.puedeAsignarse(trabajo) && trabajo!=null){
            this.trabajos.add(trabajo);
        }
    }

    public ArrayList<String> getTemasConocidos() {
        return  new ArrayList<>(temasConocidos) ;
    }



    public ArrayList<Trabajo> getTrabajos() {
        return new ArrayList<>(trabajos) ;
    }



    public String getNombre() {
        return nombre;
    }



    public boolean puedeAsignarse(Trabajo trabajo){
       return trabajo.puedeAsignarse(this);
    }

    public int cantTrabajos(){
        return this.trabajos.size();
    }
}
