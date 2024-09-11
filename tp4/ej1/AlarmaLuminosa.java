package tp4.ej1;

public class AlarmaLuminosa extends Alarma {

    public AlarmaLuminosa(Timbre timbre, Luz luz) {
        super(timbre, luz);

    }

    @Override
    public void comprobar() {
        
        super.comprobar();
        luz.encender();
    }
    
}
