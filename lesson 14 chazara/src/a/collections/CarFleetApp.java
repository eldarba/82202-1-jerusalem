package a.collections;

public class CarFleetApp {

	private CarFleet fleet = new CarFleet();

	public static void main(String[] args) throws InterruptedException {

		// create a fleet of cars
		CarFleetApp app = new CarFleetApp();
		// print all cars
		app.fleet.printAllCars();

		// start 2 cars - the waiting time will take place in a seperate thread
		app.fleet.startCar(102, 10);
		app.fleet.startCar(103, 5);

		// print all driving cars
		app.fleet.printAllDrivingCars();

		System.out.println("Bye");

	}

}
