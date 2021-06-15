package c;

import c.State.Citizen;

public class StateApp {

	public static void main(String[] args) {

		State isr = new State();
		isr.setName("Israel");

		State fra = new State();
		fra.setName("France");

		Citizen c1 = isr.new Citizen();
		c1.setName("David");
		Citizen c2 = fra.new Citizen();
		c2.setName("Pier");

		System.out.println(c1.getName());
		System.out.println(c1.getStateName());

		System.out.println(c2.getName());
		System.out.println(c2.getStateName());

	}

}
