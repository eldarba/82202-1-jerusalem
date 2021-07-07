package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.types.hook.LifeCycleBean;

public class App5 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("app.core");) {
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("END");

	}

}
