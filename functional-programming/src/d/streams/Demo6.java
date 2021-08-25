package d.streams;

import java.util.ArrayList;
import java.util.List;

public class Demo6 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ddd");
		list.add("aaa");
		list.add("ccc");

		
		list
		
		.stream()
		
		.peek(e -> System.out.println("[" + e + "]"))
		
		.distinct()
		
		.map(e->e.toUpperCase())

		.peek(e -> System.out.println("[-" + e + "-]"))
		
		.forEach(e -> System.out.println(e));
	}

}
