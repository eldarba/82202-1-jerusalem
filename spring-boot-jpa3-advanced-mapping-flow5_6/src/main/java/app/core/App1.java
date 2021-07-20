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
		// create 3 universities
		{
			University brIlan = new University(0, "Bar Ilan", "Ramat Gan");
			University ivrit = new University(0, "HaIvrit", "Jerusalem");
			University benGurion = new University(0, "Ben Gurion", "Beer Sheva");

//			brIlan.set

			em.persist(brIlan);
			em.persist(ivrit);
			em.persist(benGurion);
		}

		{// add 2 students to Ivrit
			// get the university
			University u = em.find(University.class, 1);
			// create the students and set the university
			Student st1 = new Student(0, "Ron", u);
			Student st2 = new Student(0, "John", u);
			Student st3 = new Student(0, "Don", u);
			// save the students
			em.persist(st1);
			em.persist(st2);
			em.persist(st3);
		}

//		{// remove student with id 3
//			Student st = em.find(Student.class, 3);
//			em.remove(st);
//		}

		{// remove Bar Illan university
			// find all bar illan students
			TypedQuery<Student> query = em.createQuery("from Student as s where s.university.id=1", Student.class);
			List<Student> students = query.getResultList();
			// set the students university to null
			for (Student student : students) {
				student.setUniversity(null);
			}
			// delete the university
			em.remove(em.find(University.class, 1));

		}

		em.getTransaction().commit();
	}

}
