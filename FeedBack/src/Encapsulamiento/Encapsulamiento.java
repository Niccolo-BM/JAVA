package Encapsulamiento;

public class Encapsulamiento {

   public static void mainEncapsulamiento(){
       Alumno alum = new Alumno();
       Alumno alum1 = new Alumno (3, "Juan", "Cardenas");

      System.out.println("id: " + alum1.getId()+ " " + "nombre: "+ alum1.getNombre()+ " " + "apellido: " + alum1.getApellido() );
   }
}
