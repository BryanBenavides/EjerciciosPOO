package Sala_De_Cine;

class Asiento {
    private String etiqueta;
    private boolean ocupado;

    public Asiento(String etiqueta) {
        this.etiqueta = etiqueta;
        this.ocupado = false;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void ocuparAsiento() {
        this.ocupado = true;
    }

    public void desocuparAsiento() {
        this.ocupado = false;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    @Override
    public String toString() {
        return etiqueta + (ocupado ? " (Ocupado)" : " (Libre)");
    }
}