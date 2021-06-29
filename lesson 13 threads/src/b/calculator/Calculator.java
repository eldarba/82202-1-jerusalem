package b.calculator;

public class Calculator {

	private double currentResult;

	public void add(double value) {
		this.currentResult += value;
	}

	public void sub(double value) {
		this.currentResult -= value;
	}

	public void mul(double value) {
		this.currentResult *= value;
	}

	public void div(double value) {
		this.currentResult /= value;
	}

	public double getCurrentResult() {
		return currentResult;
	}

	public void reset() {
		this.currentResult = 0;
	}

}
