package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.CalculatorBean;

public class App3 {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			try {
				CalculatorBean calc = ctx.getBean(CalculatorBean.class);

				String res = calc.div(100, 3);
				System.out.println(res);

				res = calc.add(4, 5);
				System.out.println(res);

			} catch (Exception e) {
				System.out.println(e);
			}
		}

		System.out.println("END");

	}

}
