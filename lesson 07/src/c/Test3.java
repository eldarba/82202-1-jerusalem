package c;

import static java.lang.Math.PI;
import static java.lang.Math.random;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// static import - no need to specify class
		System.out.println(random());
		System.out.println(PI);
		System.out.println("car max speed: " + Car.MAX_SPEED);

		// import - no need to specify package
		Scanner sc;

	}

}
