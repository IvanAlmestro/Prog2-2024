package tp2.ej4;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private int minVecesSocio = 4;
    private int cantReservas;
    private ArrayList<Turno> turnos;
    
    public Usuario(String nombre, int cantReservas) {
        this.nombre = nombre;
        this.cantReservas = cantReservas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMinVecesSocio() {
        return minVecesSocio;
    }

    public void setMinVecesSocio(int minVecesSocio) {
        this.minVecesSocio = minVecesSocio;
    }

    public int getCantReservas(){
        return this.cantReservas;
    }
    
    public boolean esSocio(Usuario usuario){
        int contador=0;
        Period diferencia;
        int mesesQuePasaron;
        LocalDate hoy = LocalDate.now();

        for (Turno turno : turnos) {
            diferencia = Period.between(hoy, turno.getFecha());
            mesesQuePasaron = diferencia.getMonths();
            if((turno.getUsuario().equals(usuario))&& (mesesQuePasaron >=minVecesSocio)){
                contador++;
            }
      

        }
        return contador >=minVecesSocio;

    }
    
    

    public void addTurno(Turno turno){
        if(!this.turnos.contains(turno)){
            this.turnos.add(turno);
        
        }
        else{
            System.out.println("Ya existe el turno");
        }
   
    }
    
}
