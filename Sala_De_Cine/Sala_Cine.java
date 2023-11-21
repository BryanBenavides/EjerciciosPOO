package Sala_De_Cine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Sala_Cine {
    private Pelicula pelicula;
    private double precioEntrada;
    private Asiento[][] asientos;

    public Sala_Cine(Pelicula pelicula, double precioEntrada, int filas, int columnas) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.asientos = new Asiento[filas][columnas];
        inicializarAsientos(filas, columnas);
    }

    private void inicializarAsientos(int filas, int columnas) {
        char letra = 'A';
        for (int i = filas - 1; i >= 0; i--) {
            for (int j = 0; j < columnas; j++) {
                String etiqueta = (i + 1) + String.valueOf((char) (letra + j));
                asientos[i][j] = new Asiento(etiqueta);
            }
        }
    }

    public boolean asignarAsiento(int fila, int columna, int edad, double dinero) {
        if (fila < 1 || fila > asientos.length || columna < 1 || columna > asientos[0].length) {
            System.out.println("Asiento inválido.");
            return false;
        }

        Asiento asiento = asientos[asientos.length - fila][columna - 1];

        if (asiento.isOcupado()) {
            System.out.println("El asiento está ocupado. Buscando otro asiento disponible...");
            return false;
        }

        if (edad < pelicula.getEdadMinima()) {
            System.out.println("El espectador es muy joven para esta película.");
            return false;
        }

        if (dinero < precioEntrada) {
            System.out.println("El espectador no tiene suficiente dinero para la entrada.");
            return false;
        }

        asiento.ocuparAsiento();
        System.out.println("Asiento asignado: " + asiento.getEtiqueta());
        return true;
    }

    public boolean asignarAsientoAleatorio(int edad, double dinero) {
        Random rand = new Random();
        int fila, columna;

        do {
            fila = rand.nextInt(asientos.length) + 1;
            columna = rand.nextInt(asientos[0].length) + 1;
        } while (!asignarAsiento(fila, columna, edad, dinero));

        return true;
    }

    public void mostrarEstadoAsientos() {
        System.out.println("Estado de los asientos:");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                System.out.print(asientos[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
