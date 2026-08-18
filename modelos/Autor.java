public class Autor {
    private String atributo;
    private String nacionalidad;

    public void agregarAtributo(String atributo) {
        this.atributo = atributo;
    }

    public void agregarNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getAtributo() {
        return atributo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void mostrarAutor() {
        System.out.println("Atributo: " + atributo);
        System.out.println("Nacionalidad: " + nacionalidad);
    }
}
