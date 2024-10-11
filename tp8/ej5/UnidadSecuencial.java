package tp8.ej5;

public class UnidadSecuencial extends Unidad{

    @Override
    public int getPuntaje() {
        int total = 0;
        for (Unidad unidad : unidades) {
            total += unidad.getPuntaje();
        }
        return total;
    }

    @Override
    public int getTiempoEstimado() {
        int total = 0;
        for (Unidad unidad : unidades) {
            total += unidad.getTiempoEstimado();
        }
        return total;
    }
    
}