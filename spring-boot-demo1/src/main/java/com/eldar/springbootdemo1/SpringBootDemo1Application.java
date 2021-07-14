package com.eldar.springbootdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class SpringBootDemo1Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootDemo1Application.class, args);

		String[] beans = ctx.getBeanDefinitionNames();

		for (String b : beans) {
			System.out.println(b);
		}

		System.out.println(">>> context started");
		int x = ctx.getBean(Integer.class);
		int y = ctx.getBean(Integer.class);

		System.out.println(x);
		System.out.println(y);
		ctx.close();
		System.out.println(">>> context closed");
	}

	@Bean
	@Scope("prototype")
	public Integer randomNumber() {
		return (int) (Math.random() * 101);
	}

}
