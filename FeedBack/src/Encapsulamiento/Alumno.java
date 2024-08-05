package Encapsulamiento;

public class Alumno {

    private int id;
    private String nombre;
    private String apellido;

    /*public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/

    //CONSTRUCTORES
    public Alumno(){

    }

    public Alumno (int id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    // GETTER (OBTEBER) & SETTER (DAR o  MODIFICAR)

    public int getId() {

        return id;
    }

    public String getNombre() {

        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    //



    public void mostrarNombre(){
        System.out.println("Buena la loca");
    }

    public void saberAprobado(double calificacion){
        if(calificacion >= 6){
            System.out.println("Aprobe");
        }else{
            System.out.println("mero bruto");
        }
    }


}
