package tp11.ej3;
import tp11.ej3.Condiciones.Condicion;

import java.util.ArrayList;

public abstract class ElementoNoticia {

     //este metodo no tenia como resolverlo en Categoria 
   //entonces al abstraerlo delegamos responsabilidad.
    public abstract int getCantNoticias();
    public abstract ArrayList<ElementoNoticia> buscar(Condicion c);
    public abstract  ElementoNoticia getCopia(Condicion c);
    public abstract ArrayList<String> getMapaSitio();


}
