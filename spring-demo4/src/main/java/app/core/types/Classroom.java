package app.core.types;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Classroom {

	private Teacher teacher;

	@Autowired
	public Classroom(Teacher teacher) {
		super();
		this.teacher = teacher;
	}

	public void start() {
		System.out.println(this.teacher.teach());
	}

}
