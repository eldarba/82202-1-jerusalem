package app.core.stats;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import app.core.Address;
import app.core.Address.City;
import app.core.Classroom;
import app.core.Gym;
import app.core.Member;
import app.core.Trainer;
import app.core.Type;

public class GymUtil {

	public static Address getRandomAddress() {
		City city = City.values()[(int) (Math.random() * City.values().length)];
		String street = "street-" + (int) (Math.random() * 101);
		int homeNumber = getRandomInt(1, 100);
		Address address = new Address(city, street, homeNumber);
		return address;
	}

	public static Type getRandomType() {
		return Type.values()[(int) (Math.random() * Type.values().length)];
	}

	public static Member getRandomMember() {
		int id = getRandomInt(0, 99999);
		String name = "Member-" + id;
		int age = getRandomInt(13, 120);
		Address address = getRandomAddress();
		double monthlyPayment = getRandomInt(400, 800);
		Member member = new Member(id, name, age, address, monthlyPayment);
		return member;
	}

	public static Trainer getRandomTrainer() {
		int id = getRandomInt(0, 99999);
		String name = "Member-" + id;
		int age = getRandomInt(19, 85);
		Address address = getRandomAddress();
		double monthlyIncome = getRandomInt(1_500, 3_000);
		Trainer trainer = new Trainer(id, name, age, address, monthlyIncome);
		return trainer;
	}

	public static Classroom gerRandomClassroom() {
		int id = getRandomInt(0, 99999);
		Type type = getRandomType();
		Trainer trainer = getRandomTrainer();
		Classroom classroom = new Classroom(id, type, trainer);
		Member[] members = new Member[Classroom.SIZE];
		for (int i = 0; i < members.length; i++) {
			members[i] = getRandomMember();
		}
		classroom.setMembers(members);
		return classroom;
	}

	public static Gym getRandomGym() {
		Gym gym = new Gym();
		Classroom[] classrooms = new Classroom[Gym.SIZE];
		for (int i = 0; i < classrooms.length; i++) {
			classrooms[i] = gerRandomClassroom();
		}
		gym.setClassrooms(classrooms);
		return gym;
	}

	private static int getRandomInt(int min, int max) {
		return (int) (Math.random() * (max - min + 1)) + min;
	}

	public static void main(String[] args) {

		Gym gym = getRandomGym();

		GymStatistics.printClassesIncomeInfo(gym);
		System.out.println("Gym Monthly income:\t" + GymStatistics.getGymMonthlyIncome(gym));
		System.out.println("Gym Monthly expense:\t" + GymStatistics.getGymMonthlyExpense(gym));
		System.out.println("Gym Total Members Count: " + GymStatistics.memberCount(gym));

		// === BONUS === BONUS === BONUS === BONUS === BONUS === BONUS === BONUS ===
		// this part is using a combo box to see number of members at a specified sport
		// type. You can run it and see how it works. This is not part of this course
		{
//			JComboBox<Type> comboBox = new JComboBox<Type>(Type.values());
//			comboBox.setEditable(true);
//			JOptionPane.showMessageDialog(null, comboBox, "enter sport type", JOptionPane.QUESTION_MESSAGE);
//			Type type = (Type) comboBox.getSelectedItem();
//			String message = "There are " + GymStatistics.memberCount(gym, type) + " members at " + type;
//			JOptionPane.showMessageDialog(null, message);
		}
		// === BONUS === BONUS === BONUS === BONUS === BONUS === BONUS === BONUS ===

	}

}
