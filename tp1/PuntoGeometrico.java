package tp1;
public class PuntoGeometrico{
    private int x, y;


    
    public PuntoGeometrico(){
        this.x = 0;
        this.y = 0;
    }
    public PuntoGeometrico(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void desplazamiento(int desplazamientoX, int desplazamientoY){
        this.x = x + desplazamientoX;
        this.y = y + desplazamientoY;

    }

    // Método para calcular la distancia euclídea con otro punto
    public double calcularDistancia(PuntoGeometrico otroPunto) {
        int deltaX = this.x - otroPunto.x;
        int deltaY = this.y - otroPunto.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}