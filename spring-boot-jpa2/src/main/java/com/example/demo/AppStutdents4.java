package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entities.Student;
import com.example.demo.entities.Student.Gender;
import com.example.demo.entities.University;
import com.example.demo.services.AdminService;

@SpringBootApplication
public class AppStutdents4 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AppStutdents4.class, args);
		AdminService adminService = ctx.getBean(AdminService.class);

		University barIlan = new University(0, "Bar Ilan", "Israel");
		barIlan.addStudent(new Student(0, "Dani", 33, "dani@mail", Gender.MALE, LocalDate.of(2020, 5, 1), true));
		barIlan.addStudent(new Student(0, "Rina", 33, "rina@mail", Gender.FEMALE, LocalDate.of(2020, 5, 1), true));
		barIlan.addStudent(new Student(0, "Ron", 33, "ron@mail", Gender.MALE, LocalDate.of(2020, 5, 1), true));

		University ariel = new University(0, "Ariel", "Israel");
		ariel.addStudent(new Student(0, "Ann", 33, "ann@mail", Gender.FEMALE, LocalDate.of(2020, 5, 1), true));
		ariel.addStudent(new Student(0, "John", 33, "john@mail", Gender.MALE, LocalDate.of(2020, 5, 1), true));
		ariel.addStudent(new Student(0, "Mark", 33, "mark@mail", Gender.MALE, LocalDate.of(2020, 5, 1), true));

		adminService.addUniversity(ariel);
		adminService.addUniversity(barIlan);

		System.out.println("===============");

	}

}
