package a.arrays;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {

		String[] names = new String[5];

		Scanner sc = new Scanner(System.in);
		System.out.print("enter name: ");
		names[0] = sc.nextLine();
		System.out.print("enter name: ");
		names[1] = sc.nextLine();
		System.out.print("enter name: ");
		names[2] = sc.nextLine();
		System.out.print("enter name: ");
		names[3] = sc.nextLine();
		System.out.print("enter name: ");
		names[4] = sc.nextLine();
		sc.close();

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
