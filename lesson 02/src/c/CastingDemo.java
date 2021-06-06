package c;

public class CastingDemo {

	public static void main(String[] args) {
		short a = 10;
		int b = a; // implicit casting from short to int 
		short c = (short)b; // explicit casting from int to short
		
		double x = 12.658;
		int y = (int)x; // explicit casting from double to int
		System.out.println(x);
		System.out.println(y);
		
		long n = 100;
		float f = n; // implicit casting from long to float 
		
		int sum = sum((byte)a, (byte)b);
		System.out.println("the sum is: " + sum);

	}
	
	public static int sum(byte a, byte b) {
		return a + b;
	}

}
