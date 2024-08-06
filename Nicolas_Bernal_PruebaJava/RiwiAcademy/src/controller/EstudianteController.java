package controller;

import entity.student;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteController {
    private static Connection connection;

    public EstudianteController(Connection connection) {
        this.connection = connection;
    }

    public static void createStudent(student student) {
        String name = JOptionPane.showInputDialog("Enter name's coder: ");
        String email = JOptionPane.showInputDialog("Enter last name's coder: ");

    }

    public List<student> listActiveStudents() throws SQLException {
        String query = "SELECT * FROM Estudiantes WHERE activo = TRUE";
        List<student> estudiantes = new ArrayList<>();
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                student students = new student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("nombre"));
                student.setEmail(rs.getString("email"));
                student.setActive(rs.getBoolean("activo"));
                estudiantes.add(students);
            }
        }
        return estudiantes;
    }

    public student searchStudentById(int id) throws SQLException {
        String query = "SELECT * FROM Estudiantes WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    student student = new student();
                    entity.student.setId(rs.getInt("id"));
                    entity.student.setName(rs.getString("nombre"));
                    entity.student.setEmail(rs.getString("email"));
                    entity.student.setActive(rs.getBoolean("activo"));
                    return student;
                }
            }
        }
        return null;
    }

    public static void updateStudent(student student) throws SQLException {
        String query = "UPDATE Estudiantes SET nombre = ?, email = ?, activo = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, student.getName());
            stmt.setString(2, student.getEmail());
            stmt.setBoolean(3, student.isActive());
            stmt.setInt(4, student.getId());
            stmt.executeUpdate();
        }
    }

    public void deleteStudent(int id) throws SQLException {
        String query = "DELETE FROM Estudiantes WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}