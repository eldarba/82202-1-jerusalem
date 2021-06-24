package c;

public class Demo1 {

	public static void main(String[] args) {

		MyThread t1 = new MyThread("t1");
		MyThread t2 = new MyThread("t2");
		t1.start();
		t2.start();

		// main continue to run immediately
		for (int i = 100; i < 110; i++) {
			System.out.println("\t" + Thread.currentThread().getName() + ": " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
