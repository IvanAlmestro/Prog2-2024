package tp9.ej3;

public class Votante{
    private Mesa votoEnMesa;
    private int DNI;
    public Votante(Mesa votoEnMesa, int dNI) {
        this.votoEnMesa = votoEnMesa;
        DNI = dNI;
    }
    public Mesa getVotoEnMesa() {
        return votoEnMesa;
    }
    public void setVotoEnMesa(Mesa votoEnMesa) {
        
        this.votoEnMesa = votoEnMesa;
    }
    public int getDNI() {
        return DNI;
    }
    public void setDNI(int dNI) {
        DNI = dNI;
    }
    
}