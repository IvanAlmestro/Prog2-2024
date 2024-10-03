package tp7.ej3;

public class Main {
    public static void main(String[] args) {
        Vivero vivero = new Vivero("Mariana");
        Planta lengua = new Planta("Sansi beria", "Potus", "Monocotyle", "Aracae", 4, 3);
        
        vivero.addPlanta(lengua);

        CriterioNombreCientifico palabra = new CriterioNombreCientifico("Sansi");
        

        CriterioSolSuperior solSuperiorA2 = new CriterioSolSuperior(2);
        // criterio para hacer que sea inferior a un numero que le pasamos, hacemos que sea negativo el de superior
        CriterioNOT solInferiorA2 = new CriterioNOT(solSuperiorA2);

        CriterioAND palabraYSolSuperior = new CriterioAND(solSuperiorA2, palabra);
        
        System.out.println("-");
       System.out.println(vivero.buscar(palabraYSolSuperior)); 


    }

}
