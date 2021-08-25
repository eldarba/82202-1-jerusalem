package b.javaFunctionalInterfaces;

import java.util.function.Predicate;

public class Demo2Predicate {

	public static void main(String[] args) {
		
		Predicate<String> checkString = str -> str.length() <= 10;
		
		System.out.println(checkString.test("aaa"));
		System.out.println(checkString.test("aaaaaaaaaaaaaaaaa"));

	}

}
