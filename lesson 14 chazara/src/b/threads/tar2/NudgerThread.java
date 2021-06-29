package b.threads.tar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NudgerThread extends Thread {

	@Override
	public void run() {
		try (Scanner sc = new Scanner(new File("files/nudgeTime"));) {
			long sleepTime = sc.nextLong() * 1000;
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		System.out.println();
		while (true) {
			System.out.println("Nooo...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
