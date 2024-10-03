package tp4.ej3;
public class EmpleadoComision extends Empleado{
    private int cantVentas;
    private double porcentaje;
    public EmpleadoComision(String nombre, int salario, int horasTrabajadas, int cantVentas, double porcentaje) {
        super(nombre, salario, horasTrabajadas);
        this.cantVentas=cantVentas;
        this.porcentaje = porcentaje;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }
    
    public double getSalario(){
        return super.getSalario() + (porcentaje*cantVentas);
    }
    
    public String toString(){
        return super.toString() + " ventas: " + cantVentas + " porcentaje " + porcentaje;
    }
}
