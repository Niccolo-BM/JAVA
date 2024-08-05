import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EjemploJDBC {
    public static void  main(String[] args){

        String url = "";
        String usuario ="";
        String contraseña = "";

        try {
            //Establecer la conxion
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            //Crear un Statement
            Statement sentencia = conexion.createStatement();

            // Ejecutar una consulta
            ResultSet resultado = sentencia.executeQuery("SELECT * FROM TuTabla");

            //Procesar el ResultTest
             while (resultado.next()){
                System.out.println(resultado.getString("nombreColumba"));
            }
                // Cerrar conexiones
                resultado.close();
                sentencia.close();
                conexion.close();


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
