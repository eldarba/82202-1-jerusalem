package b;

import a.Car;

public class App5 {

	public static void main(String[] args) {
		Circle c = new Circle(5, "RED");
		String str = c.toString();
		System.out.println(str);

		System.out.println(c);

		System.out.println("====================");
		Car car = new Car(123, "Yellow");
		System.out.println(car);

	}

}
