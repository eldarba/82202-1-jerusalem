package b.javaFunctionalInterfaces;

import java.util.function.Consumer;

import app.core.Person;

public class Demo6Consumer {

	public static void main(String[] args) {
		
		// consume a person and print it
		Consumer<Person> cosumer1 = person -> System.out.println(person);
		Consumer<Person> cosumer2 = person -> person.setName("Moshe");
		
		Person p = new Person(101, "aaa", 22);
		cosumer1.accept(p);
		cosumer2.accept(p);
		cosumer1.accept(p);
		
		
		
		
	}

}
