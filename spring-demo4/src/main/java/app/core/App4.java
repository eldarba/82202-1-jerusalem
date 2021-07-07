package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.types.hook.LifeCycleBean;

public class App4 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("app.core");) {

			LifeCycleBean bean = ctx.getBean(LifeCycleBean.class);
			bean.work();
			bean.work();
			bean.work();

		}

		System.out.println("END");

	}

}
