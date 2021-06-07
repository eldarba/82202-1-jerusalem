package c.arrays.copy;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		int[] arr1 = { 2, 4, 6, 8 };
		int[] arr2 = new int[arr1.length];
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println("=================");

		System.arraycopy(arr1, 1, arr2, 2, 2);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

}
