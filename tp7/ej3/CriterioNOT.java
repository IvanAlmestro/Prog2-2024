package tp7.ej3;

public class CriterioNOT extends Criterio {
    private Criterio c1;

    public CriterioNOT(Criterio c1){
        this.c1=c1;
    }

    @Override
    public boolean cumple(Planta p) {
        return !c1.cumple(p);
    }

    
}
