package b.threads;

import a.collections.Car;

public class CarDriveStopperThread implements Runnable {

	private Car car;
	private int secondsToWait;

	public CarDriveStopperThread(Car car, int secondsToWait) {
		super();
		this.car = car;
		this.secondsToWait = secondsToWait;
	}

	@Override
	public void run() {
		car.setDriving(true); // start driving
		try {
			Thread.sleep(secondsToWait * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		car.setDriving(false); // stop driving
		System.out.println(car + " has stopped");
	}

}
