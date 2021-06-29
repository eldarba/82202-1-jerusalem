package c;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// get a reference to the current thread so we can call methods
		Thread currentThread = Thread.currentThread();

		for (int i = 0; i < 10; i++) {
			System.out.println(currentThread.getName() + ": " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
