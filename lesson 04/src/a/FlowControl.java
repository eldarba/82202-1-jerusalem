package a;

public class FlowControl {

	public static void main(String[] args) {

		// if construct
		int x = 10;

		if (x == 10) {
			System.out.println("true block: TEN");
		} else {
			System.out.println("false block: some other value");
		}
		// switch construct
		switch (x) {
		case 10:
			System.out.println("TEN");
			break;
		case 20:
		case 30:
			System.out.println("TWENTY");
			break;
		default:
			System.out.println("other value - default");
		}

		// loops
		// while loop
		int c = 10;

		while (c <= 15) {
			System.out.print("*");
			c++;
		}

		// for loop
		for (int i = 1; i <= 5; i++) {
			System.out.print("+");
		}

		// for-each loop
		System.out.println();
		String[] arr = { "aaa", "bbb", "ccc", "dddddd", "ee", "fff" };

		for (String e : arr) {
			System.out.println(e);
			if (e.length() > 5) {
				break;
			}
		}

	}

}
