package Herencia;

public class Jefe extends Persona {

   private String Area_cargo;

   public Jefe() {
   }

   public Jefe(int id, int dni, String nombre, String apellido, String direccion, int telefono, String area_cargo) {
      super(id, dni, nombre, apellido, direccion, telefono);
      this.Area_cargo = area_cargo;
   }


   public String getArea_cargo() {
      return Area_cargo;
   }
   public void setArea_cargo(String area_cargo) {
      this.Area_cargo = area_cargo;
   }

   @Override
   public String toString() {
      return "Jefe{" +
              "Area_cargo='" + Area_cargo + '\'' +
              '}';
   }
}
