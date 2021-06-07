package a.arrays;

public class Demo3 {

	public static void main(String[] args) {

		int[] arr = new int[25];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			// create a random value and put in the array
			arr[i] = (int) (Math.random() * 101);
			sum += arr[i];
			System.out.println(arr[i]);
		}

		System.out.println("=============");
		System.out.println(sum);

	}

}
