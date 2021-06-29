package a.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		// collection
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(6);
		list.add(11);
		list.add(7);

		// array
		// convert collection to array

		Object[] arr1 = list.toArray();
		Integer[] arr2 = list.toArray(new Integer[list.size()]);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

}
