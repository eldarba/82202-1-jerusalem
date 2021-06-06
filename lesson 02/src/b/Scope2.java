package b;

public class Scope2 {

	public static void main(String[] args) {
		int x = 5;
		int a; // declaration
		System.out.println(x);
		othermethod();
		System.out.println(x);
		othermethod();
		a = 10; // initialization
		System.out.println(a);
	}
	
	public static void othermethod() {
		int x = 100;
		System.out.println(x);
	}
	
	

}
