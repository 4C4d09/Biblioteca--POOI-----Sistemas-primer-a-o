class Copia {
    private String id;
    private String estado;

    public void agregarId(String id) {
        this.id = id;
    }

    public void agregarEstado(String estado) {
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public void mostrarCopia() {
        System.out.println("Id: " + id);
        System.out.println("Estado: " + estado);
    }
}
