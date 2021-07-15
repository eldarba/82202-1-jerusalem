package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entities.Student;
import com.example.demo.repositories.StudentRepository;

@SpringBootApplication
public class AppStutdents2 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AppStutdents2.class, args);

		StudentRepository repo = ctx.getBean(StudentRepository.class);

//		List<Student> students = repo.findAll();
//		for (Student student : students) {
//			System.out.println(student);
//		}
//		System.out.println("===============");
//
//		List<Student> studentsMale = repo.getMales();
//		for (Student student : studentsMale) {
//			System.out.println(student);
//		}
//		System.out.println("===============");
//
//		List<Student> studentsFemale = repo.getFemales();
//		for (Student student : studentsFemale) {
//			System.out.println(student);
//		}
//		System.out.println("===============");

		List<Student> studentsAge = repo.getOlderThan(23);
		for (Student student : studentsAge) {
			System.out.println(student);
		}
		System.out.println("===============");

	}

}
