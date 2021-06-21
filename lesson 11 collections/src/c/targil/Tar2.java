package c.targil;

import java.util.LinkedHashSet;
import java.util.Set;

public class Tar2 {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<Integer>();
		int sum = 0;
		int iter = 0;
		while (set.size() < 10) {
			iter++;
			int r = (int) (Math.random() * 11);
			if (set.add(r)) {
				sum += r;
			}
		}
		System.out.println(set);
		System.out.println("sum: " + sum);
		System.out.println("number of iterations: " + iter);

	}

}
