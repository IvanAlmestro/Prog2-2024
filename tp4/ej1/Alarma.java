package tp4.ej1;

public class Alarma {
    
    private boolean vidrioRoto;
    private boolean puertaAbierta;
    private boolean movimiento;
    protected Timbre timbre;
    protected Luz luz;

    public Alarma(Timbre timbre, Luz luz) {
        this.vidrioRoto = false;
        this.puertaAbierta = false;
        this.movimiento = false;
        this.timbre = timbre;
        this.luz = luz;
    }

  

    public void comprobar(){
        if(vidrioRoto || puertaAbierta || movimiento){
            this.timbre.hacerSonar();
        }
    }
}
