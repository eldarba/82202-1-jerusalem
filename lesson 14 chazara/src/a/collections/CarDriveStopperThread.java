package a.collections;

public class CarDriveStopperThread extends Thread {

	private Car car;
	private int secondsToWait;

	public CarDriveStopperThread(Car car, int secondsToWait) {
		super();
		this.car = car;
		this.secondsToWait = secondsToWait;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(secondsToWait * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		car.setDriving(false);
		System.out.println(car + " has stopped");
	}

}
