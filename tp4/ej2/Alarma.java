package tp4.ej2;
import java.util.ArrayList;
public class Alarma {
    
    private ArrayList<Sensor> sensores;

    protected Timbre timbre;
    protected Luz luz;

    public Alarma(Timbre timbre, Luz luz) {
        
        this.sensores = new ArrayList<Sensor>();
        this.timbre = timbre;
        this.luz = luz;
    }

 

    public void comprobar(){
        for (Sensor sensor : sensores) {
            if(sensor.isCondicion()){
                String zona = sensor.getZona();
                this.timbre.hacerSonar(zona);
            
            }
        }
   
    }
    public void addSensor(Sensor sensor){
        if(sensor!=null){
            this.sensores.add(sensor);
        }
        
    }
}
