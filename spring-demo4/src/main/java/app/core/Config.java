package app.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import app.core.types.Classroom;
import app.core.types.MathTeacher;
import app.core.types.Teacher;

@Configuration
@ComponentScan
public class Config {

	@Bean
	public Classroom mathClassroom() {
		Classroom classroom = new Classroom(new MathTeacher());
		return classroom;
	}

	@Bean
	public Classroom englishClassroom(Teacher teacher) {
		Classroom classroom = new Classroom(teacher);
		return classroom;
	}

	@Bean
	public Classroom mathClassroom2(@Qualifier("mathTeacher") Teacher teacher) {
		Classroom classroom = new Classroom(teacher);
		return classroom;
	}

}
