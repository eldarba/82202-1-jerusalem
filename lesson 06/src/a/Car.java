package a;

public class Car {

	private int number;
	private String color;
	private Point location;

	public Car(int number, String color) {
		super();
		this.number = number;
		this.color = color;
		this.location = new Point();
	}

	public Car(int number, String color, int x, int y) {
		super();
		this.number = number;
		this.color = color;
		this.location = new Point(x, y);
	}

	public void printLocation() {
		System.out.println(
				color + " car " + number + " is at location (" + location.getX() + ", " + location.getY() + ")");
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public void setLocation(int x, int y) {
		this.location.setX(x);
		this.location.setY(y);
	}

}
