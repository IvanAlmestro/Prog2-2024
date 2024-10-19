package tp9.ej4;
import java.util.ArrayList;

import tp9.ej4.Condiciones.Condicion;

public abstract class ElementoNoticia {

     //este metodo no tenia como resolverlo en Categoria 
   //entonces al abstraerlo delegamos responsabilidad.
    public abstract int getCantNoticias();
    public abstract ArrayList<ElementoNoticia> buscar(Condicion c);
  
    
}
