package b.arrays.dimensions;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {

		// array 1 dimension
		int[] arr1 = new int[5];
		// array 1 dimension - static initialization
		int[] arr2 = { 2, 4, 6, 8 };

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		System.out.println("=================");
		// array 2 dimensions - static initialization
		int[][] arrDim = { { 1, 1, 1 }, { 2, 2 }, { 3, 3, 3, 3 } };

		// print array using Arrays.toString method
		System.out.println(Arrays.toString(arrDim));
		// print array using Arrays.deepToString method
		System.out.println(Arrays.deepToString(arrDim));

		System.out.println("=================");
		for (int i = 0; i < arrDim.length; i++) {
			System.out.println(Arrays.toString(arrDim[i]));
		}

	}

}
