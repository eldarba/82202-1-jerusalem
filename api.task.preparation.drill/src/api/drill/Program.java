package api.drill;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Program {

	private Scanner sc = new Scanner(System.in);
	private int nextTaskId = 1;
	private Schedualler schedualler = new Schedualler();

	public static void main(String[] args) {
		Program program = new Program();
		program.start();
	}

	public void start() {

		lbl: while (true) {
			showMenu();
			String command = sc.nextLine();

			try {

				switch (command) {
				case "start":
					if (!this.schedualler.isMonitoringActive()) {
						this.schedualler.sartMonitoringTasks();
						try {
							Thread.sleep(5);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else {
						System.out.println("schedualler already running");
					}
					break;
				case "stop":
					this.sc.close();
					this.schedualler.stopMonitoringTasks();
					break lbl;
				case "add":
					Task task = getTaskFromUser();
					schedualler.addTask(task);
					System.out.println("addded: " + task);
					break;
				case "show":
					this.schedualler.displayTasks();
					break;
				case "do":
					System.out.print("enter task id to do: ");
					int taskId = Integer.parseInt(sc.nextLine());
					Task taskToDo = this.schedualler.getTask(taskId);
					if (taskToDo != null) {
						taskToDo.doTask();
						System.out.println("task done");
					}
					break;

				default:
					System.out.println("invalid command: " + command);
					break;
				}
			} catch (Exception e) {
				System.out.println("ERROR: " + e.getMessage());
			}

		}

		System.out.println("Bye!");
	}

	private static void showMenu() {
		System.out.println("\nMENU");

		System.out.println("start task schedualler .............. start");
		System.out.println("stop task schedualler ............... stop");
		System.out.println("add task ............................ add");
		System.out.println("show task ........................... show");
		System.out.println("do task ............................. do");
		System.out.print("your choice: ");

	}

	public Task getTaskFromUser() {
		int id = nextTaskId++;
		System.out.print("enter task description: ");
		String description = sc.nextLine();
		System.out.print("enter hour: ");
		int hour = Integer.parseInt(sc.nextLine());
		System.out.print("enter minute: ");
		int minute = Integer.parseInt(sc.nextLine());
		System.out.print("enter second: ");
		int second = Integer.parseInt(sc.nextLine());
		LocalDateTime deadline = LocalDateTime.of(LocalDate.now(), LocalTime.of(hour, minute, second));
		Task task = new Task(id, description, deadline);
		return task;
	}
}
