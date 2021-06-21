package c.targil;

import java.util.ArrayList;
import java.util.List;

public class Tar1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random() * 11);
			list.add(r);
			sum += r;
		}
		System.out.println(list);
		System.out.println("sum: " + sum);

	}

}
