package a.classes.definition;

public class Program3 {

	public static void main(String[] args) {
		// create a Person instance using the 1st CTOR
		Person p1 = new Person();

		// create a Person instance using the 2nd CTOR
		Person p2 = null;
		p2 = new Person(103, "Dani", 13);

		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

		System.out.println("=============");

		System.out.println(p2.getId());
		System.out.println(p2.getName());
		System.out.println(p2.getAge());

	}

}
