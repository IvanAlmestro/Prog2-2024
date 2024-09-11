package tp4.ej2;


public class Sensor{

    private String zona;
    private boolean condicion;
    
    public Sensor( String zona, boolean condicion) {
 
        this.zona = zona;
        this.condicion = condicion;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public boolean isCondicion() {
        return condicion;
    }

    public void setCondicion(boolean condicion) {
        this.condicion = condicion;
    }


    
}