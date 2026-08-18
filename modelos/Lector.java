public class Lector {
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;

    public void agregarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void agregarDni(String dni) {
        this.dni = dni;
    }

    public void agregarDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void mostrarLector() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("DNI: " + dni);
        System.out.println("Dirección: " + direccion);
    }
}
