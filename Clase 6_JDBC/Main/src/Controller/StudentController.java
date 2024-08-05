package Controller;

import Entity.Student;
import Model.StudentModel;

import javax.swing.*;

public class StudentController {

   // Modelo atributo
   StudentModel objStudientModel;

   public StudentController(){
      //crear la instancia del modelo studiante
      this.objStudientModel =  new StudentModel();
   }

   public void create (){
      //crear instacia del estudiante
      //Student objStudent = new Student();

      //input of name O INGRESAR UN DATO
      String name = JOptionPane.showInputDialog("Ingrese un nombre");

      //input age O INGRESAR UN DATO
      int age = Integer.parseInt(JOptionPane.showInputDialog("inserte edad"));

      Student objStudent = new Student(name, age);

      this.objStudientModel.create(objStudent);

   }






}
