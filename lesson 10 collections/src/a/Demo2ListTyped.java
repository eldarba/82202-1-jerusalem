package a;

import java.util.ArrayList;
import java.util.List;

public class Demo2ListTyped {

	public static void main(String[] args) {

		// list of string - type safe - generics <>
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("bbb");
		list.add("ccc");
		list.add("bbb");
		list.add(0, "www"); // add to specified
//		list.set(0, "abc"); // set at specified index
		System.out.println(list);

	}

}
