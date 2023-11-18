import java.util.Scanner;
public class raices {
public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("ingrese el coeficiente a: ");
        double a = lector.nextDouble();
        System.out.println("ingrese el coeficiente b: ");
        double b = lector.nextDouble();
        System.out.println("ingrese el coeficiente c: ");
        double c = lector.nextDouble();

        raices2 ecuacion = new raices2(a, b, c);
        ecuacion.calcular();

        lector.close();
    }
}
