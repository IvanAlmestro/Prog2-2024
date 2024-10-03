package tp4.ej4;
import java.util.ArrayList;
import java.time.LocalDate;

public class Integrante {
    private String nombre, apellido;
    private int pasaporte;
    private LocalDate fnac;
    private ArrayList<String> estados;


    
    public Integrante(String nombre, String apellido, int pasaporte, LocalDate fnac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pasaporte = pasaporte;
        this.fnac = fnac;
        this.estados = new ArrayList<String>(estados) ;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getPasaporte() {
        return pasaporte;
    }
    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }
    public LocalDate getFnac() {
        return fnac;
    }
    public void setFnac(LocalDate fnac) {
        this.fnac = fnac;
    }
    public ArrayList<String> getEstados() {
        return estados;
    }
    public void setEstados(ArrayList<String> estados) {
        this.estados = estados;
    }

    
}
