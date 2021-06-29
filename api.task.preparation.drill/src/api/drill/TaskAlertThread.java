package api.drill;

import java.time.LocalDateTime;
import java.util.List;

public class TaskAlertThread extends Thread {

	private Schedualler schedualler;
	private boolean quit;

	public TaskAlertThread(Schedualler schedualler) {
		super();
		this.schedualler = schedualler;
	}

	@Override
	public void run() {
		System.out.println("TaskAlertThread started");
		while (!quit) {
			try {
				Thread.sleep(1000);
				List<Task> tasks = this.schedualler.getAllTasksDueUntil(LocalDateTime.now());
				for (Task task : tasks) {
					if (!task.isAlertPopped()) {
						System.out.println("!!! DEADLINE ALERT - " + task);
						task.setAlertPopped(true);
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("TaskAlertThread stopped");
	}

	public void setQuit(boolean quit) {
		this.quit = quit;
	}

}
