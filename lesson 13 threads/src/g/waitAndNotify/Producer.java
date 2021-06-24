package g.waitAndNotify;

public class Producer extends Thread {

	private Stack stack;
	private int elementsToProduce;
	private int sleepTime;

	public Producer(Stack stack, int elementsToProduce, int sleepTime) {
		super();
		this.stack = stack;
		this.elementsToProduce = elementsToProduce;
		this.sleepTime = sleepTime;
	}

	@Override
	public void run() {
		for (int i = 0; i < elementsToProduce; i++) {
			// create a random number
			int r = (int) (Math.random() * 101);
			// push the number to the stuck
			this.stack.push(r);
			// print a message
			System.out.println(stack);
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
