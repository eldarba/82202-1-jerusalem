package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.types.Vehicle;

public class App3 {
	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);) {

			// get a vehicle from spring context and call drive method
			Vehicle v1 = ctx.getBean(Vehicle.class);
			v1.drive();

		}

	}
}
