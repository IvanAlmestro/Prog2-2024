import java.util.ArrayList;

public class Trabajo {
    protected ArrayList<String> temasTratados;
    private Evaluador evaluador;
    private String categoria;

    public Trabajo( Evaluador evaluador, String categoria) {
        this.temasTratados = new ArrayList<>(temasTratados);
        this.evaluador = evaluador;
        this.categoria = categoria;
    }

    public ArrayList<String> getTemasTratados() {
        return new ArrayList<>( temasTratados);
    }

  

    public Evaluador getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(Evaluador evaluador) {
        this.evaluador = evaluador;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    public boolean puedeAsignarse(Evaluador evaluador){
        int cont=0;
        for(int i = 0; i < this.temasTratados.size(); i++){
            if(this.temasTratados.get(i).equals(evaluador.getTemasConocidos().get(i))){
                cont++;
            }
        }
        return(cont == this.temasTratados.size());
    }
}
