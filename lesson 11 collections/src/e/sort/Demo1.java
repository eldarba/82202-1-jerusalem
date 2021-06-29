package e.sort;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		{
			List<Integer> list = Arrays.asList(4, 5, 8, 2, 5, 3, 1);
			System.out.println(list);
			list.sort(null);
			System.out.println(list);
		}
		System.out.println("============================");
		{
			List<String> list = Arrays.asList("banana", "dog", "cat", "apple");
			System.out.println(list);
			list.sort(null);
			System.out.println(list);
		}
		System.out.println("============================");
		{
			List<LocalDate> list = Arrays.asList(

					LocalDate.of(1980, 5, 25),

					LocalDate.of(2021, 5, 25),

					LocalDate.of(1980, 3, 25),

					LocalDate.of(800, 5, 25),

					LocalDate.of(2000, 5, 25)

			);
			System.out.println(list);
			list.sort(null);
			System.out.println(list);
		}
		System.out.println("============================");
		{
			List<Person> list = Arrays.asList(

					new Person(555, "ddd", 95),

					new Person(333, "ccc", 12),

					new Person(111, "bbb", 66),

					new Person(444, "aaa", 18)

			);
//			System.out.println(list);
			System.out.println("print by insert order");
			printCollection(list);

			// sort by natural order - id
			list.sort(null);
//			System.out.println(list);
			System.out.println("sort by natural order - id");
			printCollection(list);

			// sort by other order - age
			PersonAgeComparator ageComparator = new PersonAgeComparator();
			list.sort(ageComparator);
//			System.out.println(list);
			System.out.println("sort by other order - age");
			printCollection(list);

			// sort by other order - name
			PersonNameComparator nameComparator = new PersonNameComparator();
			list.sort(nameComparator);
//			System.out.println(list);
			System.out.println("sort by other order - name");
			printCollection(list);
		}
		System.out.println("============================");

	}

	private static void printCollection(Collection<Person> col) {
		for (Object object : col) {
			System.out.println(object);
		}
		System.out.println("=============");
	}
}
