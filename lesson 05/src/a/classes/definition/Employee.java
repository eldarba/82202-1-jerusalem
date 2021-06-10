package a.classes.definition;

public class Employee extends Person {

	private double salary;

	public Employee() {
	}

	public Employee(int id, String name, int age, double salary) {
		// call a CTOR in the super class
		super(id, name, age);
		this.salary = salary;
	}

	public Employee(int id, String name, double salary) {
		// call a CTOR in this class
		this(id, name, 0, salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
