package com.mamun.crud;

import com.mamun.crud.Entity.Student;
import com.mamun.crud.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepo studentRepo;
	@Override
	public void run(String... args) throws Exception {
//		Student student1=new Student(1,"Abdullah","Mamun","mdmamun@gmail.com");
//		this.studentRepo.save(student1);
//		Student student2=new Student(2,"Abdullah","Tahmid","mdmamun@gmail.com");
//		this.studentRepo.save(student2);
//		Student student3=new Student(3,"Arnab","Dey","mdmamun@gmail.com");
//		this.studentRepo.save(student3);
	}
}
