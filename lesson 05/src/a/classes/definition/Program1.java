package a.classes.definition;

public class Program1 {

	public static void main(String[] args) {

		System.out.println("=== start");
		Person p1 = new Person();
		p1.name = "Dor";
		p1.speak();

		// print the person's age
		System.out.println("age: " + p1.getAge());
		// set the person's age and print again
		p1.setAge(25);
		System.out.println("age: " + p1.getAge());
		p1.setAge(2500);
		System.out.println("age: " + p1.getAge());

		System.out.println("=== stop");

	}

}
