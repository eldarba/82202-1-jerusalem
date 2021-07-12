package app.core.beans;

import org.springframework.stereotype.Component;

import app.core.annotations.MyLogAnnotation;

@Component
public class CalculatorBeanImpl implements CalculatorBean {

	@MyLogAnnotation(printMethodName = false, args = { "aaa", "bbb", "ccc" })
	@Override
	public String div(int a, int b) throws RuntimeException {
		return a + " / " + b + " = " + (a / b) + " [rem: " + (a % b) + "]";
	}

	@MyLogAnnotation(key = "this is the add method", printMethodName = true)
	@Override
	public String add(int a, int b) throws RuntimeException {
		return a + " + " + b + " = " + (a + b);
	}

}
