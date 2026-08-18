
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Categoria ca = new Categoria();
        ca.agregarTipo("Musical");
        ca.agregarDescripcion("Aprender teoría musical");
        ca.mostrarCategoria();

        Copia co = new Copia();
        co.agregarId("2007");
        co.agregarEstado("Nuevo");
        co.mostrarCopia();

        Libro li = new Libro();
        li.agregarCategoria("Musical");
        li.agregarEditorial("David Books");
        li.mostrarLibro();

        Editorial ed = new Editorial();
        ed.agregarNombre("David Books");
        ed.agregarDireccion("Transito Nagarote");
        ed.mostrarEditorial();

        Autor au = new Autor();
        au.agregarAtributo("Escritor");
        au.agregarNacionalidad("Nicaragüense");
        au.mostrarAutor();

        Nacionalidad na = new Nacionalidad();
        na.agregarPais("Nicaragua");
        na.agregarIdioma("Español");
        na.mostrarNacionalidad();

        PrestamoLibro pl = new PrestamoLibro();
        pl.setFechaInicio(new Date());
        pl.setFechaFin(new Date());
        pl.mostrarPrestamoLibro();

        Lector le = new Lector();
        le.agregarNombre("David");
        le.agregarApellidos("Cárcamo");
        le.agregarDni("20092007-1045-2025");
        le.agregarDireccion("Transito Nagarote");
        le.mostrarLector();

        Multa mu = new Multa();
        mu.agregarLector("David");
        mu.agregarMonto(200.50);
        mu.agregarPagada(true);
        mu.mostrarMulta();
    }
}
