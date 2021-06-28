package b.threads.tar3;

import java.util.Scanner;

public class GasStationApp {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("enter credit card number: ");
			String credit = sc.nextLine();
			// check if the credit card is valid
			CreditCheckThread checker = new CreditCheckThread(credit);
			checker.start();

			System.out.print("enter id: ");
			String id = sc.nextLine();

			System.out.print("enter car number: ");
			String carNumber = sc.nextLine();

			System.out.println("id: " + id);
			System.out.println("car number: " + carNumber);

			try {
				checker.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (checker.isValid()) {
				System.out.println("Good. start fueling");
			} else {
				System.out.println("Sorry, credit card invalid");
			}

		}

	}

}
