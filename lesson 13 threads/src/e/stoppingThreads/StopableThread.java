package e.stoppingThreads;

public class StopableThread extends Thread {

	public StopableThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + ": " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(getName() + " interrupted and is going to stop");
				return;
			}
		}

	}
}
