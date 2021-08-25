package c.functionalComposition;

import java.util.function.Predicate;

public class Demo1 {
	
	public static void main(String[] args) {
		
		
		Predicate<String> startsWithL = s -> s.startsWith("l");
		Predicate<String> endsWithN = s -> s.endsWith("n");
		Predicate<String> startsWithLAndendsWithN = s -> startsWithL.test(s) && endsWithN.test(s);
		
		String str = "lets test functional composition";
		
		System.out.println(startsWithLAndendsWithN.test(str));
	}
	

}
