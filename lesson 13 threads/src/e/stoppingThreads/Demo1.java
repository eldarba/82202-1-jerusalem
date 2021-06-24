package e.stoppingThreads;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		StopableThread t1 = new StopableThread("t1");
		StopableThread t2 = new StopableThread("t2");
		t1.start();
		t2.start();

		Thread.sleep(3000);

		t1.interrupt();

	}

}
