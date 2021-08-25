package d.streams;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("qq");
		list.add("two");
		list.add("three");
		list.add("threeAAA");
		
		System.out.println("=================");
		long x = list.stream().filter(e -> e.length() <= 3).count();
		System.out.println(x);
		
		System.out.println("=================");
		list.stream().filter(e -> e.length() <= 3).forEach(e->System.out.println(e));
	}

}
