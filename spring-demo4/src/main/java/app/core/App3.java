package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.types.Car;
import app.core.types.store.Store;

public class App3 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("app.core")) {
			Store store = ctx.getBean(Store.class);
			System.out.println(store);
		}

	}

}
