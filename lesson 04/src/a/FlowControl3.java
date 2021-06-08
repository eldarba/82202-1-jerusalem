package a;

import java.util.Scanner;

public class FlowControl3 {

	public static void main(String[] args) {

		int password = 123;
		Scanner sc = new Scanner(System.in);

		int input = 0;

		do {
			System.out.print("enter password: ");
			input = sc.nextInt();
		} while (input != password);

		System.out.println("you are logged in");
		sc.close();

	}

}
