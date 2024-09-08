package tp3.ej4;

import java.util.ArrayList;

public class Celular {
    private ArrayList<Contacto> contactos;
    

    public double getPromedioEdad(){
        double total = 0;
        int contador = 0;
        for (Contacto contacto : contactos) {
            total += contacto.getEdad();
            contador ++;
        }
        return total / contador;
    }

    public ArrayList<Contacto> getRepetidos(){
        ArrayList<Contacto> aux = new ArrayList<>();
        for(int i = 0; i<contactos.size(); i++){
            for(int j = i; i< contactos.size(); j++){
                Contacto contacto1 = contactos.get(i);
                Contacto contacto2 = contactos.get(j);
                if(contacto1.equals(contacto2)){
                    aux.add(contacto1);
                }
            }
        }
        return aux;

    }

    

}
