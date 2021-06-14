package c;

public class Test2 {

	public static void main(String[] args) {

		System.out.println("cars made: " + Car.getCounter());

		Car c1 = new Car();
		Car c2 = new Car(30);
		Car c3 = new Car();

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		System.out.println("cars made: " + Car.getCounter());
	}

}
