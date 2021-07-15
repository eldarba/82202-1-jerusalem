package com.example.demo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entities.Person;
import com.example.demo.repositories.PersonRepository;

@SpringBootApplication
public class SpringBootJpa1Application2 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootJpa1Application2.class, args);

	}

}
