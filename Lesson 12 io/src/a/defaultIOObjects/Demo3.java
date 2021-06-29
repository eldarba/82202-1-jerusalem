package a.defaultIOObjects;

import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello");
		System.out.close(); // do not close the default IO - System.in, System.out, System.err
		System.out.println("Good bye");
	}

}
