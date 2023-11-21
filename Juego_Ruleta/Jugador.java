package Juego_Ruleta;

class Jugador {
    private int id;
    private String nombre;
    private boolean vivo;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.vivo = true;
    }

    public void disparar(Revolver revolver) {
        System.out.println(this.nombre + " se apunta y se dispara.");
        if (revolver.disparar()) {
            this.vivo = false;
            System.out.println(this.nombre + " ha muerto.");
        } else {
            System.out.println(this.nombre + " sigue vivo.");
        }
    }

    public boolean estaVivo() {
        return this.vivo;
    }
}
