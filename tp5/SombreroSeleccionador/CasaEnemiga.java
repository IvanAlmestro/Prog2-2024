import java.util.ArrayList;

public class CasaEnemiga extends Casa {
    private ArrayList<Casa> casasEnemigas;


    
    public CasaEnemiga(int maxAlumnos, String nombre) {
        super(maxAlumnos, nombre);
        this.casasEnemigas = new ArrayList<>();
 
    }
    public ArrayList<Casa> getCasasEnemigas() {
        return casasEnemigas;
    }
    public void setCasasEnemigas(ArrayList<Casa> casasEnemigas) {
        this.casasEnemigas = casasEnemigas;
    }
    public void addCasaEnemiga(Casa c){
        casasEnemigas.add(c);
    }

    public void addAlumno(Alumno alumno){
       
        for (Casa casaEnemiga : this.casasEnemigas) {
            String nombreEnemiga= casaEnemiga.getNombre();
            if(alumno.getCasaActual().getNombre() != nombreEnemiga){
                super.addAlumno(alumno);
            }
        }
        
    }
    
}
