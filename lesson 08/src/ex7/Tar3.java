package ex7;

import java.util.Arrays;

public class Tar3 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
		}
		arr[0] = 0;
		System.out.println(Arrays.toString(arr));

		int[] temp = new int[arr.length];
		System.out.println(Arrays.toString(temp));

		// start moving elements
		int length = 0;
		outer: for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < length; j++) {
				if (arr[i] == temp[j]) {
					continue outer;
				}
			}
			// if we are here we shold copy an element
			temp[length] = arr[i];
			length++;
		}

		System.out.println(Arrays.toString(temp));

		// shorten the temp array
		int[] arrUnique = new int[length];
		System.out.println(Arrays.toString(arrUnique));
		// copy
		System.arraycopy(temp, 0, arrUnique, 0, length);
		System.out.println(Arrays.toString(arrUnique));

	}

}
