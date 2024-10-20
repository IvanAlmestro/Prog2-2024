package tp11.ej1.Comparadores;

import java.util.Comparator;

import tp11.ej1.Socio;

public class ComparadorEdad implements Comparator<Socio>{

    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.getEdad() - o2.getEdad();
    }
    
}