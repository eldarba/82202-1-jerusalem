package c;

public class Car {

	private static int counter;
	private final int number; // final
	private int speed;
	public static final int MAX_SPEED = 120; // constant

	static {// static initializer - runs on class load
		System.out.println("Car class loaded");
	}

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
		setSpeed(speed);
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

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed <= MAX_SPEED) {
			this.speed = speed;
		}
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", speed=" + speed + "]";
	}

}
