package tp4.ej3;
public class Empleado {
    private String nombre;
    private double salario;
    private int horasTrabajadas;

    public Empleado(String nombre, double salario, int horasTrabajadas) {
        this.nombre = nombre;
        this.salario = salario;
        this.horasTrabajadas = horasTrabajadas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public String toString(){
        return " nombre: " + nombre+
                " sueldo: " + getSalario() +
                " horas trabajadas: " +horasTrabajadas;
    }
}
