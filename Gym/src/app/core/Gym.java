package app.core;

public class Gym {
	public static final int SIZE = 5;
	private Classroom[] classrooms = new Classroom[SIZE];

	public Classroom[] getClassrooms() {
		return classrooms;
	}

	public void setClassrooms(Classroom[] classrooms) {
		this.classrooms = classrooms;
	}

}
