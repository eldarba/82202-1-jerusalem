package b.arrays.dimensions;

import java.util.Arrays;

public class Demo5 {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8 };

		// use for loop to iterate over the array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("==============");

		// use for-each loop to iterate over the array

		for (int x : arr) {
			System.out.println(x);
		}
	}

}
