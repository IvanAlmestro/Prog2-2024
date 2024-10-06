package tp8.ej1;

public class Ejecutable {

public static void main(String[] args) {
    Link link1 = new Link("Facha", null);
    Archivo archivo = new Archivo("archivazo", null, null, 0);
    link1.setDestino(archivo);
    System.out.println("- ");
    System.out.println(link1);
}
 

}
