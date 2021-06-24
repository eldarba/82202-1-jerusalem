package f.synch;

public class Test {

	public static void main(String[] args) {

		Car car = new Car(111);
		CarDriver moshe = new CarDriver("Moshe", car, 100);
		CarDriver danna = new CarDriver("Danna", car, 150);
		CarDriver a = new CarDriver("a", car, 100);
		CarDriver b = new CarDriver("b", car, 150);
		CarDriver c = new CarDriver("c", car, 100);
		CarDriver d = new CarDriver("d", car, 150);

		moshe.start();
		danna.start();
		a.start();
		b.start();
		c.start();
		d.start();

	}

}
