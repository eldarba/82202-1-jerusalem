package a.collections;

import java.util.ArrayList;
import java.util.List;

public class CarFleet {

	private List<Car> cars = new ArrayList<Car>();

	{
		for (int i = 101; i <= 110; i++) {
			cars.add(new Car(i));
		}
	}

	public void startCar(int carNumber, int seconds) {
		// check that the car is in the fleet
		if (this.cars.contains(new Car(carNumber))) {
			// find the car
			int index = cars.indexOf(new Car(carNumber));
			// get a reference to the car from the fleet
			Car car = cars.get(index);
			car.drive(seconds);
		}
	}

	public void printAllCars() {
		System.out.println("=== All Cars =======");
		for (Car car : cars) {
			System.out.println(car);
		}
		System.out.println("====================");
	}

	public void printAllDrivingCars() {
		System.out.println("=== All Driving Cars =======");
		for (Car car : cars) {
			if (car.isDriving()) {
				System.out.println(car);
			}
		}
		System.out.println("====================");
	}
}
