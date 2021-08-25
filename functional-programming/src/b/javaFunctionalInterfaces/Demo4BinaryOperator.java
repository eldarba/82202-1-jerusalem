package b.javaFunctionalInterfaces;

import java.util.function.BinaryOperator;

public class Demo4BinaryOperator {

	public static void main(String[] args) {

		BinaryOperator<String> concatenator = (s1, s2) -> s1.concat(s2);
		BinaryOperator<String> decoConcatenator = (s1, s2) -> "~" + s1.concat(s2) + "~";
		
		String str = concatenator.apply("aaa", "bbb");
		System.out.println(str);
		
		String str2 = decoConcatenator.apply("aaa", "bbb");
		System.out.println(str2);
		
		

	}

}
