package app.core.types;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EnglishTeacher extends Teacher {

	@Override
	public String teach() {
		return "This is an English lesson";
	}

}
