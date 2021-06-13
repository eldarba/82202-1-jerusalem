package b;

public class App2 {

	public static void main(String[] args) {

		Shape shape;

		shape = new Circle(3);
		System.out.println(shape.getArea());

		shape = new Rectangle(3, 4);
		System.out.println(shape.getArea());

	}

}
