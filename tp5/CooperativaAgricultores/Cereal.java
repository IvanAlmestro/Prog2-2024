import java.util.ArrayList;

public class Cereal{
    private String nombre;
    private String tipo;
    private ArrayList<String> minerales;

    public Cereal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.minerales = new ArrayList<>(minerales);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<String> getMinerales() {
        return new ArrayList<String>(minerales);
    }

   

    public boolean sePuedeSembrarEn(Lote lote) {
        for (int i = 0; i < minerales.size(); i++) {
            String mineral = this.minerales.get(i);
            if (!lote.tieneMineral(mineral)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean necesitaMineral(String mineral) {
        return this.minerales.contains(mineral);
    }
    
}