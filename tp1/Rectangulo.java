package tp1;
public class Rectangulo {
    private PuntoGeometrico lado1;
    private PuntoGeometrico lado2;

    private double base;
    private double altura;

    public Rectangulo(PuntoGeometrico lado1, PuntoGeometrico lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;

    }

    public PuntoGeometrico getLado1() {
        return lado1;
    }

    public PuntoGeometrico getLado2() {
        return lado2;
    }


    public void desplazar(int desplazamientoX, int desplazamientoY){
        this.lado1.desplazamiento(desplazamientoX, desplazamientoY);
        this.lado2.desplazamiento(desplazamientoX, desplazamientoY);
    }

    public double calcularArea(){
        return base*altura;
    }
    
    public int compararRectangulo(Rectangulo rectangulo2){
        double area1 = this.calcularArea();
        double area2 = rectangulo2.calcularArea();
        if(area1 > area2){
            return 1;

        }else if(area1 == area2){
            return 0;

        }else{
            return -1;
        }    
    }

    public boolean esCuadrado(){
        return this.base == this.altura;
    }

   
        public static void main(String[] args) {
            PuntoGeometrico p1 = new PuntoGeometrico(1, 1);
            PuntoGeometrico p2 = new PuntoGeometrico(5, 4);
    
            Rectangulo rectangulo1 = new Rectangulo(p1, p2);
            System.out.println("Área del rectángulo: " + rectangulo1.calcularArea());
            System.out.println("Es un cuadrado: " + rectangulo1.esCuadrado());
            //System.out.println("El rectángulo está parado: " + rectangulo1.estaParado());
    
            PuntoGeometrico p3 = new PuntoGeometrico(0, 0);
            PuntoGeometrico p4 = new PuntoGeometrico(3, 3);
            Rectangulo rectangulo2 = new Rectangulo(p3, p4);
    
            int comparacion = rectangulo1.compararRectangulo(rectangulo2);
            if (comparacion > 0) {
                System.out.println("Rectángulo 1 es mayor que Rectángulo 2");
            } else if (comparacion < 0) {
                System.out.println("Rectángulo 1 es menor que Rectángulo 2");
            } else {
                System.out.println("Ambos rectángulos son iguales en área");
            }
        }   
}
