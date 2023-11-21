package Juego_Ruleta;

import java.util.Scanner;

public class RuletaRusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de jugadores (entre 1 y 6): ");
        int numJugadores = scanner.nextInt();

        Juego juego = new Juego(numJugadores);

        while (!juego.finJuego()) {
            juego.ronda();
        }

        scanner.close();
    }
}
