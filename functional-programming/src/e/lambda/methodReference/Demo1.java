package e.lambda.methodReference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import app.core.Person;

public class Demo1 {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();

		list.add(new Person(101, "aaa", 0, LocalDate.of(2000, 1, 25)));
		list.add(new Person(102, "ddd", 0, LocalDate.of(1990, 4, 7)));
		list.add(new Person(103, "bbb", 0, LocalDate.of(1980, 7, 12)));
		list.add(new Person(104, "ccc", 0, LocalDate.of(2020, 1, 25)));

		System.out.println(list);
		
		// supply the implementor with a lambda expression
		list.sort((p1, p2) -> p1.getBirthdate().compareTo(p2.getBirthdate()));
		
		// method reference - to static method - of a class
		// supply the implementor refering to an existing static method
		list.sort(Person::compareByAge);
		System.out.println(list);
		
		// method reference - to dynamic method - of an object
		PersonCompare personCompare = new PersonCompare();
		list.sort(personCompare::compareByName);
		System.out.println(list);
		
		list.sort(personCompare::compareByBirthdate);
		System.out.println(list);
		
		// method reference - to dynamic method - of an object
		// print using lambda
		list.forEach(e -> System.out.println(e));
		// print using method reference - to dynamic method - of an object
		list.forEach(System.out::println);
		
		
		
		

	}

}
