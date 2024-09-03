package tp3.ej2;
public class Ejecutable {
 public static void main(String[] args) {
   Stock stock1 = new Stock();
   Mueble silla = new Mueble(100.0, 200, "azul", "Roble", 1000.0, "Silla", 0.35);
   stock1.addMueble(silla);

   System.out.println(stock1.costoFabricacionStock(false));
 }   
}
