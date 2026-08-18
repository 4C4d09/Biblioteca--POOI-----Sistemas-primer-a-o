public class Multa {
    private String lector;
    private double monto;
    private boolean pagada;

    public void agregarLector(String lector) {
        this.lector = lector;
    }

    public void agregarMonto(double monto) {
        this.monto = monto;
    }

    public void agregarPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public String getLector() {
        return lector;
    }

    public double getMonto() {
        return monto;
    }

    public boolean getPagada() {
        return pagada;
    }

    public void mostrarMulta() {
        System.out.println("Lector: " + lector);
        System.out.println("Monto: " + monto);
        System.out.println("Pagada: " + pagada);
    }
}
