package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class SpringBootDemo2Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootDemo2Application.class, args);
		Point p1 = ctx.getBean(Point.class);
		Point p2 = ctx.getBean(Point.class);

		System.out.println(p1);
		System.out.println(p2);

	}

	@Bean
	@Scope("prototype")
	public Integer random() {
		return (int) (Math.random() * 101);
	}

}
