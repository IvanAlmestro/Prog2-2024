import java.util.ArrayList;

public class Congreso{
    private ArrayList<Evaluador> evaluadores;
    private ArrayList<Trabajo> trabajos;


    
    public Congreso() {
        this.evaluadores = new ArrayList<>(evaluadores);
        this.trabajos = new ArrayList<>(trabajos);
    }
    public ArrayList<Evaluador> getEvaluadores() {
        return new ArrayList<>(evaluadores);
    }
    public ArrayList<Trabajo> getTrabajos() {
        return new ArrayList<>(trabajos);
    }


    
    public boolean esTipo(Evaluador evaluador, ArrayList<String> temasTipo){
        int cont=0;
        for(int i = 0;  i < temasTipo.size(); i++){
            if(evaluador.getTemasConocidos().contains(temasTipo.get(i))){
                cont++;
            }
        }
        return cont == evaluador.getTemasConocidos().size();

    }
}