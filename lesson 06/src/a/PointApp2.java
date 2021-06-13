package a;

public class PointApp2 {

	public static void main(String[] args) {

		Point p1 = new Point();
		p1.print();

		p1.moveRight();
		p1.moveRight();
		p1.moveRight();
		p1.print();

		for (int i = 0; i < 5; i++) {
			p1.moveUp();
		}
		p1.print();

		p1.moveRight(25);
		p1.print();

	}

}
