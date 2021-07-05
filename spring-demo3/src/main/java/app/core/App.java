package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.types.Person;

public class App {
	public static void main(String[] args) {

		// create a spring container
//		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("app.core");) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);) {
//			Object obj = ctx.getBean("p1");
			Person p1 = ctx.getBean("p1", Person.class);
			p1.setId(101);
//			Person person = ctx.getBean(Person.class);
			System.out.println(p1);

			Person p18 = ctx.getBean("p18", Person.class);
			System.out.println(p18);

			p18.setAge(25);
			System.out.println(p18);
		}

	}
}
