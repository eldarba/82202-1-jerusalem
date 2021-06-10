package a.classes.definition;

public class Person {

	int id;
	String name;
	private int age;

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

	void speak() {
		System.out.println(name + " says: bla bla");
	}

	void walk() {
		System.out.println(name + " is walking");

	}

}
