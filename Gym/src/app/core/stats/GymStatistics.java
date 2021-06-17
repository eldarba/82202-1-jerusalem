package app.core.stats;

import app.core.Classroom;
import app.core.Gym;
import app.core.Member;

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

	public static void printClassesInfo(Gym gym) {
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
				System.out.println("classroom: " + classroom.getId() + " incom: " + sum);
			}
		}
	}

}
