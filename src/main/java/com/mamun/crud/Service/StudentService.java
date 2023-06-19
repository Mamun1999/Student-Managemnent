package com.mamun.crud.Service;

import com.mamun.crud.Entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student createStudent(Student student);

    Student getStudentById(int id);
    Student updateStudent(Student student);
    void deleteStudentById(int id);
}
