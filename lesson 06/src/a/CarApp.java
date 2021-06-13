package a;

public class CarApp {
	public static void main(String[] args) {
		Car c = new Car(111, "Yellow");
		c.printLocation();

		c.getLocation().moveRight(100);
		c.printLocation();

		c.setLocation(new Point(25, 87));
		c.printLocation();

		c.setLocation(10, 20);
		c.printLocation();

	}
}
