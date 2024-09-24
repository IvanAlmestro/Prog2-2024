public class Poster extends Trabajo {

    public Poster(Evaluador evaluador, String categoria) {
        super(evaluador, categoria);
        //TODO Auto-generated constructor stub
    }


    public boolean puedeAsignarse(Evaluador evaluador){
        int cont = 0;
        for(int i = 0; i < evaluador.getTemasConocidos().size(); i++){
            if(evaluador.getTemasConocidos().get(i) == this.temasTratados.get(i)){
                cont++;
            }
        }   
        return(cont > 0);
    }
}
