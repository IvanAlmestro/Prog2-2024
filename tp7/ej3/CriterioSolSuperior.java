package tp7.ej3;

public class CriterioSolSuperior extends Criterio {
    private int cantSol;
    
    public CriterioSolSuperior(int cantSol) {
        this.cantSol = cantSol;
    }

    @Override
    public boolean cumple(Planta planta) {
        return planta.getCantSol() > cantSol;
    }
    
}
