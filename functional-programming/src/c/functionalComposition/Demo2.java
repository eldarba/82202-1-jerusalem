package c.functionalComposition;

import java.util.function.Predicate;

public class Demo2 {
	
	public static void main(String[] args) {
		
		// composing Predicate
		
		
		Predicate<String> startsWithL = s -> s.startsWith("l");
		Predicate<String> endsWithN = s -> s.endsWith("n");
		Predicate<String> containsX = s -> s.contains("x");
		
		String str = "lets test functional composition";
		System.out.println(startsWithL.and(endsWithN).and(containsX).test(str));
		System.out.println(startsWithL.and(endsWithN).or(containsX).test(str));
		
		// java functional composition support
		Predicate<String> startsWithLAndendsWithN = s -> startsWithL.and(endsWithN).test(s);
		Predicate<String> startsWithLOrendsWithN = s -> startsWithL.or(endsWithN).test(s);
		
		
		System.out.println(startsWithLAndendsWithN.test(str));
		
	}
	

}
