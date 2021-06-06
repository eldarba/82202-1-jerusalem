package d;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter mode: [ON, OFF, STNAD_BY]");
		String machineMode = sc.nextLine();
		sc.close();
		
		switch (machineMode) {
		case "ON":
			System.out.println("the machine is working");
			break;
		case "OFF":
			System.out.println("the machine is NOT working");
			break;
		case "STNAD_BY":
			System.out.println("the machine in standby node");
			break;
		default:
			System.out.println("the mode " + machineMode + " is not valid");
			break;
		} 
	}

}
