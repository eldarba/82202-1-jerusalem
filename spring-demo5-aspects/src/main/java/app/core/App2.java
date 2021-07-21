package app.core;

import javax.swing.JOptionPane;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.CalculatorBean;

public class App2 {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			try {
				CalculatorBean calc = ctx.getBean(CalculatorBean.class);
				int div = Integer.parseInt(JOptionPane.showInputDialog("enter divider"));
				String res = calc.div(100, div);
				System.out.println(res);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		System.out.println("END");

	}

}
