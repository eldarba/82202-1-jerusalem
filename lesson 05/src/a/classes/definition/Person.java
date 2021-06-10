package a.classes.definition;

public class Person {

	protected int id;
	protected String name;
	protected int age;

//	// CTOR 1
	public Person() {

	}

	// CTOR 2
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		setAge(age);
	}

	/**
	 * change the age of this person if the value is valid
	 * 
	 * @param age the new age to be assigned
	 */
	public void setAge(int age) {
		// the keyword 'this' is a reference to the current object
		if (age >= 0 && age <= 120) {
			this.age = age;
		}
	}

	/**
	 * returns the age of this person
	 * 
	 * @return the age of this person
	 */
	public int getAge() {
		return this.age;
	}

	public void speak() {
		System.out.println(name + " says: bla bla");
	}

	public void walk() {
		System.out.println(name + " is walking");

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

}
