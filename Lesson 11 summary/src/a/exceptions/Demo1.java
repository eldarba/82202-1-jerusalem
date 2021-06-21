package a.exceptions;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		int a, b;
		try (Scanner sc = new Scanner(System.in);) {

			while (true) {
				System.out.print("enter first number: ");
				try {
					a = Integer.parseInt(sc.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("wrong inpunt: " + e.getMessage() + ". try again");
				}
			}

			while (true) {
				System.out.print("enter second number: ");
				try {
					b = Integer.parseInt(sc.nextLine());
					break;
				} catch (NumberFormatException e) {
//					e.printStackTrace(System.out); // stack trace to standard output
//					e.printStackTrace(System.err); // stack trace to error stream
					System.out.println("wrong inpunt: " + e.getMessage() + ". try again");
				}
			}

			int sum = a + b;
			System.out.println(a + " + " + b + " = " + sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
