package app.core;

public class Member extends Person {

	private double monthlyPayment;

	public Member(int id, String name, int age, Address address, double monthlyPayment) {
		super(id, name, age, address);
		this.monthlyPayment = monthlyPayment;
	}

	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

}
