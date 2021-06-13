package b;

public class App4 {

	public static void main(String[] args) {

		Object obj = new Circle(5, "Pink");

		Shape shape = (Shape) obj;
		shape.getArea();
		shape.getColor();
		shape.setColor("black");

		Circle circle = (Circle) obj;
		circle.getArea();
		circle.getColor();
		circle.setColor("black");
		circle.getRadius();
		circle.setRadius(3);

	}

}
