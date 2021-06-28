package b.threads.tar3;

public class CreditCheckThread extends Thread {

	private String credit;
	private boolean valid;

	public CreditCheckThread(String credit) {
		super();
		this.credit = credit;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(10_000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		this.valid = Math.random() < 0.5 ? true : false;
	}

	public boolean isValid() {
		return valid;
	}

}
