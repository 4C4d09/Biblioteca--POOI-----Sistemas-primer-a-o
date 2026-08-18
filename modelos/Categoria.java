class Categoria {
    private String tipo;
    private String descripcion;

    public void agregarTipo(String tipo) {
        this.tipo = tipo;
    }

    public void agregarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void mostrarCategoria() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Descripción: " + descripcion);
    }
}