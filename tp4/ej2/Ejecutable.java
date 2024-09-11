package tp4.ej2;

public class Ejecutable {
    public static void main(String[] args) {
        Timbre timbre =new Timbre();
        Luz luz = new Luz();
        
        Alarma alarma = new Alarma(timbre, luz);
        Sensor vidrioRoto = new Sensor("balcon", true);
        Sensor puerta = new Sensor("baño", true);
        
        alarma.addSensor(vidrioRoto);
        alarma.addSensor(puerta);
        System.out.println("-");
        alarma.comprobar();
    }
}
