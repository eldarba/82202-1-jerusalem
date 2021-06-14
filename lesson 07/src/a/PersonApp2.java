package a;

public class PersonApp2 {

	public static void main(String[] args) {

		Person p1 = new Person(101, "Jakob", 20);

		System.out.println(p1);

		p1 = null;

		System.gc();

		p1 = new Person(102, "Hanna", 22);
		System.out.println(p1);
	}

}
