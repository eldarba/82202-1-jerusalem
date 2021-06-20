package a;

import java.util.HashSet;
import java.util.Set;

public class Demo3Set {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
//		Set<String> set = new LinkedHashSet<>();

		System.out.println(set.add("AAA"));
		System.out.println(set.add("AAA"));
		set.add("AAA");
		set.add("BBB");
		set.add("CCC");
		set.add("AAA");
		System.out.println(set);

	}

}
