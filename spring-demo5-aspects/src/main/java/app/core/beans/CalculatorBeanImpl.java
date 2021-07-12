package app.core.beans;

import org.springframework.stereotype.Component;

import app.core.annotations.MyLogAnnotation;

@Component
public class CalculatorBeanImpl implements CalculatorBean {

	@Override
	public String div(int a, int b) throws RuntimeException {
		return a + " / " + b + " = " + (a / b) + " [rem: " + (a % b) + "]";
	}

	@Override
	@MyLogAnnotation
	public String add(int a, int b) throws RuntimeException {
		return a + " + " + b + " = " + (a + b);
	}

}
