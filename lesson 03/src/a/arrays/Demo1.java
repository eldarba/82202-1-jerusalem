package a.arrays;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		// an array of int
		int[] arr = new int[5];
		arr[0] = 6;
		arr[1] = 12;
		arr[2] = 7;
		arr[3] = -100;
		arr[4] = 20;
		// access element
		System.out.println(arr[3]);

		// an array of String
		String[] names = new String[3];
		names[0] = "Yosi";
		names[1] = "Tzlil";
		names[2] = "Nitsan";

		// access element
		System.out.println(names[0]);
		System.out.println(names[2]);
		// access element last element using the length attribute
		System.out.println(names[names.length - 1]);

		// printing arrays
		System.out.println(Arrays.toString(arr));

	}

}
