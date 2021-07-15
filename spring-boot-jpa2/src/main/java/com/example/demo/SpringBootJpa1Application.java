package com.example.demo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entities.Person;
import com.example.demo.repositories.PersonRepository;

@SpringBootApplication
public class SpringBootJpa1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootJpa1Application.class, args);

		// get the DAO from Spring container
		PersonRepository repo = ctx.getBean(PersonRepository.class);

//		repo.save(new Person(0, "AAA", 32));\

//		long count = repo.count();
//		System.out.println("person count = " + count);

//		System.out.println(repo.findAll());

		int id = 2;
		Optional<Person> opt = repo.findById(id);
		if (opt.isPresent()) {
			Person p = opt.get();
			System.out.println(p);
		} else {
			System.out.println("NOT found ");
		}

	}

}
