package Main.assest;
import java.util.ArrayList;

public class GestionCursos {
    private ArrayList<Curso> listaCursos;

    public GestionCursos() {
        this.listaCursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        listaCursos.add(curso);
    }

    public void inscribirEstudiantes(String codigoCurso, Estudiante estudiante) {
        for (Curso curso : listaCursos) {
            if (curso.getCodigo().equals(codigoCurso)) {
                curso.inscribirEstudiante(estudiante);
                return;
            }
        }
        System.out.println("Curso: " + codigoCurso + " no existe");
    }

    public void estudiantesEnCurso(String codigoCurso) {
        for (Curso curso : listaCursos) {
            if (curso.getCodigo().equals(codigoCurso)) {
                System.out.println("Estudiantes inscritos en el curso " + curso.getNombre() + ":");
                for (Estudiante estudiante : curso.getListaEstudiantes()) {
                    System.out.println(estudiante);
                }
                return;
            }
        }
        System.out.println("Curso: " + codigoCurso + " no encontrado.");
    }
}
