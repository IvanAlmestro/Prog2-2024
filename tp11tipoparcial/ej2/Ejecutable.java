package tp11tipoparcial.ej2;


import tp11tipoparcial.ej2.filtros.filtroFechaCreacion;
import tp11tipoparcial.ej2.filtros.filtroNombreIgual;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ejecutable {

public static void main(String[] args) {
    Carpeta carpeta1 = new Carpeta("Docs", LocalDate.of(2000, 3, 23), null);
    Carpeta carpeta2 = new Carpeta("parcial", LocalDate.of(2003,3, 10), null);
    Link link1 = new Link("Facha", null);
    Archivo archivo = new Archivo("parcial", null, null, 100);
    Archivo archivo2 = new Archivo("LOL", LocalDate.of(2001, 6, 14), LocalDate.of(2023, 1, 11), 2000);
    Archivo archivo3 = new Archivo("VALORANT", LocalDate.of(2000, 6, 14), LocalDate.of(2023, 1, 11), 144);
    link1.setDestino(archivo);
    System.out.println("- ");
    // System.out.println(link1);

    carpeta1.addElementoSA(archivo);
    carpeta1.addElementoSA(link1);
    carpeta2.addElementoSA(archivo2);
    carpeta1.addElementoSA(carpeta2);
    carpeta2.addElementoSA(archivo3);


    filtroFechaCreacion fecha = new filtroFechaCreacion(LocalDate.of(1990, 2, 2));
    filtroNombreIgual filtroNombre = new filtroNombreIgual("parcial");
    


    ArrayList<ElementoSA> busqueda = new ArrayList<>();
    
    busqueda.addAll(carpeta1.buscar(filtroNombre));
    System.out.println(busqueda);
    //System.out.println(carpeta1.getCantArchivos());



}
 

}
