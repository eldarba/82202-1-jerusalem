package com.example.demo;

import java.time.LocalDate;

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

//		Student s1 = repo
//				.save(new Student(0, "AAA", 33, "aaa@mail", Gender.MALE, LocalDate.of(1995, 5, 1), true, null));
//		Student s2 = repo
//				.save(new Student(0, "BBB", 22, "bbb@mail", Gender.FEMALE, LocalDate.of(2000, 5, 1), true, null));
//		Student s3 = repo
//				.save(new Student(0, "CCC", 55, "ccc@mail", Gender.MALE, LocalDate.of(2021, 5, 1), true, null));
//		Student s4 = repo
//				.save(new Student(0, "DDD", 65, "ddd@mail", Gender.MALE, LocalDate.of(2015, 5, 1), true, null));
//		Student s5 = repo
//				.save(new Student(0, "EEE", 43, "eee@mail", Gender.FEMALE, LocalDate.of(2011, 5, 1), true, null));
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s5);

	}

}
