package app.core.types;

import org.springframework.stereotype.Component;

@Component
public class Classroom {

	private Teacher teacher;

	public Classroom(Teacher teacher) {
		super();
		this.teacher = teacher;
	}

	public void start() {
		System.out.println(this.teacher.teach());
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
