package a.exceptions;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		try {
			car.setSpeed(95);
			car.speadUp();
			car.speadUp();
			car.speadUp();
			car.speadUp();
			car.speadUp();
			car.speadUp();
		} catch (SpeedException e) {
			e.printStackTrace();
		}
		System.out.println(car);
	}

}
