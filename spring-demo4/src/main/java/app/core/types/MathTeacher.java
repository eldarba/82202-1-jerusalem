package app.core.types;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher extends Teacher {

	@Override
	public String teach() {
		return "first lesson: 1 + 1 = 2";
	}

}
