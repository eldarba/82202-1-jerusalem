package d.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Demo9 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(23);
		list.add(300);
		list.add(24);
		list.add(100);
		list.add(24);
		list.add(300);
		list.add(53);
		list.add(180);
		list.add(31);
		list.add(37);

		Optional<Integer> opt = list.stream().max((a, b) -> a - b);
		System.out.println(opt.get());

		Optional<Integer> opt2 = list.stream()
				.filter(e -> e % 2 != 0)
				.max((a, b) -> a - b);
		
		System.out.println(opt2.get());

	}

}
