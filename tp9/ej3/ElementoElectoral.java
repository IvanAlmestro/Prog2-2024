package tp9.ej3;

import java.time.LocalTime;

public abstract class ElementoElectoral {
    public abstract  int getVotos();
    public abstract double porcentajeVoto(Candidato candidato);
    public abstract double porcentajeVotoHora(Candidato candidato, LocalTime hora1, LocalTime hora2);
    public abstract double porcentajeVotoBlanco();
}
