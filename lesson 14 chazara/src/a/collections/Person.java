package a.collections;

import java.util.Objects;

public class Person implements Comparable<Person> {

	// class variables
	private static int counter;
	// constants
	public static final int MAX_AGE = 120;
	// instance variables - attributes
	private final int id; // final attribute
	private String name;
	private int age;

	static { // static initializer - runs on class load
		System.out.println("class loaded");
	}

	{ // dynamic initializer runs before CTOR
		counter++;
	}

	// CTOR
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return id == other.id;
	}

	@Override
	public int compareTo(Person other) {
		if (this.id < other.id) {
			return -1;
		} else if (this.id > other.id) {
			return 1;
		} else {
			return 0;
		}
	}

//	@Override
//	public int compareTo(Person other) {
//		if (this.id < other.id) {
//			return -1;
//		} else if (this.id > other.id) {
//			return 1;
//		} else {
//			return this.name.compareTo(other.name);
//		}
//	}

//	@Override
//	public int compareTo(Person other) {
//		return this.name.compareTo(other.name);
//	}

}
