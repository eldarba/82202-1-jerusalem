package a;

public class LambdaDemo1 {

	public static void main(String[] args) {
		// create an implementing object of the functional interface using lambda
		// expression
		SumFunctionalInterface x = (a, b) -> a + b;

		// use the implementing object
		int sum = x.sum(100, 300);
		System.out.println(sum);

		m1(x, 4, 5);
		m1((n1, n2) -> n1 + n2, 4, 5);

	}

	// define a method that gets a function as a parameter
	public static void m1(SumFunctionalInterface s, int a, int b) {
		System.out.println(a + " + " + b + " = " + s.sum(a, b));
	}

}
