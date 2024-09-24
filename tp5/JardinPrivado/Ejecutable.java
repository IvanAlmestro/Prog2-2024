public class Ejecutable {
    public static void main(String[]args){
        Jardin jardin = new Jardin();
        Planta rosa = new Planta("Rosus", "Rosa", "Argentina", null);
        Planta Pino = new Planta("Pino", "Pino", "Argentina", null);
        Planta Pancho = new Planta("Pnacho", "Pancho", "Argentina", null);
        jardin.addPlanta(rosa);
        jardin.addPlanta(Pino);
        jardin.addPlanta(Pancho);

        System.out.println(jardin.getPlantas());
        
    }
}
