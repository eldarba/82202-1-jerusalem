package a.collections;

public class CarTest {

	public static void main(String[] args) {

		Car car = new Car(101);
//			car = null;
		car.addPassanger(new Person(101, "aaa", 25));
		try {
			car.addPassanger(new Person(102, "bbb", 33));
			car.addPassanger(new Person(103, "ccc", 88));
			car.addPassanger(new Person(103, "ccc", 88));
//		car.addPassanger(new Person(104, "ccc", 88));
//		car.addPassanger(new Person(105, "ccc", 88));
//		car.addPassanger(new Person(106, "ccc", 88));
			System.out.println(car.getPassangers());
			car.removePassanger(102);
			System.out.println(car.getPassangers());
		} catch (CarException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
