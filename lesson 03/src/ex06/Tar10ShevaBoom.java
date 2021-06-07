package ex06;

import java.util.Scanner;

public class Tar10ShevaBoom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter limit: ");
		int top = sc.nextInt();
		sc.close();

		lbl: for (int i = 1; i <= top; i++) {
			// find numbers that divide by 7
			if (i % 7 == 0) {
				System.out.println("Boom");
				continue;
			}
			// find numbers that contains 7
			int x = i;
			while (x != 0) {
				if (x % 10 == 7) {
					System.out.println("Boom");
					continue lbl;
				}
				x = x / 10;
			}
			// if 7 not found - print the number
			System.out.println(i);
		}

	}

}
