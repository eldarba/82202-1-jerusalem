package b;

public class App2 {

	public static void main(String[] args) {

		Shape shape;
		// polymorphism = when we point to a specific type
		// from one of its super types

		shape = new Circle(3, "red");
		System.out.println(shape.getArea());

		shape = new Rectangle(3, 4, "yellow");
		System.out.println(shape.getArea());

	}

}
