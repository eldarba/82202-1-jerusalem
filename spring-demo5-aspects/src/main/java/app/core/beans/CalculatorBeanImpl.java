package app.core.beans;

import org.springframework.stereotype.Component;

@Component
public class CalculatorBeanImpl implements CalculatorBean {

	@Override
	public String div(int a, int b) throws RuntimeException {
		return a + " / " + b + " = " + (a / b) + " [rem: " + (a % b) + "]";
	}

}
