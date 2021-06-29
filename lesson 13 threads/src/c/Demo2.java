package c;

public class Demo2 {

	public static void main(String[] args) {

		MyRunnable r = new MyRunnable(); // create a runnable
		Thread t1 = new Thread(r); // give the runnable to the thread
		Thread t2 = new Thread(r, "t2");
		t1.start();
		t2.start();

	}

}
