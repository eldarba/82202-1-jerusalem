package a.collections;

public class TestEqualsVsCompareTo {

	public static void main(String[] args) {
		Person p1 = new Person(101, "aaa", 25);
		Person p2 = new Person(101, "aaa", 25);
		Person p3 = new Person(102, "aaa", 25);

		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));

		System.out.println(p1.compareTo(p3));
		System.out.println(p1.compareTo(p2));
		System.out.println(p3.compareTo(p1));
	}

}
