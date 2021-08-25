package b.javaFunctionalInterfaces;

import java.util.function.Supplier;

public class Demo5Supplier {

	public static void main(String[] args) {

		// Supplier is used to generate a result of a certain type
		Supplier<Integer> randomizer = () -> (int) (Math.random() * 101 + 100);
		System.out.println(randomizer.get());
		System.out.println(randomizer.get());
		System.out.println(randomizer.get());
		System.out.println(randomizer.get());
		System.out.println(randomizer.get());
	}

}
