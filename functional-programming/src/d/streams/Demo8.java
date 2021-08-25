package d.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo8 {

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

		List<Integer> x = list.stream().filter(e -> e > 100).collect(Collectors.toList());
		System.out.println(x);
		
		Set<Integer> y = list.stream().filter(e -> e > 100).collect(Collectors.toSet());
		System.out.println(y);
		
		

	}

}
