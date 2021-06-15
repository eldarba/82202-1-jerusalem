package a;

public class ShapeApp1 {

	public static void main(String[] args) {

		Shape s = new Circle("Yellow", 2);
		s.print();

		s = new Rectangle("Blue", 2, 3);
		s.print();

		Square sq = new Square("Black", 5);
		sq.print();

		sq.setLength(100);
		sq.print();

		sq.setSides(5);
		sq.print();

	}

}
