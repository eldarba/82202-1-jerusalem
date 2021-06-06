package ex06Loops;

public class Tar1 {
	/*
	 * Create a class that defines a random number and prints all numbers from 1 to
	 * that number
	 */
	public static void main(String[] args) {

		int top = (int) (Math.random() * 26);
		System.out.println("top = " + top);
		
		for (int i = 1; i <= top; i++) {
			System.out.print(i + ", ");
		}

	}

}
