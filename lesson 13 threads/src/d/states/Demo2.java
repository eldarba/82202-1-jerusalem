package d.states;

import c.MyThread;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread("t");
		t.start();

		Thread.sleep(3000);
		System.out.println("stop the thread");
		t.stop();

	}

}
