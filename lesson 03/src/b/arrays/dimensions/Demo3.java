package b.arrays.dimensions;

public class Demo3 {

	public static void main(String[] args) {
		System.out.println();
		int[][] arr = new int[5][];
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[8];
		arr[3] = new int[5];
		arr[4] = new int[6];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + ", ");
			}
			System.out.println();
		}

	}

}
