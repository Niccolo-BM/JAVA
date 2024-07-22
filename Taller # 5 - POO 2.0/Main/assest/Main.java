package Main.assest;

public class Main {
    public static void main(String[] args) {
        GestionCursos gestionCursos = new GestionCursos();

        Curso cursoJava = new Curso("Quinto A", "Matematicas");
        Curso cursoPython = new Curso("Octavo C", "Filosofia");

        gestionCursos.agregarCurso(cursoJava);
        gestionCursos.agregarCurso(cursoPython);

        Estudiante reo1 = new Estudiante("1", "Nicolas", "Nicolas@farts.eu");
        Estudiante reo2 = new Estudiante("2", "Catalina", "Catalina@farts.it");

        gestionCursos.inscribirEstudiantes("Octavo C", reo2);
        gestionCursos.inscribirEstudiantes("Quinto A", reo1);

        gestionCursos.estudiantesEnCurso("Octavo C");
    }
}