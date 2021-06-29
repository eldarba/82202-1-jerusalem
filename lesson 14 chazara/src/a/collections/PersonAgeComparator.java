package a.collections;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		return p1.getAge() - p2.getAge();
//		Integer a = p1.getAge();
//		Integer b = p2.getAge();
//		return a.compareTo(b);
	}

}
