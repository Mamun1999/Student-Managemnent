package com.mamun.crud.Service.Impl;

import com.mamun.crud.Entity.Student;
import com.mamun.crud.Repo.StudentRepo;
import com.mamun.crud.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Override
    public List<Student> getAllStudents() {
        return this.studentRepo.findAll();
    }

    @Override
    public Student createStudent(Student student) {
        return this.studentRepo.save(student);
    }

    @Override
    public Student getStudentById(int id) {
        return this.studentRepo.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public void deleteStudentById(int id) {
        this.studentRepo.deleteById(id);
    }
}
