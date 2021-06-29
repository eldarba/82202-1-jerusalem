package b.calculator;

import java.time.LocalTime;

public class TimeThread extends Thread {

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(5_000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(LocalTime.now());
		}
	}

}
