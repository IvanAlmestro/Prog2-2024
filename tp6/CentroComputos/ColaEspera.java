import java.util.ArrayList;

public class ColaEspera {
    private ArrayList<ElementoCola> elementos;

    public ElementoCola getSiguiente(){
        if(!estaVacia()){
            return elementos.remove(0);
        }else{
            return null;
        }
    }
    public boolean estaVacia(){
        return elementos.isEmpty();
    }

    //agregar elemento ordenado
    public void addElemento(ElementoCola elem){
        boolean ingreso = false;
        int i = 0;
        while(!ingreso && i < elementos.size() ){
            if(elem.esMayor(elementos.get(i))){
                elementos.add(i, elem);
                ingreso=true;
            }
        }
        if(!ingreso){
            elementos.add(elem);
        }
      
    }
   
}
