public class Ejecutable {
    public static void main(String[] args) {
        Casa casa1 = new Casa(10, "DocHouse");
        Casa casa2 = new Casa(20, "Macta");

        

        Alumno ivan = new Alumno("ivan");
        Alumno martin = new Alumno("martin");
        Alumno pedro = new Alumno("pedro");
        Alumno juansito = new Alumno("ivan");
        Alumno pitu = new Alumno("pitu");
        casa1.addAlumno(ivan);
        casa1.addAlumno(martin);
        casa1.addAlumno(pedro);
        casa1.addAlumno(juansito);
      

        System.out.println("-");
        for(int i = 0; i < casa1.alumnos.size(); i++){
          
                String nombreAlumno= casa1.getAlumnos().get(i).getNombre();
                System.out.println("Nombre: " + nombreAlumno);

        }
        
       


        CasaEnemiga casaConEnemigo = new CasaEnemiga(5, "DocCchau");

        casaConEnemigo.addCasaEnemiga(casa1);

  
        casaConEnemigo.addAlumno(pitu);

        for(int i = 0; i < casaConEnemigo.getCasasEnemigas().size(); i++){
          
            String nombreAlumno= casaConEnemigo.getAlumnos().get(i).getNombre();
            System.out.println("Nombre: " + nombreAlumno);

        }

        
    }
}
