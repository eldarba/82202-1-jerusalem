package b;

public class Shape {

	private String color;

	public Shape(String color) {
		super();
		this.color = color;
	}

	// final method cannot be overridden
	public final String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	protected double getArea() {
		return -1;
	}

}
