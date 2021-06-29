package a;

public class Demo1 {

	public static void main(String[] args) {

		System.out.println("Hello");
		// get a reference to the currently running thread
		Thread mainThread = Thread.currentThread();
		// print the thread's name
		System.out.println(mainThread.getName());

		try { // make the thread sleep
			System.out.println("thread will sleep for 3 seconds");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("thread woke up");

	}

}
