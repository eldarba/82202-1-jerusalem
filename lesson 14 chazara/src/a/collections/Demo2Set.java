package a.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo2Set {

	public static void main(String[] args) {
		Set<Person> persons = new HashSet<>();
		persons.add(new Person(101, "aaa", 25));
		persons.add(new Person(101, "aaa", 25));
		persons.add(new Person(102, "bbb", 25));
		persons.add(new Person(103, "ccc", 25));

		System.out.println(persons);
		print(persons);

		// static initialization of list
		List<Integer> list = Arrays.asList(2, 5, 6, 8);
		print(list);
	}

	public static void print(Collection<?> col) {
		System.out.println("collection ==========");
		for (Object e : col) {
			System.out.println(e);
		}
		System.out.println("=====================");
	}

}
