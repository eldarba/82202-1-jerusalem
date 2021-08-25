package b.javaFunctionalInterfaces;

import java.time.LocalDate;
import java.util.function.Function;

public class Demo1Function {

	public static void main(String[] args) {

		// we want to convert a string to int
		// we create a lambda implementation for the Function inteface
		Function<String, Integer> stringToInt = str -> Integer.parseInt(str);

		// using the implementation
		String str1 = "123";
		String str2 = "50";
		int x = stringToInt.apply(str1);
		int y = stringToInt.apply(str2);

		System.out.println(x + " + " + y + " = " + (x + y));
		
		int year = fromCurrentDate(date -> date.getYear());
		int dayOfMonth = fromCurrentDate(date -> date.getDayOfMonth());
		int month = fromCurrentDate(date -> date.getMonthValue());
		
		System.out.println("year: " + year);
		System.out.println("dayOfMonth: " + dayOfMonth);
		System.out.println("month: " + month);

	}
	
	public static int fromCurrentDate(Function<LocalDate, Integer> x) {
		LocalDate now = LocalDate.now();
		return x.apply(now); 
	}
	
	

}
