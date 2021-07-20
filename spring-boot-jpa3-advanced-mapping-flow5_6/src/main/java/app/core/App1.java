package app.core;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import app.core.entities.Student;
import app.core.entities.University;

@SpringBootApplication
public class App1 {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(App1.class, args);

		// we need an entity manager that comes from a factory
		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		// create 3 universities with students
		{
			University brIlan = new University(0, "Bar Ilan", "Ramat Gan");
			University ivrit = new University(0, "HaIvrit", "Jerusalem");
			University benGurion = new University(0, "Ben Gurion", "Beer Sheva");
			brIlan.addStudent(new Student(0, "aaa"));
			brIlan.addStudent(new Student(0, "bbb"));
			brIlan.addStudent(new Student(0, "ccc"));
			ivrit.addStudent(new Student(0, "ddd"));
			ivrit.addStudent(new Student(0, "eee"));
			ivrit.addStudent(new Student(0, "fff"));
			benGurion.addStudent(new Student(0, "ggg"));
			benGurion.addStudent(new Student(0, "hhh"));
			benGurion.addStudent(new Student(0, "iii"));
			em.persist(brIlan);
			em.persist(ivrit);
			em.persist(benGurion);
		}

		em.getTransaction().commit();
	}

}
