package c;

public class Test {
	public static void main(String[] args) {
		System.out.println(Car.getCounter());
		Car c1 = new Car();
		Car c2 = new Car();
		System.out.println(Car.getCounter()); // static reference

		System.out.println("=============");
		System.out.println(c1.getNumber());
		System.out.println(c1.getNumber());

//		Car.counter = -350;
		System.out.println(Car.getCounter()); // static reference

	}
}
