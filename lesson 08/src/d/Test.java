package d;

public class Test {

	public static void main(String[] args) {

		// to get the single instance use getInstance method
		Superman s1 = Superman.getInstance();
		Superman s2 = Superman.getInstance();
		Superman s3 = Superman.getInstance();
		s1.fly();

		System.out.println(s1 == s3);

	}

}
