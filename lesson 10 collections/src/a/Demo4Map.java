package a;

import java.util.HashMap;
import java.util.Map;

public class Demo4Map {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("one", 1);
		map1.put("two", 2);
		map1.put("three", 3);
		System.out.println(map1.get("two"));

		System.out.println("==================");
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "one");
		map2.put(2, "two");
		map2.put(3, "three");
		System.out.println(map2.get(2));

	}

}
