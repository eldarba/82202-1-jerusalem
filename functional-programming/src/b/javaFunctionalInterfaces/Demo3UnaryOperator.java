package b.javaFunctionalInterfaces;

import java.util.function.UnaryOperator;

import app.core.Person;

public class Demo3UnaryOperator {

	public static void main(String[] args) {
		
		
		
		UnaryOperator<Person> op1 = p -> new Person(p.getId(), "Moshe", p.getAge());
		
//		UnaryOperator<Person> op1 = p -> {
//			p.setName("Moshe");
//			return p;
//		};
		
		
		Person person = new Person(101, "aaa", 25);
		System.out.println(person);
		// lets operate on this person so as to change name to moshe
		
		person = op1.apply(person);
		System.out.println(person);
		

	}

}
