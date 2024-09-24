public class Pastura extends Cereal{
    private int minHectarea;

    public Pastura(String nombre, String tipo) {
        super(nombre, tipo);
        this.minHectarea= 50;
    }

    public int getMinHectarea() {
        return minHectarea;
    }

    public void setMinHectarea(int minHectarea) {
        this.minHectarea = minHectarea;
    }
    
    public boolean sePuedeSembrarEn(Lote lote){
        if(lote.getHectareas() > minHectarea){
            return super.sePuedeSembrarEn(lote);
        }else{
            return false;
        }
    }
}
