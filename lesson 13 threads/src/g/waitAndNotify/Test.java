package g.waitAndNotify;

public class Test {

	public static void main(String[] args) {
		Stack stack = new Stack();
		Producer p1 = new Producer(stack, 25, 150);
		Producer p2 = new Producer(stack, 25, 200);
		Consumer c1 = new Consumer(stack, 20, 1000);
		Consumer c2 = new Consumer(stack, 30, 100);
		p1.start();
		p2.start();
		c1.start();
		c2.start();

	}

}
