package a.classes.definition;

public class Program2 {

	public static void main(String[] args) {

		// create a person instance
		Person p = new Person();
		// set the person's state
		p.setId(101);
		p.setName("Moshe");
		p.setAge(33);
		// access and print state
		System.out.println("id: " + p.getId());
		System.out.println("name: " + p.getName());
		System.out.println("age: " + p.getAge());

	}

}
