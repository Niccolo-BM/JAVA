package Main.src;

class EmpleadoPermanente extends Empleado {
    private String departamento;

    public EmpleadoPermanente(String nombre, int edad, int idEmpleado, double salario, String departamento) {
        super(nombre, edad, idEmpleado, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departamento: " + departamento;
    }
}
