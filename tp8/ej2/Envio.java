package tp8.ej2;

public abstract class Envio {

    private int ID=0;
    private int nroTracking;
    
    public Envio() {
        ID++;
        this.nroTracking = ID;
    }

    public abstract double getPeso();

    public abstract String getDireccionDestino();
    public abstract void setDireccionDestino(String s);

    public abstract String getDireccionOrigen();
    public abstract void setDireccionOrigen(String s);

    

    public int getNroTracking() {
        return nroTracking;
    }

    public void setNroTracking(int nroTracking) {
        this.nroTracking = nroTracking;
    }

}
