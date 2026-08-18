public class Libro {
    private String categoria;
    private String editorial;

    public void agregarCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void agregarEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getEditorial() {
        return editorial;
    }

    public void mostrarLibro() {
        System.out.println("Categoría: " + categoria);
        System.out.println("Editorial: " + editorial);
    }
}
