package tp9.ej1;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

import tp9.ej1.filtros.filtroFechaModificado;
import tp9.ej1.filtros.filtroFechaCreacion;

public class Ejecutable {

public static void main(String[] args) {
    Carpeta carpeta1 = new Carpeta("Docs", LocalDate.of(2000, 3, 23));
    Carpeta carpeta2 = new Carpeta("Juegos", LocalDate.of(2003,3, 10));
    Link link1 = new Link("Facha", null);
    Archivo archivo = new Archivo("archivazo", null, null, 100);
    Archivo archivo2 = new Archivo("LOL", LocalDate.of(2001, 6, 14), LocalDate.of(2023, 1, 11), 2000);
    link1.setDestino(archivo);
    System.out.println("- ");
    // System.out.println(link1);

    carpeta1.addElementoSA(archivo);
    carpeta1.addElementoSA(link1);
    carpeta2.addElementoSA(archivo2);
    carpeta1.addElementoSA(carpeta2);
    carpeta2.addElementoSA(archivo);
    filtroFechaCreacion fecha = new filtroFechaCreacion(LocalDate.of(1990, 2, 2));

    ArrayList<ElementoSA> busqueda = new ArrayList<>();
    
    busqueda.addAll(carpeta1.buscar(fecha));
    
    System.out.println(carpeta1.getCantArchivos());

}
 

}
