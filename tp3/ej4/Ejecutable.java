package tp3.ej4;

public class Ejecutable {
    public static void main(String[] args) {
        
        Contacto ivan = new Contacto("ivan", "almestro", "Alvcarez", "ivan@gmail.com", "Laprida", "233123123", 21);
        Contacto ivan2 = new Contacto("ivan", "almestro", "Alvcarez", "ivan@gmail.com", "Laprida", "233123123", 21);
        Contacto juan = new Contacto("Juan", "martins", "Alvcarez", "Juan@gmail.com", "Laprida", "233123123", 30);
        Contacto carlos = new Contacto("Carlos", "alvare", "Alvcarez", "Carlos@gmail.com", "Laprida", "233123123", 54);
        Celular celular = new Celular();

        celular.addContacto(ivan);
        celular.addContacto(ivan2);
        celular.addContacto(juan);
        celular.addContacto(carlos);
        System.out.println("----------");
        System.out.println(celular.getRepetidos());
    }
}
