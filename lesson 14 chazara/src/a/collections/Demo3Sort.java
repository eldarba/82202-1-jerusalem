package a.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo3Sort {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();

		persons.add(new Person(103, "aaa", (int) (Math.random() * 121)));
		persons.add(new Person(102, "bbb", (int) (Math.random() * 121)));
		persons.add(new Person(101, "bbb", (int) (Math.random() * 121)));
		persons.add(new Person(101, "aaa", (int) (Math.random() * 121)));

		print(persons);

		persons.sort(null);
//		Collections.sort(persons);
		print(persons);

		PersonAgeComparator ageComparator = new PersonAgeComparator();
		persons.sort(ageComparator);
//		Collections.sort(persons, ageComparator);
		print(persons);

	}

	public static void print(Collection<?> col) {
		System.out.println("collection ==========");
		for (Object e : col) {
			System.out.println(e);
		}
		System.out.println("=====================");
	}

}
