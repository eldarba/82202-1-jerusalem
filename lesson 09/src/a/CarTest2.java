package a;

import java.util.Arrays;
import java.util.Scanner;

public class CarTest2 {

	public static void main(String[] args) {

		System.out.println("choos car color " + Arrays.toString(Color.values()));

		Scanner sc = new Scanner(System.in);
		Color color = Color.valueOf(sc.nextLine());
		System.out.println(color);

		sc.close();

		Car c = new Car(111, color);
		System.out.println(c);

	}

}
