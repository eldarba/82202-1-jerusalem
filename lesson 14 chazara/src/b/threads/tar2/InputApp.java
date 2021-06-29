package b.threads.tar2;

import java.util.Scanner;

public class InputApp {

	public static void main(String[] args) {

		NudgerThread nudger = new NudgerThread();
		nudger.setDaemon(true);
		nudger.start();

		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("Enter your name: ");
			String name = sc.nextLine();
			System.out.println("Hello " + name);
		}

	}

}
