package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.types.Classroom;

public class App1 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("app.core")) {

			Classroom classroom = ctx.getBean("classroom", Classroom.class);
			classroom.start();

			Classroom mathClassroom = ctx.getBean("mathClassroom", Classroom.class);
			mathClassroom.start();

			Classroom englishClassroom = ctx.getBean("englishClassroom", Classroom.class);
			englishClassroom.start();

			Classroom mathClassroom2 = ctx.getBean("mathClassroom2", Classroom.class);
			mathClassroom2.start();
		}

	}

}
