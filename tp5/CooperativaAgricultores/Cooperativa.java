import java.util.ArrayList;

public class Cooperativa {
    private ArrayList<Lote> lotes;
    private ArrayList<Cereal> cereales;
    private ArrayList<String> mineralesPrimarios;
    private String nombre;

    public Cooperativa(String nombre){
        this.lotes = new ArrayList<>();
        this.cereales = new ArrayList<>();
        this.nombre = nombre;
    }

    public ArrayList<Lote> getLotes() {
        return new ArrayList<>(lotes);
    }

    public ArrayList<Cereal> getCereales(){
        return new ArrayList<>(cereales);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean esEspecial(Lote lote){
        int cont = 0;
        for(int i= 0; i < this.mineralesPrimarios.size(); i++){
            if(lote.tieneMineral(this.mineralesPrimarios.get(i))){
                cont++;
            }
        }
        return cont == mineralesPrimarios.size();
    }
    
}
