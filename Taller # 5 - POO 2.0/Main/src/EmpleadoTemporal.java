package Main.src;

class EmpleadoTemporal extends Empleado {
    private int duracionContrato;

    public EmpleadoTemporal(String nombre, int edad, int idEmpleado, double salario, int duracionContrato) {
        super(nombre, edad, idEmpleado, salario);
        this.duracionContrato = duracionContrato;
    }

    public int getDuracionContrato() {
        return this.duracionContrato;
    }
    public void setDuracionContrato(int duracionContrato) {
        this.duracionContrato = duracionContrato;
    }

    @Override
    public String toString() {
        return super.toString() + ", Duracionn del contrato: " + duracionContrato + " meses";
    }
}
