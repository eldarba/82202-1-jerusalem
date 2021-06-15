package c;

import c.State.Citizen;

public class StateApp {

	public static void main(String[] args) {

		State isr = new State("Israel", 5555);
		State fra = new State("France", 6666);

		Citizen c1 = isr.new Citizen("David");
		Citizen c2 = isr.new Citizen("Liora");
		Citizen c3 = isr.new Citizen("Miri");
		Citizen c4 = fra.new Citizen("Pier");
		Citizen c5 = fra.new Citizen("Jean");

		Citizen[] citizens = { c1, c2, c3, c4, c5 };

		for (Citizen c : citizens) {
			System.out.println(c + " state: " + c.getStateName());
		}

		System.out.println("Israel population: " + isr.getPopulation());
		System.out.println("France population: " + fra.getPopulation());
		System.out.println("World population: " + State.getWorldPopulation());

	}

}
