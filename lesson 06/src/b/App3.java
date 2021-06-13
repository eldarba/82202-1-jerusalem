package b;

public class App3 {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[5];

		shapes[0] = new Rectangle(4, 5, "Red");
		shapes[1] = new Circle(5, "White");
		shapes[2] = new Rectangle(4, 5, "Blue");
		shapes[3] = new Shape("Pink");
		shapes[4] = new Rectangle(4, 5, "White");

		for (int i = 0; i < shapes.length; i++) {
			Shape shape = shapes[i]; // s is a reference to the current element
			System.out.println("color: " + shape.getColor() + ", area: " + shape.getArea());

			// is the current shape a circle
			// instanceof operator
			if (shape instanceof Circle) {
				System.out.println("this is a circle");
				Circle circle = (Circle) shape;
				System.out.println("radius: " + circle.getRadius());
			}
			System.out.println("===============");

		}

	}

}
