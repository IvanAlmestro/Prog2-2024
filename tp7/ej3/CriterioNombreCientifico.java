package tp7.ej3;

public class CriterioNombreCientifico extends Criterio {
    private String nombre;

    public CriterioNombreCientifico(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Planta planta) {
        return planta.getNombreCientifico().contains(nombre);
    }
    
}
