package tp7.ej3;

public class CriterioRiegoSuperior extends Criterio {
    private int cantRiego;

    
    public CriterioRiegoSuperior(int cantRiego) {
        this.cantRiego = cantRiego;
    }


    @Override
    public boolean cumple(Planta planta) {
        return planta.getCantRiego() > cantRiego;
    }
    
    
}
