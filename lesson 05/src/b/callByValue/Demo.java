package b.callByValue;

import a.classes.definition.Person;

public class Demo {

	public static void main(String[] args) {
		int x = 5;
		Person p = new Person(101, "aaa", 20);
		m1(x, p);
		System.out.println(x);
		System.out.println(p.getName());
	}

	public static void m1(int x, Person p) {
		System.out.println(x);
		x = 10;
		System.out.println(x);
		p.setName("bbb");
		System.out.println(p.getName());
	}

}
