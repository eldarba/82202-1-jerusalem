package c;

public class Car {

	private static int counter;
	private int number;
	private int speed;

	{ // initializer - runs before CTOR
		System.out.println(">>> initializer");
		counter++;
		this.number = counter;
	}

	public Car() {
		System.out.println(">>> CTOR");
	}

	public Car(int speed) {
		System.out.println(">>> CTOR");
		this.speed = speed;
	}

	public static int getCounter() {
		// the 'this' reference is not available in static methods
//		System.out.println("car speed is " + this.speed);
		return counter;
	}

	public int getNumber() {
		System.out.println(counter);
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", speed=" + speed + "]";
	}

}
