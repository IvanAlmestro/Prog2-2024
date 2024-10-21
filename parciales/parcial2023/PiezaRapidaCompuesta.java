package parciales.parcial2023;

public class PiezaRapidaCompuesta extends  PiezaCompuesta{
    private int sumaExtra;
    public PiezaRapidaCompuesta(String descripcion, String nombre, int gramoAdicional, int segundosExtra, int sumaExtra) {
        super( descripcion, nombre, gramoAdicional, segundosExtra);
        this.sumaExtra = sumaExtra;
    }
@Override
    public int getTiempoEstimado(){
        return super.getTiempoEstimado()+sumaExtra*super.getCantPiezas();

    }
}
