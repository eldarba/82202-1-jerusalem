package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.types.Person;

public class App2 {
	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);) {

//			ctx.getBean("p1", Person.class);
//			ctx.getBean("p1", Person.class);
//			ctx.getBean("p1", Person.class);
			Person p18 = ctx.getBean("p18", Person.class);
			System.out.println("end");

			System.out.println(ctx.getBean("getRandom"));
			System.out.println(ctx.getBean("getRandom"));
			System.out.println(ctx.getBean("getRandom"));
			System.out.println(ctx.getBean("getRandom"));
		}

	}
}
