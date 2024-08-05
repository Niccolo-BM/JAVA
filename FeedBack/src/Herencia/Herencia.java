package Herencia;

public class Herencia {
    public void mainHerencia() {

        Empleado emple = new Empleado();
        emple.getCargo();
        emple.getNombre();

        Consultor consul = new Consultor();
        consul.getCod_consultor();
        consul.getNombre();

        System.out.println("HOla");
    }




    public static void main (String[] args){
        Persona vector[] = new Persona [5];
        vector [0] = new Persona();
        vector [1] = new Empleado();
        vector [2] = new Consultor();
        vector [3] = new Jefe();

        Persona perso = new Persona();
        Consultor consul = new Consultor();

        perso = consul;
    }
}
