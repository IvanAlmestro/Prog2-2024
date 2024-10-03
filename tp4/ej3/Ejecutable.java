package tp4.ej3;

public class Ejecutable {
    public static void main(String[] args) {
        Empleado ivan = new Empleado("ivan", 1000, 30);
        EmpleadoComision juan = new EmpleadoComision("juan", 1200, 20, 10, 0.20);
        EmpleadoHoraExtra martin = new EmpleadoHoraExtra("martin", 2000, 30, 100);


        System.out.println("-");
        System.out.println(ivan);
        System.out.println(juan);
        System.out.println(martin);
    }
}
  