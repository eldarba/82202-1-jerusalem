package b.arrays.dimensions;

import java.util.Scanner;

public class Demo2Cinema {

	public static void main(String[] args) {

		int rows = 3;
		int seats = 6;

		char[][] cinema = new char[rows][seats];
		// populate with O characters
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema[i].length; j++) {
				cinema[i][j] = 'O';
			}
		}

		// print the cinema
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema[i].length; j++) {
				System.out.print(" " + cinema[i][j] + " ");
			}
			System.out.println();
		}

		// get input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("enter row: ");
		int row = sc.nextInt() - 1;
		System.out.print("enter seat: ");
		int seat = sc.nextInt() - 1;
		sc.close();

		cinema[row][seat] = 'X';

		// print the cinema
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema[i].length; j++) {
				System.out.print(" " + cinema[i][j] + " ");
			}
			System.out.println();
		}
	}

}
