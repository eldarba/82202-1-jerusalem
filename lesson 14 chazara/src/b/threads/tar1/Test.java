package b.threads.tar1;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		CounterThread t = new CounterThread();
		t.start();
		Thread.sleep(5_500);
		t.interrupt();

	}

}
