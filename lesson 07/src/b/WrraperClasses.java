package b;

public class WrraperClasses {

	public static void main(String[] args) {

		int x = 5;
		Integer y = 5;

		printAnyObject(x);

		// static methods
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

	}

	public static void printAnyObject(Object obj) {
		System.out.println("value: " + obj);
		System.out.println("type: " + obj.getClass());
	}

}
