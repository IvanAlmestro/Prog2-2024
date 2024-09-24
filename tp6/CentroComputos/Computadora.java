public class Computadora  extends ElementoCola{

    private int velocidad;
    private Proceso proc;

    public Computadora(int velocidad){
        super("compu");
        this.velocidad = velocidad;
        this.proc = null;
    }
    public void ejecutarProceso(Proceso proce){
        this.proc = proce;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Computadora [nombre=" + super.getNombre()+ ", getNombre()=" + getNombre()
                + ", getVelocidad()=" + getVelocidad() + "]";
    }



    @Override
    public boolean esMayor(ElementoCola elem) {
        return ((Computadora)elem).getVelocidad()>this.getVelocidad();
    }
    public Proceso getProc() {
        return proc;
    }
    public void setProc(Proceso proc) {
        this.proc = proc;
    }

    
}
