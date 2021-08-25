package d.streams;

import java.util.ArrayList;
import java.util.List;

public class Demo7 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(23);
		list.add(24);
		list.add(100);
		list.add(24);
		list.add(53);
		list.add(31);
		list.add(37);

		boolean isThereAnyEvenNumber = list.stream().anyMatch(e -> e % 2 == 0);
		System.out.println(isThereAnyEvenNumber);

		boolean isThereHigherThan100 = list.stream().anyMatch(e -> e > 100);
		System.out.println(isThereHigherThan100);

		boolean areAllOdd = list.stream().allMatch(e -> e % 2 != 0);
		System.out.println(areAllOdd);

		boolean nonIsOdd = list.stream().noneMatch(e -> e % 2 != 0);
		System.out.println(nonIsOdd);

	}

}
