package a;

public class PointApp {

	public static void main(String[] args) {

		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);

		System.out.println(p1.toString());
		System.out.println(p2.toString());

		System.out.println("====================");

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		System.out.println("====================");
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals("aaa"));

	}

}
