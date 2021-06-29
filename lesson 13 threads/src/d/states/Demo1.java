package d.states;

import c.MyThread;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread("t");
		System.out.println("thread state: " + t.getState());
		t.start();
		System.out.println("thread state: " + t.getState());

		Thread.sleep(10);
		System.out.println("thread state: " + t.getState());

		t.join(); // stop current thread (main) until t is terminated
		System.out.println("thread state: " + t.getState());

	}

}
