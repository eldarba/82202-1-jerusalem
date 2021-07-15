package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entities.Student;
import com.example.demo.entities.Student.Gender;
import com.example.demo.repositories.StudentRepository;

@SpringBootApplication
public class AppStutdents3 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AppStutdents3.class, args);

		StudentRepository repo = ctx.getBean(StudentRepository.class);

		List<Student> students = repo.findAll();
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("===============");
//

		List<Student> students1 = repo.findByGender(Gender.MALE);
		for (Student student : students1) {
			System.out.println(student);
		}
		System.out.println("===============");

	}

}
