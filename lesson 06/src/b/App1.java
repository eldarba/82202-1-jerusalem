package b;

public class App1 {

	public static void main(String[] args) {
		Shape shape = new Shape();
		System.out.println(shape.getArea());

		Rectangle rectangle = new Rectangle(5, 3);
		System.out.println(rectangle.getArea());

		Circle circle = new Circle(5);
		System.out.println(circle.getArea());

	}

}
