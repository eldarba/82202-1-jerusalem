package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.types.Car;

public class App2 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("app.core")) {
			Car car = ctx.getBean(Car.class);
			car.drive();
		}

	}

}
