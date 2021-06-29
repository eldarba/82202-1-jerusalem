package a.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import b.threads.CarDriveStopperThread;

public class Car {

	public static final int MAX_PASSANGERS = 5;
	private int number;
	private boolean isDriving;
	private Set<Person> passangers;

	public Car(int number) {
		super();
		this.number = number;
	}

	public void drive(int seconds) {
		if (this.isDriving) {
			throw new CarException(this + " is already moving");
		} else {
			new Thread(new CarDriveStopperThread(this, seconds)).start();
		}
	}

	public void addPassanger(Person passanger) {
		if (this.passangers == null) {
			this.passangers = new HashSet<>();
		}
		if (this.passangers.size() == MAX_PASSANGERS) {
			throw new CarException("car is full");
		} else if (this.passangers.contains(passanger)) {
			throw new CarException(passanger + " alrady in this car");
		} else {
			this.passangers.add(passanger);
		}
	}

	public Set<Person> getPassangers() {
		return passangers;
	}

	public void removePassanger(int passangerId) throws CarException {
		Person p = new Person(passangerId);
		if (this.passangers.contains(p)) {
			this.passangers.remove(p);
		} else {
			throw new CarException("passanger with id " + passangerId + " not found");
		}
	}

	public int getNumber() {
		return number;
	}

	public boolean isDriving() {
		return isDriving;
	}

	public void setDriving(boolean isDriving) {
		this.isDriving = isDriving;
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", isDriving=" + isDriving + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Car)) {
			return false;
		}
		Car other = (Car) obj;
		return number == other.number;
	}

}
