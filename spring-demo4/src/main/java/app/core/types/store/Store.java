package app.core.types.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Store {

	@Value("${store.address.city: FallbackValue}")
	private String city;
	@Value("${store.address.street}")
	private String street;
	@Value("${store.address.number}")
	private int number;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Store [city=" + city + ", street=" + street + ", number=" + number + "]";
	}

}
