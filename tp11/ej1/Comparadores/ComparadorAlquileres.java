package tp11.ej1.Comparadores;

import java.util.Comparator;

import tp11.ej1.Socio;

public class ComparadorAlquileres implements Comparator<Socio>{
    int idCancha;
    public  ComparadorAlquileres(int idCancha){
        this.idCancha = idCancha;
    }
    @Override
    public int compare(Socio o1, Socio o2) {
        if(o1.cantTotalAlquilerCancha(idCancha) > o2.cantTotalAlquilerCancha(idCancha)){
            return 1;
        }else if(o1.cantTotalAlquilerCancha(idCancha) < o2.cantTotalAlquilerCancha(idCancha)){
            return -1;
        }
        else{
            return 0;
        }
    }
    
}
