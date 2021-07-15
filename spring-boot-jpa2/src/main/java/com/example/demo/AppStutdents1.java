package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entities.Student;
import com.example.demo.entities.Student.Gender;
import com.example.demo.repositories.StudentRepository;

@SpringBootApplication
public class AppStutdents1 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AppStutdents1.class, args);

		StudentRepository repo = ctx.getBean(StudentRepository.class);

		Student s1 = repo.save(new Student(0, "AAA", "aaa@mail", Gender.MALE));
		Student s2 = repo.save(new Student(0, "BBB", "bbb@mail", Gender.FEMALE));
		Student s3 = repo.save(new Student(0, "CCC", "ccc@mail", Gender.MALE));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
