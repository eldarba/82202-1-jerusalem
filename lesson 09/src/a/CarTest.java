package a;

import java.util.Arrays;

public class CarTest {

	public static void main(String[] args) {

		Car c1 = new Car(111, Color.WHITE);
		Car c2 = new Car(222, Color.BLACK);

		System.out.println(c1);
		System.out.println(c2);

		// get an array of all enum constants
		Color[] colors = Color.values();
		System.out.println(Arrays.toString(colors));

		// use valueOf to convert a String to enum type
		// get a single enum constant from a String
		String str = "BLACK";
		Color color = Color.valueOf(str);
		System.out.println(color);

		c1.setColor(color);

	}

}
