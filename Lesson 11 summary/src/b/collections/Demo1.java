package b.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {

		List<String> listMaarechentShaot = new ArrayList<>();
		listMaarechentShaot.add("Math");
		listMaarechentShaot.add("Hebrew");
		listMaarechentShaot.add("Java");
		listMaarechentShaot.add("Java");
		listMaarechentShaot.add("English");
		listMaarechentShaot.add("English");
		listMaarechentShaot.add("Java");
		System.out.println(listMaarechentShaot);

		System.out.println("HashSet - unordered");
		Set<String> hashSetSubjects = new HashSet<>(listMaarechentShaot);
		System.out.println(hashSetSubjects);

		System.out.println("LinkedHashSet - ordered");
		Set<String> linkedSetSubjects = new LinkedHashSet<>(listMaarechentShaot);
		System.out.println(linkedSetSubjects);

		System.out.println("TreeSet - sorted");
		Set<String> treeSetSubjects = new TreeSet<>(listMaarechentShaot);
		System.out.println(treeSetSubjects);

		////////////////////////////
		System.out.println("==================");

		// maps keys to values
		Map<Integer, String> map = new HashMap<Integer, String>();
		// add map entries
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "ccc");
		// use a key to find a value
		System.out.println(map.get(2));

	}

}
