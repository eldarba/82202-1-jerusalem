package e;

import java.util.Scanner;

public class ARMDemo {

	public static void main(String[] args) {

		// declaring a resource
		// initialize the resource
		try (

				// resource 1
				Scanner sc = new Scanner(System.in);

				// resource 2
				MyClosable mc = new MyClosable();

		) {
			System.out.println("try");
			throw new NullPointerException();
//			throw new RuntimeException();
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("catch - ArithmeticException OR NullPointerException");
		} catch (Exception e) {
			System.out.println("catch - some other exception");
		} finally {
			System.out.println("finally");
		}

		// after the try block Java will call close() method on the ARM resource

	}

}

class MyClosable implements AutoCloseable {

	@Override
	public void close() {
		System.out.println("MyClosable is closing");
	}

}
