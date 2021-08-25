package a;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 7, 1, 5, 3, 6);
		System.out.println(list);

		list.sort(null);
		System.out.println(list);
		
		// old style
		// using an implementor object from an implementing class
		NumberReverseComparator comparator = new NumberReverseComparator();
		list.sort(comparator);
		System.out.println(list);

		// new style
		// using an implementor object as lambda expression
		list.sort((a, b) -> b - a);
		System.out.println(list);
		
	}

}
