package app.core.types.targil;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class HelloBean extends Thread {

	@Override
	public void run() {
		while (true) {
			int r = (int) (Math.random() * 101);
			System.out.println("Hello: " + r);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				break;
			}
		}
	}

	@PostConstruct
	public void startTheThread() {
		start();
	}

	@PreDestroy
	public void stopTheThread() {
		interrupt();
	}

}
