package dataBase;

import entity.student;

import java.awt.*;

public interface CRUD {
    public boolean createStudent(Object obj);

    public List<student> listActiveStudents();

    public boolean updateStudent(Object obj);

    public boolean deleteStudent(Object obj);

    public List<student> searchStudentById(String list, String search);
}
