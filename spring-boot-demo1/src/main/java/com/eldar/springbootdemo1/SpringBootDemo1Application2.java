package com.eldar.springbootdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.eldar.springbootdemo1.beans.Point;

@SpringBootApplication
public class SpringBootDemo1Application2 {

	public static void main(String[] args) {

		try (ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootDemo1Application2.class, args);) {
			Point p1 = ctx.getBean(Point.class);
			Point p2 = ctx.getBean(Point.class);
			p1.setX(25);
			p1.setY(33);
			p2.setX(25);
			p2.setY(36);
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p1.equals(p2));
		}

	}

}
