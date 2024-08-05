package Model;

import Entity.Student;

import java.util.ArrayList;

public interface CRUDStudent {
   // Decir como ordenar los metodos al usar
   public Student create(Student student);
   public Student readById(int id);
   public ArrayList<Student> readAll();
   public Student update(Student student, int id);
   public Boolean delete (int id);





}
