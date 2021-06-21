package e.sort;

/**
 * The natural order of the Person type is determined by the id field.
 * 
 * @author Eldar
 *
 */
public class Person implements Comparable<Person> {

	private int id;
	private String name;
	private int age;

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

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
