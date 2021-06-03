package c.string;

public class Demo2 {

	public static void main(String[] args) {

		// random number 0 - 10 inclusive
		int a = (int) (Math.random() * 11);
		int b = (int) (Math.random() * 11);

		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
	}
}
