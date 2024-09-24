import java.util.ArrayList;

public class Ejecutable {
    public static void main(String[]args){
        CentroComputos centro = new CentroComputos();
        Proceso proce1 = new Proceso(200, "proceso1");
        Proceso proce2 = new Proceso(400, "proceso2");
        Proceso proce3 = new Proceso(600, "proceso3");
        ColaEspera cola = new ColaEspera();
        centro.agregarProceso(proce1);
        centro.agregarProceso(proce2);
        centro.agregarProceso(proce3);

        ColaEspera procesos = centro.getColaProcesos();
        System.out.println("_");
        System.out.println(procesos);
    }
}
