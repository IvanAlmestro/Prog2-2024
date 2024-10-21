package parciales.parcial2023;

public class PiezaPesadaCompuesta extends  PiezaCompuesta{
    private int sumaGramos;
    public PiezaPesadaCompuesta( String descripcion, String nombre, int gramoAdicional, int segundosExtra ,int sumaGramos) {
        super(descripcion, nombre, gramoAdicional, segundosExtra);
    }

    @Override
    public double getPLAnecesario() {
        return super.getPLAnecesario() + sumaGramos*super.getCantPiezas();
    }
}
