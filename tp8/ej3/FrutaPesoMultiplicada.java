package tp8.ej3;

public class FrutaPesoMultiplicada extends FrutaMultiplicada{
    private double peso;

    public double getFuerza(){
        return super.getFuerza()+ this.peso;
    }
}
