package tp9.ej3;

import java.time.LocalTime;
import java.util.ArrayList;

public class Mesa extends ElementoElectoral{
    private int numeroMesa;
    private ArrayList<Votante> padron;
    private ArrayList<Voto> votos;

    
    public Mesa(int numeroMesa, String nombre) {
        
        this.numeroMesa = numeroMesa;
        this.padron = new ArrayList<>();
        this.votos = new ArrayList<>();
    }
    public int getNumeroMesa() {
        return numeroMesa;
    }
    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
    public ArrayList<Votante> getPadron() {
        return new ArrayList<>(padron);
    }
    public int getVotos() {
        return votos.size();
    }
    public void addVoto(Voto voto){
        if(padron.contains(voto.getVotante())){
            votos.add(voto);
        }
    }
    @Override
    public double porcentajeVoto(Candidato candidato) {
        int cantVotosCandidato = 0;

        for (Voto voto: votos) {
            Candidato candidatoActual = voto.getReferenciaVoto();
            if(candidato.equals(candidatoActual)){
                cantVotosCandidato++;
            }
        }
        return this.getVotos()/cantVotosCandidato;
    }
    @Override
    public double porcentajeVotoHora(Candidato candidato, LocalTime hora1, LocalTime hora2) {
        int cantVotosHora = 0;
        for (Voto voto : votos) {
            LocalTime horaVoto= voto.getHorarioVoto();
            if(horaVoto.isAfter(hora1) && horaVoto.isBefore(hora2)){
                cantVotosHora ++;
            }
        }
        return getVotos()/cantVotosHora;
    }
    @Override
    public double porcentajeVotoBlanco() {
        int votosEnBlanco=0;
        for (Voto voto: votos) {
            if (voto.getReferenciaVoto() == null){
                votosEnBlanco++;
            }
        }
        return getVotos()/votosEnBlanco;
    }

    
}
