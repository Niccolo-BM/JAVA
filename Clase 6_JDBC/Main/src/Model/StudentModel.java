package Model;

import Entity.Student;
import Persistence.ConfigDB;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentModel implements CRUDGeneric {


   @Override
   public Object create(Object object) {
      // Open connection
      Connection connection = ConfigDB.openConnection();

     // Transfornar Objeto  O CASTEAR
      Student student = (Student) object;

      try {
         // create SQL query
         String sqlQuery = "INSERT INTO students(name,age) value (?,?);";

         // Create prepared Statement --- Crear declaración preparada // CONBINAR CON LA DB
         PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery,PreparedStatement.RETURN_GENERATED_KEYS);

         // Assign to ?
         preparedStatement.setString(1, student.getName());
         preparedStatement.setInt(2, student.getAge());

         //Ejecutar Query
         preparedStatement.execute();

         // Obtener resultado
         ResultSet result = preparedStatement.getGeneratedKeys();

         result.next();


         student.setId(result.getInt(1));

         preparedStatement.close();

         // mensaje en ventana emergente
         JOptionPane.showConfirmDialog(null, "Estudiante creado exitosamente");


      } catch (SQLException e) {
         System.out.println(e.getMessage());
         throw new RuntimeException(e);
      }

      ConfigDB.closeConnection();
      return student;
   }



   @Override
   public Object readById(int id) {
      return null;
   }

   @Override
   public ArrayList<Student> readAll() {
      return null;
   }

   @Override
   public Object update(Object object, int id) {
      return null;
   }

   @Override
   public Boolean delete(int id) {
      return null;
   }
}
