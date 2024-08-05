package Herencia;

public class Persona {

   private int id;
   private  int dni;
   private String nombre;
   private String apellido;
   private String direccion;
   private int telefono;

    public Persona(){
        }
    public Persona (int id, int dni, String nombre, String apellido, String direccion, int telefono){
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public int getDni(){
        return this.dni;
    }
    public void setSDni(int dni){
        this.dni = dni;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getDireccion(){
        return this.direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public int getTelefono(){
        return this.telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }



















}
