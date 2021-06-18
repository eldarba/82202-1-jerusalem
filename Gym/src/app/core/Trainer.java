package app.core;

public class Trainer extends Person {

	private double monthlyIncome;

	public Trainer(int id, String name, int age, Address address, double monthlyIncome) {
		super(id, name, age, address);
		this.monthlyIncome = monthlyIncome;
	}

	public double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

}
