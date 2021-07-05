package app.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import app.core.types.Person;

public class App {

	public static void main(String[] args) {

		// create a spring container
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");) {
//			Object obj = ctx.getBean("p1");
			Person p1 = ctx.getBean("p1", Person.class);
			Person p2 = ctx.getBean("p2", Person.class);
			Person p3 = ctx.getBean("p3", Person.class);
			p1.setId(101);
			p2.setId(102);
			p3.setId(103);
//			Person person = ctx.getBean(Person.class);
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
		}

	}

}
