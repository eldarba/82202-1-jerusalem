package a;

import java.util.ArrayList;
import java.util.List;

public class Demo1List {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("AAA");
		list.add(5);
		list.add(true);
		System.out.println(list);
		System.out.println("first element: " + list.get(0));
		System.out.println("list size: " + list.size());

	}

}
