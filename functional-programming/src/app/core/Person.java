package app.core;

import java.time.LocalDate;

public class Person {

	private int id;
	private String name;
	private int age;
	private LocalDate birthdate;
	
	// static method for comparing people by age
	
	public static int compareByAge(Person p1, Person p2) {
		return p1.birthdate.compareTo(p2.birthdate);
	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person(int id, String name, int age, LocalDate birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.birthdate = birthdate;
	}

	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", birthdate=" + birthdate + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	
	

}
