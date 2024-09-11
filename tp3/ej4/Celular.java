package tp3.ej4;

import java.util.ArrayList;

public class Celular {
    private ArrayList<Contacto> contactos;
    
    
    public Celular() {
        this.contactos = new ArrayList<Contacto>();
    }

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
            Contacto contacto1 = contactos.get(i);

            for(int j = i+1; j< contactos.size(); j++){
               Contacto contacto2 = contactos.get(j);
                if(contacto1.equals(contacto2) &&!aux.contains(contacto1)){
                    aux.add(contacto1);
                
                }
            }
        }
        return aux;

    }

    public ArrayList<Contacto> getContactos() {
        return new ArrayList<>(contactos) ;
    }


    public void addContacto(Contacto contacto){
        //checkear si es nulo antes.
        contactos.add(contacto);
    }

    

}
