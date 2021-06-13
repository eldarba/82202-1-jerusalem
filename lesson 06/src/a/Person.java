package a;

public class Person {

	private int id;
	private String name;
	private int age;

	public Person() {
	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person(int id) {
		this(id, "defaultName", 18);
	}

	public Person(int id, String name) {
		this(id, name, 18);
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

	public void print() {
		System.out.println("Person[id=" + id + ", name=" + name + ", age=" + age + "]");
	}

}
