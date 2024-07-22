package Main.src;
import java.util.ArrayList;

class GestionEmpleados {
    private ArrayList<Empleado> empleados;

    public GestionEmpleados() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void verEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("Apenas si eres un emprendedor.");
        } else {
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }

    }
    public void quitarEmpleado(int idEmpleado) {
        empleados.removeIf(empleado -> empleado.getIdEmpleado() == idEmpleado);
    }
}
