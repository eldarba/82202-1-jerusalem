package a.exceptions;

public class Car {

	private int speed;
	public static final int MAX_SPEED = 100;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) throws SpeedException {
		if (speed <= MAX_SPEED) {
			this.speed = speed;
		} else {
			throw new SpeedException("speed to high");
		}
	}

	public void speadUp() throws SpeedException {
		System.out.println("going faster");
		setSpeed(speed + 1);
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + "]";
	}

}
