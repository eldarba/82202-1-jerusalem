package a;

import java.util.Scanner;

public class FlowControl2 {

	public static void main(String[] args) {

		int password = 123;
		Scanner sc = new Scanner(System.in);

		System.out.print("enter password: ");
		int input = sc.nextInt();

		while (input != password) {
			System.out.print("enter password again: ");
			input = sc.nextInt();
		}

		System.out.println("you are logged in");
		sc.close();

	}

}
