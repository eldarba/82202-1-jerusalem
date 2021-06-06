package ex06Loops;

public class Tar2B {
	/*
	 * Create a class that defines two random values and prints all values between
	 * them. note - which variable holds the higher value is not known.
	 */
	public static void main(String[] args) {

		int a = (int) (Math.random() * 51);
		int b = (int) (Math.random() * 51);

		System.out.println("a = " + a + " and b = " + b);

		int mekadem = 1;
		if (a > b) {
			mekadem = -1;
		}

		for (int i = a; i != b; i += mekadem) {
			System.out.print(i + ", ");
		}

		System.out.println(b);

		/*
		 * Create a class that defines a random number and prints all even numbers from
		 * 0 to that number
		 */
	}

}
