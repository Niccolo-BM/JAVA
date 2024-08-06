import controller.EstudianteController;
import dataBase.DatabaseConnection;
import entity.student;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DatabaseConnection.getConnection()) {
                    EstudianteController estudianteController = new EstudianteController(connection);
                    Scanner scanner = new Scanner(System.in);

                    while (true) {
                        System.out.println("1. crear estudiante");
                        System.out.println("2. ver estudiantes activos");
                        System.out.println("3. buscar estudiante por id");
                        System.out.println("4. actualizar estudiante");
                        System.out.println("5. eliminar estudiante");
                        System.out.println("6. salir");
                        int choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println("nombre:");
                                String name = scanner.next();
                                System.out.println("email:");
                                String email = scanner.next();
                                student Student = new student();
                                entity.student.setName(name);
                                entity.student.setEmail(email);
                                entity.student.setActive(true);
                                EstudianteController.createStudent(Student);
                                break;
                            case 2:
                                List<student> students = estudianteController.listActiveStudents();
                                student[] student = new student[0];
                                break;
                            case 3:
                                System.out.println("id del estudiante:");
                                int id = scanner.nextInt();
                                student e = estudianteController.searchStudentById(id);
                                if (e != null) {
                                    System.out.println(e.getId() + ": " + e.getName() + " - " + e.getEmail());
                                } else {
                                    System.out.println("Estudiante no encontrado");
                                }
                                break;
                            case 4:
                                System.out.println("ID del estudiante a actualizar:");
                                int updateId = scanner.nextInt();
                                student updateStudent = estudianteController.searchStudentById(updateId);
                                if (updateStudent != null) {
                                    System.out.println("nuevo nombre (actual: " + updateStudent.getName() + "): ");
                                    String newName = scanner.next();
                                    System.out.println("nuevo email (actual: " + updateStudent.getEmail() + "): ");
                                    String newEmail = scanner.next();
                                    EstudianteController.updateStudent(updateStudent);
                                } else {
                                    System.out.println("estudiante no encontrado");
                                }
                                break;
                            case 5:
                                System.out.println("id del estudiante que va a  eliminar: ");
                                int deleteId = scanner.nextInt();
                                estudianteController.deleteStudent(deleteId);
                                break;
                            case 6:
                                return;
                            default:
                                System.out.println("opcion invalida");
                                break;
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }


    }
}