package Herencia;

public class Empleado extends Persona {

    private   String cargo;
    private  Double sueldo;

    public Empleado(){
    }
    public Empleado(int id, int dni, String nombre, String apellido,
                    String direccion, int telefono,
                    String cargo, Double sueldo) {
        super(id, dni, nombre, apellido, direccion, telefono);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    public Empleado(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }
    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
