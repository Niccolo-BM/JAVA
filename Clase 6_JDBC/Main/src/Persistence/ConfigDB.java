package Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDB {

   // Connection
   public static Connection connection = null;

   // Metodo de apertura
   public static Connection openConnection() {
      try {
         // Install Driver
         Class.forName("com.mysql.cj.jdbc.Driver");

         // Credenciales
         String URL = "jdbc:mysql://127.0.0.1:3306/JDBC";
         String user = "root";
         String password = "";

         // Establecer la conexion
         connection = DriverManager.getConnection(URL, user, password);
         System.out.println("Conexion establecida");



      } catch (SQLException e) {

         throw new RuntimeException(e);
      } catch (ClassNotFoundException e) {
         throw new RuntimeException(e);
      }

      return connection;
   }

   public static void main (String[] args){
      //ABRIR O CERRAR CONEXION CON LA DB
      ConfigDB.openConnection();
      //ConfigDB.closeConnection();
   }

   public static void closeConnection(){
      if(connection != null){
         try{
            connection.close();
            System.out.println("Connection Closed");
         }catch (SQLException e){
            throw new RuntimeException("ERROR: closing connection failed"+ e.getMessage());
         }
      }
   }


}
