package f.loop.forDemo;

public class Demo5 {

	public static void main(String[] args) {

		for (int c1 = 1, c2 = 10, c3 = 100; c1 <= 3; c1++, c2 += 10, c3 += 100) {
			System.out.println(c1 + ", " + c2 + ", " + c3);
		}

	}
}
