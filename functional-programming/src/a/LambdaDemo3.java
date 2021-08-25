package a;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo3 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("danna", "itamara", "ran", "ella");
		// 1. print the list
		System.out.println(list);

		// 2. sort by natural order and print the list
		list.sort(null);
		System.out.println(list);

		// 3. sort by name length (using lambda) and print the list
		list.sort((name1, name2) -> name1.length() - name2.length());
		System.out.println(list);
		
		// old style
		NameLengthComparator comparator = new NameLengthComparator();
		list.sort(comparator);
		System.out.println(list);
	}

}
