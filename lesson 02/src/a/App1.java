package a;

public class App1 {

	public static void main(String[] args) {
		
		
		// create the objects
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		// set object state
		p1.id = 101;
		p1.name = "Dan";
		p1.age = 25;
		
		p2.id = 102;
		p2.name = "Rina";
		p2.age = 27;
		
		// access object state
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		
		

	}

}
