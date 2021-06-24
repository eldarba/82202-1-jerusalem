package g.waitAndNotify;

import java.util.ArrayList;
import java.util.List;

public class Stack {

	private List<Integer> stack = new ArrayList<>();
	public static final int MAX = 10;

	public synchronized void push(int n) {
		while (stack.size() == MAX) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stack.add(n);
		notify();
	}

	public synchronized int pop() {
		while (stack.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notify();
		return stack.get(stack.size() - 1);
	}

	@Override
	public String toString() {
		return "Stack [stack=" + stack + "]";
	}

}
