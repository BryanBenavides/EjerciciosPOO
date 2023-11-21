package Juego_Ruleta;

import java.util.ArrayList;

class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego(int numJugadores) {
        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6; // Por defecto, si no está en el rango permitido.
        }

        this.jugadores = new ArrayList<>();
        for (int i = 1; i <= numJugadores; i++) {
            this.jugadores.add(new Jugador(i));
        }

        this.revolver = new Revolver();
    }

    public boolean finJuego() {
        for (Jugador jugador : this.jugadores) {
            if (!jugador.estaVivo()) {
                return true;
            }
        }
        return false;
    }

    public void ronda() {
        for (Jugador jugador : this.jugadores) {
            if (jugador.estaVivo()) {
                jugador.disparar(this.revolver);
                if (this.finJuego()) {
                    System.out.println("El juego ha terminado.");
                    return;
                }
                this.revolver.siguienteBala();
            }
        }
    }
}
