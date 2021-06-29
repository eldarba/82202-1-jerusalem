package a.defaultIOObjects;

import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {

		System.out.println(System.in.getClass());
		System.out.println(System.out.getClass());
		System.out.println(System.err.getClass());

		System.out.println("output");
		int x = System.in.read();
		System.out.println(x);

		System.err.println("Error");

	}

}
