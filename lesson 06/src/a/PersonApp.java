package a;

public class PersonApp {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person(101);
		Person p3 = new Person(102, "Moshe");
		Person p4 = new Person(103, "Lea", 27);

		p1.print();
		p2.print();
		p3.print();
		p4.print();

	}

}
