package a;

public class PersonApp {

	public static void main(String[] args) {

		Person p1 = new Person(101, "Jakob", 20);
		Person p2 = new Person(101, "Yakov", 25);

		System.out.println(p1);
		System.out.println(p2);

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		System.out.println(p1.equals(p2));

	}

}
