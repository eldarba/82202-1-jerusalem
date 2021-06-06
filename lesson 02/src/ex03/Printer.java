package ex03;

public class Printer {

	public static void main(String[] args) {
		
		String part1 = "There will be ";
		int visitors = 5;
		String part2 = " people for dinner.";
		
		System.out.println(part1 + visitors + part2);
		System.out.println(part1 + (visitors + 2) + part2);

	}

}
