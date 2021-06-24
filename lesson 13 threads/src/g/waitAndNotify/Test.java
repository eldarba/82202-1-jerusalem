package g.waitAndNotify;

public class Test {

	public static void main(String[] args) {
		Stack stack = new Stack();
		Producer p1 = new Producer(stack, 25, 150);
		p1.start();

	}

}
