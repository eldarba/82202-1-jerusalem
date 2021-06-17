package app.core.stats;

import app.core.Address;
import app.core.Address.City;

public class GymUtil {

	public static Address getRandomAddress() {
		City city = City.values()[(int) (Math.random() * City.values().length)];
		Address address = new Address(city, "street", (int) (Math.random() * 101));
		return address;
	}

	public static void main(String[] args) {
		Address address = getRandomAddress();
		System.out.println(address);
	}

}
