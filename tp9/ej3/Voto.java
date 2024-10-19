package tp9.ej3;


import java.time.LocalTime;

public class Voto{

    private Candidato referenciaVoto;
    private LocalTime horarioVoto;
    private Votante votante;

    
    public Voto(Candidato referenciaVoto, LocalTime horarioVoto, Votante votante) {
        this.referenciaVoto = referenciaVoto;
        this.horarioVoto = LocalTime.now();
        this.votante = votante;
    }


    public Candidato getReferenciaVoto() {
        return referenciaVoto;
    }


    public void setReferenciaVoto(Candidato referenciaVoto) {
        this.referenciaVoto = referenciaVoto;
    }


    public LocalTime getHorarioVoto() {
        return horarioVoto;
    }


    public void setHorarioVoto(LocalTime horarioVoto) {
        this.horarioVoto = horarioVoto;
    }


    public Votante getVotante() {
        return votante;
    }


    public void setVotante(Votante votante) {
        this.votante = votante;
    }

    
}