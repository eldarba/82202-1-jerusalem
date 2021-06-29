package api.drill;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Schedualler {

	private List<Task> tasks = new ArrayList<Task>();
	private boolean monitoringActive;
	private long checkRateMillis;
	private TaskAlertThread alertThread = new TaskAlertThread(this);

	public void addTask(Task task) {
		this.tasks.add(task);
	}

	public void removeTask(int taskId) {
		Task task = new Task(taskId, null, null);
		this.tasks.remove(task);
	}

	public void displayTasks() {
		System.out.println("Tasks ===========================");
		for (Task task : tasks) {
			System.out.println(task);
		}
		System.out.println("=================================");
	}

	public Task getTask(int taskId) {
		Task task = new Task(taskId, null, null);
		int index = tasks.indexOf(task);
		return index != -1 ? tasks.get(index) : null;
	}

	public List<Task> getAllTasks() {
		return this.tasks;
	}

	public List<Task> getAllTasksDueUntil(LocalDateTime dateTime) {
		List<Task> tasksDue = new ArrayList<Task>();
		for (Task task : tasks) {
			if (task != null && task.getDeadline().isBefore(dateTime)) {
				tasksDue.add(task);
			}
		}
		return tasksDue;
	}

	public void sartMonitoringTasks() {
		this.alertThread.start();
	}

	public void stopMonitoringTasks() {
		this.alertThread.setQuit(true);
	}

	public boolean isMonitoringActive() {
		return monitoringActive;
	}

}
