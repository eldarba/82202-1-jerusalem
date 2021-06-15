package e.ternary;

public class Demo2 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 11);
		int b = (int) (Math.random() * 11);

		System.out.println(a + ", " + b);

		int max = a > b ? a : b;

//		if (a > b) {
//			max = a;
//		} else {
//			max = b;
//		}

		System.out.println("max: " + max);

	}

}
