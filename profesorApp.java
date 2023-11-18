public class profesorApp {
    public static void main(String[] args) {
        Profesor profesorProgramacion = new Profesor("ProfesorProgramacion", 40, 'M', "Introducción a la Programación");
        Profesor profesorSoftware = new Profesor("ProfesorSoftware", 45, 'F', "Ingeniería de Software");
        Profesor profesorRedes = new Profesor("ProfesorRedes", 38, 'M', "Sistemas Operativos de Redes");
        Aula aulaProgramacion = new Aula(1, 20, "Introducción a la Programación", profesorProgramacion);
        Aula aulaSoftware = new Aula(2, 25, "Ingeniería de Software", profesorSoftware);
        Aula aulaRedes = new Aula(3, 30, "Sistemas Operativos de Redes", profesorRedes);
        for (int i = 0; i < 25; i++) {
            char sexo = (i % 2 == 0) ? 'M' : 'F';
            Estudiante estudiante = new Estudiante("Estudiante" + (i + 1), 20 + i, sexo, Math.random() * 10);
            aulaProgramacion.agregarEstudiante(estudiante);
        }
        for (int i = 0; i < 30; i++) {
            char sexo = (i % 2 == 0) ? 'M' : 'F';
            Estudiante estudiante = new Estudiante("Estudiante" + (i + 1), 22 + i, sexo, Math.random() * 10);
            aulaSoftware.agregarEstudiante(estudiante);
        }
        for (int i = 0; i < 35; i++) {
            char sexo = (i % 2 == 0) ? 'M' : 'F';
            Estudiante estudiante = new Estudiante("Estudiante" + (i + 1), 25 + i, sexo, Math.random() * 10);
            aulaRedes.agregarEstudiante(estudiante);
        }
        aulaProgramacion.mostrarEstadoClase();
        System.out.println("-----------------------------");
        aulaSoftware.mostrarEstadoClase();
        System.out.println("-----------------------------");
        aulaRedes.mostrarEstadoClase();
    }
}
