package app.core.stats;

import app.core.Classroom;
import app.core.Gym;
import app.core.Member;
import app.core.Trainer;
import app.core.Type;

public class GymStatistics {

	public static double getGymMonthlyIncome(Gym gym) {
		double sum = 0;
		Classroom[] classrooms = gym.getClassrooms();
		for (Classroom classroom : classrooms) {
			if (classroom != null) {
				Member[] members = classroom.getMembers();
				for (Member member : members) {
					if (member != null) {
						sum += member.getMonthlyPayment();
					}
				}
			}
		}
		return sum;
	}

	public static void printClassesIncomeInfo(Gym gym) {
		Classroom[] classrooms = gym.getClassrooms();
		for (Classroom classroom : classrooms) {
			double sum = 0;
			if (classroom != null) {
				Member[] members = classroom.getMembers();
				for (Member member : members) {
					if (member != null) {
						sum += member.getMonthlyPayment();
					}
				}
				System.out.println("classroom id " + classroom.getId() + " monthly income:\t" + sum);
			}
		}
	}

	public static double getGymMonthlyExpense(Gym gym) {
		double sum = 0;
		Classroom[] classrooms = gym.getClassrooms();
		for (Classroom classroom : classrooms) {
			if (classroom != null) {
				Trainer trainer = classroom.getTrainer();
				if (trainer != null) {
					sum += trainer.getMonthlyIncome();
				}
			}
		}
		return sum;
	}

	public static int memberCount(Gym gym) {
		int count = 0;
		for (Classroom classroom : gym.getClassrooms()) {
			if (classroom != null) {
				for (Member member : classroom.getMembers()) {
					if (member != null) {
						count++;
					}
				}
			}
		}
		return count;
	}

	public static int memberCount(Gym gym, Type type) {
		int count = 0;
		for (Classroom classroom : gym.getClassrooms()) {
			if (classroom != null && classroom.getType() == type) {
				for (Member member : classroom.getMembers()) {
					if (member != null) {
						count++;
					}
				}
			}
		}
		return count;
	}
}
