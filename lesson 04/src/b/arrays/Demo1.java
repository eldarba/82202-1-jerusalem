package b.arrays;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		// create an array of 10 byte elements
		byte[] arr1 = new byte[10];
		arr1[0] = 2;
		arr1[5] = 3;
		arr1[9] = 4;
		System.out.println(Arrays.toString(arr1));

		// create an array of 3 String elements
		// static initialization
		String[] arr2 = { "aaa", "bbb", "ccc" };
		// print the array as string
		System.out.println(Arrays.toString(arr2));
		// access array elements
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);

		// create an array of char elements
		char[] characters = { 'A', 'B', 'C', ' ', '"', '\n', '\\', 65 };
		System.out.println(Arrays.toString(characters));
	}

}
