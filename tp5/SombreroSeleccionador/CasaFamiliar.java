import java.util.ArrayList;

public class CasaFamiliar extends Casa {
    
    private ArrayList<String> familiares;
    
    public CasaFamiliar(int maxAlumnos, String nombre, ArrayList<String> familiares) {
        super(maxAlumnos, nombre);
        this.familiares = new ArrayList<>(familiares);
    }

    public ArrayList<String> getFamiliares(){
        return new ArrayList<>(familiares);
    }

    public void addAlumno(Alumno alumno){
        for (String familiar : this.familiares) {
            if(alumno.getFamiliares().contains(familiar)){
                super.addAlumno(alumno);
            }
        }
    }
}
