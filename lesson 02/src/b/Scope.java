package b;

public class Scope {

	public static void main(String[] args) {
		
		int x = 5;
		System.out.println(x);
		
		{
			int y = 10;
			System.out.println(x);
			System.out.println(y);
		}
		
		System.out.println(x);
		System.out.println("END");

	}

}
