package a.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		// List
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(11);
		list.add(7);

		// convert List to Set
		Set<Integer> set = new LinkedHashSet<Integer>(list);

		System.out.println(list);
		System.out.println(set);

		System.out.println(list.indexOf(6));
		System.out.println(list.indexOf(11));
		System.out.println(list.indexOf(110));

		System.out.println(list.contains(110));
		System.out.println(list.contains(6));

	}

}
