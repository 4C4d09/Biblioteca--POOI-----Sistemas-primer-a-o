public class Editorial {
    private String nombre;
    private String direccion;

    public void agregarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void mostrarEditorial() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
    }
}
