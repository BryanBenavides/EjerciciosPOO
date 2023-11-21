package Sala_De_Cine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cine_Simulacion {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("NombrePelicula", 120, 12, "NombreDirector");
        Sala_Cine sala = new Sala_Cine(pelicula, 10.0, 8, 9);

        List<String> nombres = new ArrayList<>(List.of("Juan", "María", "Carlos", "Laura", "Pedro"));
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            int edad = rand.nextInt(18) + 10;
            double dinero = rand.nextDouble() * 20 + 5;

            int index = rand.nextInt(nombres.size());
            String nombre = nombres.get(index);
            nombres.remove(index);

            sala.asignarAsientoAleatorio(edad, dinero);
        }

        sala.mostrarEstadoAsientos(); // Mostrar el estado final de los asientos
    }
}
