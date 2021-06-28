package b.threads.tar1;

public class CounterThreadNoSleep extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10_000; i++) {
			System.out.println(i);
			if (this.isInterrupted()) { // check if this thread was interrupted
				System.out.println(this.getName() + " was interrupted");
				break;
			}
		}
	}

}
