package a;

public abstract class Shape implements Printable {
	// attribute
	private String color; // instance variable
	private final int id; // final instance variable
	private static int counter; // class variable

	{ // initializer - runs before CTOR
		counter++;
		this.id = counter;
	}

	// CTOR
	public Shape(String color) {
		super();
		this.color = color;
	}

	// abstract method
	public abstract double getArea();

	// concrete methods
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	@Override
	public void print() {
		System.out.println("==========================");
		System.out.println("=== " + this + " ===");
		System.out.println("==========================");
	}

}
