package b;

import java.util.Arrays;
import java.util.Scanner;

public class SolarSystemApp {

	public static void main(String[] args) {
		System.out.println("Choose a planet: " + Arrays.toString(Planet.values()));

		Scanner sc = new Scanner(System.in);
		Planet planet = Planet.valueOf(sc.nextLine());
		sc.close();

		System.out.println("Showing info on planet: " + planet);
		System.out.println("order from the sun: " + (planet.ordinal() + 1));
		System.out.println("mass: " + planet.mass);
		System.out.println("orbit: " + planet.getOrbit());

	}

}
