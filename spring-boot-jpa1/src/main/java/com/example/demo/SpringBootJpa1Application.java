package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.Person;
import com.example.demo.repositories.PersonDao;

@SpringBootApplication
public class SpringBootJpa1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootJpa1Application.class, args);

		// get the DAO from Spring container
		PersonDao personDao = ctx.getBean(PersonDao.class);

		// use the DAO:

//		{ // insert
//			Person p = new Person(0, "Ron", 29);
//			personDao.save(p);
//			System.out.println(p);
//		}

//		{ // find
//			Person p = personDao.find(244);
//			System.out.println(p);
//		}

//		{ // update
//			Person p = new Person(4, "Rina Levi", 20);
//			personDao.update(p);
//		}

//		{ // delete
//			boolean isDeleted = personDao.delete(3);
//			System.out.println(">>> is deleted: " + isDeleted);
//		}

		{ // find all
			List<Person> persons = personDao.findAll();
			System.out.println(persons);
		}

	}

}
