package Herencia;

public class Consultor extends Persona {

    private String cod_consultor;

    public Consultor() {
    }
    public Consultor(int id, int dni, String nombre, String apellido, String direccion, int telefono, String cod_consultor) {
        super(id, dni, nombre, apellido, direccion, telefono);
        this.cod_consultor = cod_consultor;
    }

    public String getCod_consultor() {
        return cod_consultor;
    }

    public void setCod_consultor(String cod_consultor) {
        this.cod_consultor = cod_consultor;
    }
}
