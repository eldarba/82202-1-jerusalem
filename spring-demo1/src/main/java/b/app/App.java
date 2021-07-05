package b.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		// create a spring container
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");) {
			Object obj = ctx.getBean("thePerson");
			System.out.println(obj);
		}

	}

}
