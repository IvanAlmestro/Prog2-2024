import java.util.ArrayList;

public class Jardin{
    private ArrayList<Planta> plantas;

    public Jardin(){
        this.plantas = new ArrayList<Planta>();


    }
    
    public void addPlanta(Planta planta){
        if(!this.plantas.contains(planta)){
            this.plantas.add(planta);
        }

    }

    public ArrayList<Planta> getPlantas() {
        return plantas;
    }
}