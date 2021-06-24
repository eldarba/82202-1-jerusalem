package b.calculator;

import java.util.Scanner;

public class CalculatorUI {

	private Calculator calculator = new Calculator();
	private Scanner sc = new Scanner(System.in);
	private boolean exit;

	public static void main(String[] args) {

		CalculatorUI ui = new CalculatorUI();
		ui.startUi();
	}

	public void startUi() {
		while (!exit) {
			printMenu();
			String command = sc.nextLine();
			switch (command) {
			case "=":
				System.out.println(calculator.getCurrentResult());
				break;
			case "+":
				doAdd();
				break;
			case "-":
				doSub();
				break;
			case "*":
				doMul();
				break;
			case "/":
				doDiv();
				break;
			case "c":
				calculator.reset();
				break;
			case "x":
				this.exit = true;
				break;

			default:
				System.out.println("the command " + command + " is not valid");

			}
		}

		this.sc.close();
		System.out.println("Bye");
	}

	private void doAdd() {
		System.out.print("enter value to add: ");
		double val = Double.parseDouble(sc.nextLine());
		calculator.add(val);
		System.out.println("done");
	}

	private void doSub() {
		System.out.print("enter value to subtract: ");
		double val = Double.parseDouble(sc.nextLine());
		calculator.sub(val);
		System.out.println("done");
	}

	private void doMul() {
		System.out.print("enter value to multiply by: ");
		double val = Double.parseDouble(sc.nextLine());
		calculator.mul(val);
		System.out.println("done");
	}

	private void doDiv() {
		System.out.print("enter value to divide by: ");
		double val = Double.parseDouble(sc.nextLine());
		calculator.div(val);
		System.out.println("done");
	}

	private void printMenu() {
		System.out.println();
		System.out.println("===== calculator menu ========");
		System.out.println("Result .............. =");
		System.out.println("Add ................. +");
		System.out.println("Subtract ............ -");
		System.out.println("Multiply ............ *");
		System.out.println("Divide .............. /");
		System.out.println("Clear ............... c");
		System.out.println("Exit ......... ...... x");
		System.out.println("==============================");
		System.out.print("enter your choice: ");
	}

}
