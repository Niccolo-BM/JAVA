package Main.assest;

public class Estudiante {
    private String id;
    private String nombre;
    private String email;

    public Estudiante(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "id: " + id + ", nombre: " + nombre + ", email: " + email + '}';
    }
}
