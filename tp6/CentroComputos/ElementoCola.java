public abstract class ElementoCola {
    private String nombre;


    public ElementoCola(String nombre){
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract boolean esMayor(ElementoCola elem);
}
