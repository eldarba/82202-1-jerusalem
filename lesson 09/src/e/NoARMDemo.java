package e;

import java.util.Scanner;

public class NoARMDemo {

	public static void main(String[] args) {

		// declaring a resource
		Scanner sc = null;
		try {
			// initialize the resource
			sc = new Scanner(System.in);

		} catch (Exception e) {

		} finally {
			// close the resource
			if (sc != null) {
				sc.close();
			}
		}

	}

}
