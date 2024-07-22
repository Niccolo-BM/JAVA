package Main.src;

class Empleado extends Persona {
    private int idEmpleado;
    private double salario;

    public Empleado(String nombre, int edad, int idEmpleado, double salario) {
        super(nombre, edad);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    public void setid_empleado(int id_empleado) {
        this.idEmpleado = id_empleado;
    }

    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID Empleado: " + idEmpleado+ ", Salario: " + salario;
    }
}
