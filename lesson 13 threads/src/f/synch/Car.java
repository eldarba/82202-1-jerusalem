package f.synch;

public class Car {

	private int number;
	private int km;
	private Object key = new Object();

	public Car(int number) {
		super();
		this.number = number;
	}

	// the following method is a critical section
	// only one thread at a time is allowed
	public synchronized void drive(int distance) {
		Thread driver = Thread.currentThread();
		System.out.print(driver.getName() + " statrted at " + km + " with car number " + number);
		System.out.println(" for a distance of " + distance);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		km += distance;
		System.out.println(driver.getName() + " finished at " + km + " with car number " + number);
	}

	public void drive2(int distance) {
		// non critical
		System.out.println("aaaaaaaaaaaaaa");
		System.out.println("bbbbbbbbbb");
		System.out.println("cccccccccccccc");
		//

		synchronized (key) {
			Thread driver = Thread.currentThread();
			System.out.print(driver.getName() + " statrted at " + km + " with car number " + number);
			System.out.println(" for a distance of " + distance);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			km += distance;
			System.out.println(driver.getName() + " finished at " + km + " with car number " + number);

			// non critical
			System.out.println("aaaaaaaaaaaaaa");
			System.out.println("bbbbbbbbbb");
			System.out.println("cccccccccccccc");
			//
		}
	}

}
