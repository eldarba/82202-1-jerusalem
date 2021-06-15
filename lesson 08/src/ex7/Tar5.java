package ex7;

import java.util.Arrays;

public class Tar5 {

	public static void main(String[] args) {

		int[][] grades = new int[20][10];
		double avgSum = 0;

		for (int i = 0; i < grades.length; i++) {
			double studentSum = 0;
			for (int j = 0; j < grades[i].length; j++) {
				grades[i][j] = (int) (Math.random() * 101);
				studentSum += grades[i][j];
			}
			double studentAvg = studentSum / grades[i].length;
			avgSum += studentAvg;
			System.out.print("student " + (i + 1) + " grades:\t");
			System.out.print(Arrays.toString(grades[i]));
			System.out.println(" avg: " + studentAvg);
		}

		double schoolAvg = avgSum / grades.length;
		System.out.println("school average: " + schoolAvg);

	}

}
