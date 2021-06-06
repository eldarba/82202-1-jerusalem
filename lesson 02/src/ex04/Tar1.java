package ex04;
public class Tar1 {
	public static void main(String[] args) {
		// variables
		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		int sum = a + b;
		double avg = sum / 2D;
		int remA = a % 10;
		int remB = b % 10;
		int area = a * b;
		// printouts:
		System.out.println("a = " + a + " and b = " + b);
		System.out.println("sum = " + sum);
		System.out.println("average = " + avg);
		System.out.println("remainder of " + a + " divided by 10 is " + remA);
		System.out.println("remainder of " + b + " divided by 10 is " + remB);
		System.out.println("area of " + a + "x" + b + " rectangle is " + area);
	}

}
