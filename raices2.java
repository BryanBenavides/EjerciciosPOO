public class raices2 {
    private double a;
    private double b;
    private double c;

    // Constructor
    public raices2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método para calcular el discriminante
    private double calcularDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    // Método para obtener las raíces
    public void obtenerRaices() {
        double discriminante = calcularDiscriminante();
        if (tieneRaices(discriminante)) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Raíces reales: " + raiz1 + " y " + raiz2);
        } else {
            System.out.println("No existen raíces reales.");
        }
    }

    // Método para obtener una única raíz
    public void obtenerRaiz() {
        double discriminante = calcularDiscriminante();
        if (tieneRaiz(discriminante)) {
            double raiz = -b / (2 * a);
            System.out.println("Raíz única: " + raiz);
        } else {
            System.out.println("No existe una única raíz real.");
        }
    }

    // Método para mostrar el discriminante
    public double mostrarDiscriminante() {
        return calcularDiscriminante();
    }

    // Método para verificar si hay dos raíces
    public boolean tieneRaices(double discriminante) {
        return discriminante > 0;
    }

    // Método para verificar si hay una única raíz
    public boolean tieneRaiz(double discriminante) {
        return discriminante == 0;
    }

    // Método principal para calcular e imprimir las soluciones
    public void calcular() {
        double discriminante = mostrarDiscriminante();
        if (tieneRaices(discriminante)) {
            obtenerRaices();
        } else if (tieneRaiz(discriminante)) {
            obtenerRaiz();
        } else {
            System.out.println("No existen raíces reales.");
        }
    }
}
    