package tp11.ej2;


import tp11.ej2.Comparadores.ComparadorFechaCreacion;
import tp11.ej2.Comparadores.ComparadorNombre;
import tp11.ej2.Comparadores.ComparadorTamaño;
import tp11.ej2.filtros.filtroFechaCreacion;
import tp11.ej2.filtros.filtroNombreIgual;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Ejecutable {

public static void main(String[] args) {
    Carpeta carpeta1 = new Carpeta("Docs", LocalDate.of(2000, 3, 23), null);
    Carpeta carpeta2 = new Carpeta("Parciales", LocalDate.of(2003, 3, 10), null);
    Carpeta carpeta3 = new Carpeta("Juegos", LocalDate.of(2022, 1, 1), null);
    Carpeta carpeta4 = new Carpeta("Proyectos", LocalDate.of(2019, 5, 15), null);
    Carpeta carpeta5 = new Carpeta("Universidad", LocalDate.of(2020, 9, 10), null);

    Link link1 = new Link("Facha", null);
    Link link2 = new Link("ProyectoFinal", null);

    Archivo archivo1 = new Archivo("Parcial1", LocalDate.of(2001, 4, 10), LocalDate.of(2022, 3, 15), 120);
    Archivo archivo2 = new Archivo("LOL", LocalDate.of(2001, 6, 14), LocalDate.of(2023, 1, 11), 2000);
    Archivo archivo3 = new Archivo("VALORANT", LocalDate.of(2000, 6, 14), LocalDate.of(2023, 1, 11), 144);
    Archivo archivo4 = new Archivo("Resumen", LocalDate.of(2019, 10, 21), LocalDate.of(2020, 2, 11), 150);
    Archivo archivo5 = new Archivo("Tesis", LocalDate.of(2021, 8, 17), LocalDate.of(2023, 5, 5), 500);
    Archivo archivo6 = new Archivo("CSGO", LocalDate.of(2023, 2, 3), LocalDate.of(2023, 4, 10), 180);

    link1.setDestino(archivo1);
    link2.setDestino(carpeta4);

// Agregando archivos y carpetas a las carpetas
    carpeta1.addElementoSA(archivo1);        // Docs contiene Parcial1
    carpeta1.addElementoSA(link1);           // Docs contiene un link a Parcial1

    carpeta2.addElementoSA(archivo2);        // Parciales contiene LOL
    carpeta2.addElementoSA(archivo3);        // Parciales contiene VALORANT
    carpeta2.addElementoSA(archivo4);        // Parciales contiene Resumen

    carpeta3.addElementoSA(archivo5);        // Juegos contiene Tesis
    carpeta3.addElementoSA(archivo6);        // Juegos contiene CSGO

    carpeta4.addElementoSA(carpeta3);        // Proyectos contiene Juegos
    carpeta4.addElementoSA(link2);           // Proyectos contiene un link a carpeta Proyectos

    carpeta1.addElementoSA(carpeta2);        // Docs contiene Parciales
    carpeta1.addElementoSA(carpeta4);        // Docs contiene Proyectos

    carpeta5.addElementoSA(carpeta1);        // Universidad contiene Docs

// Imprimir el resultado (esto es solo un ejemplo, puedes recorrer y mostrar el árbol como desees)
    System.out.println("- Estructura de la carpeta Universidad: ");



    filtroFechaCreacion fecha = new filtroFechaCreacion(LocalDate.of(1900, 2, 2));
    filtroNombreIgual filtroNombre = new filtroNombreIgual("Parcial1");


    ComparadorNombre comp1 = new ComparadorNombre();
    ComparadorTamaño comp3 = new ComparadorTamaño();
    ComparadorFechaCreacion comp2 = new ComparadorFechaCreacion();

    ArrayList<ElementoSA> busqueda = new ArrayList<>();

    busqueda.addAll(carpeta1.buscarOrdenado(fecha, comp3));
    System.out.println(busqueda);
    //System.out.println(carpeta1.getCantArchivos());






}
 

}
