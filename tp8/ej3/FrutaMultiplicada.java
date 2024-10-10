package tp8.ej3;

public class FrutaMultiplicada extends Fruta{
    private int multiplicador;

    @Override
    public double getFuerza() {
        return super.getFuerza() * multiplicador;
    }

    
}
