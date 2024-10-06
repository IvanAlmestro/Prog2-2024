package tp8.ej1;
import java.util.ArrayList;
import java.time.LocalDate;
public class Carpeta extends ElementoSA {

    private ArrayList<ElementoSA> elementos;
    //private ArrayList<Archivo> archivos;
    //private ArrayList<Carpeta> carpetas;
    //private ArrayList<Link> links;

    public Carpeta(String nombre, LocalDate fechaCreacion) {
        super(nombre, fechaCreacion);
        elementos = new ArrayList<>();

    }

    public double getTamanio(){
        double total = 0.0;
        for (ElementoSA elementoSA : elementos) {
            total+=elementoSA.getTamanio();
        }
        return total;
    }

    @Override
    public int getCantArchivos(){
        int total = 0;
        for(ElementoSA elem: elementos){
            // este if es incorrecto debido a que esta atado al tipo del elemento
            // cuando agregamos mas tipos de cosas hay que hacer un if por cada tipo.
           /*
           if(elem es un archivo){
                total++;
            }
            //sino es una carpeta
            else{
                total+= elem.cantArchivosCarpeta();
            } */ 
           //abstraimos el metodo get cant archivos para que cada hijo sepa como contarlos. (les paso la pelota)
           total += elem.getCantArchivos();
        }
        return total;
    }


    public void addElementoSA(ElementoSA elem){

    }
    //Aca lo que pasa al tener dos listas distintas repito el codigo.
    //ademas nos podemos dar cuenta que los atributos se repiten.
    /* 
    public double getTamanio(){
        double total = 0.0;
        for (Archivo archivo : this.archivos) {
            total += archivo.getTamanio();
        }
        for (Carpeta carpeta : carpetas) {
            total+= carpeta.getTamanio();
        }
        for (Link link : links) {
            total+= link.getTamanio();
        }
        return total;
    }
    */
    //ademas cuando agreguemos mas elementos
    //vamos a tener que recorrer y repetir codigo otra vez.


}
