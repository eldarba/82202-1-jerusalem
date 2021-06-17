package app.core;

public class Address {

	private City city;
	private String street;
	private int homeNumber;

	public Address(City city, String street, int homeNumber) {
		super();
		this.city = city;
		this.street = street;
		this.homeNumber = homeNumber;
	}

	public enum City {
		TEL_AVIV, JERUSALEM, HAIFA, BEER_SHEVE;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(int homeNumber) {
		this.homeNumber = homeNumber;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", homeNumber=" + homeNumber + "]";
	}

}
