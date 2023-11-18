public class Libroapp {
    public static void main(String[] args) {
        Libro libro1 = new Libro("1234567890", "Algebra Lineal", "Stanley", 764);
        Libro libro2 = new Libro("0987654321", "Calculo 1", "Jane Smith", 790);
        libro1.mostrar();
        libro2.mostrar();
        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println(libro1.getTitulo() + " tiene más páginas.");
        } else if (libro1.getNumPaginas() < libro2.getNumPaginas()) {
            System.out.println(libro2.getTitulo() + " tiene más páginas.");
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de páginas.");
        }
    }
}
