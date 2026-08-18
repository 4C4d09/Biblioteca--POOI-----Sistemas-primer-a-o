public class Nacionalidad {
    private String pais;
    private String idioma;

    public void agregarPais(String pais) {
        this.pais = pais;
    }

    public void agregarIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getPais() {
        return pais;
    }

    public String getIdioma() {
        return idioma;
    }

    public void mostrarNacionalidad() {
        System.out.println("País: " + pais);
        System.out.println("Idioma: " + idioma);
    }
}
