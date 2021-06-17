package app.core;

public class Trainer extends Person {

	private double monthlyIncome;

	public Trainer(int id, String name, int age, Address address, double monthlyPayment) {
		super(id, name, age, address);
		this.monthlyIncome = monthlyPayment;
	}

	public double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

}
