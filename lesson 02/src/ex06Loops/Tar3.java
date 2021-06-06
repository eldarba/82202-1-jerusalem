package ex06Loops;

public class Tar3 {

	public static void main(String[] args) {
		/*
		 * Create a class that defines a random number and prints all even numbers from
		 * 0 to that number
		 */

		int top = (int) (Math.random() * 26);
		System.out.println("top is: " + top);

		for (int i = 0; i <= top; i += 2) {
			System.out.print(i + ", ");
		}

	}

}
