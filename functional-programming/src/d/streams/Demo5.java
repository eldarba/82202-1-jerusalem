package d.streams;

import java.util.ArrayList;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ddd");
		list.add("aaa");
		list.add("ccc");

		list.stream().distinct().forEach(e -> System.out.println(e));
		
		System.out.println("==================");
		
		list.stream().distinct().map(e->e.toUpperCase()).forEach(e -> System.out.println(e));
	}

}
