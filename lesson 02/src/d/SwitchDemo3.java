package d;

public class SwitchDemo3 {

	public static void main(String[] args) {

		int grade = (int) (Math.random() * 11);
		System.out.println(grade);

		switch (grade) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Fail");
			break;
		case 6:
			System.out.println("pass");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("good");
			break;
		case 10:
			System.out.println("excelent");
			break;
		}

	}

}
