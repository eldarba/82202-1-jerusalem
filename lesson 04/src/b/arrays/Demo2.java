package b.arrays;

import java.util.Arrays;

// aaa
public class Demo2 {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6 };

		int[] temp = new int[arr.length + 2];

		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));

	}

}
