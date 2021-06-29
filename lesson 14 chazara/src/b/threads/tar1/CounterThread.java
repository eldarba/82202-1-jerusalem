package b.threads.tar1;

public class CounterThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("I was interrupted");
				for (int j = i; j > 0; j--) {
					System.out.println(j);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
				break;
			}
		}
	}

}
