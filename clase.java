import java.util.ArrayList;
import java.util.List;
import java.util.Random;
class Estudiante {
    private String nombre;
    private int edad;
    public char sexo;
    private double calificacion;

    public Estudiante(String nombre, int edad, char sexo, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.calificacion = calificacion;
    }

    public boolean estaDisponible() {
        Random random = new Random();
        return random.nextDouble() <= 0.5;
    }

    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre + ", Edad: " + edad + ", Sexo: " + sexo + ", Calificación: " + calificacion);
    }

    public double getCalificacion() {
        return calificacion;
    }
}

class Profesor {
    private String nombre;
    private int edad;
    public char sexo;
    private String asignatura;

    public Profesor(String nombre, int edad, char sexo, String asignatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.asignatura = asignatura;
    }

    public boolean estaDisponible() {
        Random random = new Random();
        return random.nextDouble() > 0.2;
    }

    public void mostrarInformacion() {
        System.out.println("Profesor: " + nombre + ", Edad: " + edad + ", Sexo: " + sexo + ", Asignatura: " + asignatura);
    }

    public String getAsignatura() {
        return asignatura;
    }
}

class Aula {
    private int id;
    private int capacidadMaxima;
    private String asignatura;
    private Profesor profesor;
    private List<Estudiante> estudiantes;

    public Aula(int id, int capacidadMaxima, String asignatura, Profesor profesor) {
        this.id = id;
        this.capacidadMaxima = capacidadMaxima;
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public boolean puedeDarseClase() {
        return profesor.estaDisponible() && profesor.getAsignatura().equals(asignatura) && (estudiantes.size() > capacidadMaxima / 2);
    }

    public void mostrarEstadoClase() {
        if (puedeDarseClase()) {
            System.out.println("Clase en el aula " + id + " puede ser impartida.");
            int aprobadosMujeres = 0;
            int aprobadosHombres = 0;

            for (Estudiante estudiante : estudiantes) {
                estudiante.mostrarInformacion();
                if (estudiante.getCalificacion() >= 5) {
                    if (estudiante.sexo == 'M') {
                        aprobadosHombres++;
                    } else if (estudiante.sexo == 'F') {
                        aprobadosMujeres++;
                    }
                }
            }

            System.out.println("Aprobados: " + aprobadosHombres + " hombres, " + aprobadosMujeres + " mujeres.");
        } else {
            System.out.println("No se puede dar clase en el aula " + id + " en este momento.");
        }
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
}