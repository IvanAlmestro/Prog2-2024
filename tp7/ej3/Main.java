package tp7.ej3;

public class Main {
    public static void main(String[] args) {
        Vivero vivero = new Vivero("Mariana");
        Planta lengua = new Planta("Sansi beria", "Potus", "Monocotyle", "Aracae", 4, 3);
        
        vivero.addPlanta(lengua);

        CriterioNombreCientifico palabra = new CriterioNombreCientifico("sansi");
        System.out.println("-");
       System.out.println(vivero.buscar(palabra);); 


    }

}
