package b.calculator;

public class Test {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.getCurrentResult());
		calculator.add(5);
		calculator.add(3);
		System.out.println(calculator.getCurrentResult());
		calculator.mul(2);
		System.out.println(calculator.getCurrentResult());
		calculator.reset();
		System.out.println(calculator.getCurrentResult());

	}

}
