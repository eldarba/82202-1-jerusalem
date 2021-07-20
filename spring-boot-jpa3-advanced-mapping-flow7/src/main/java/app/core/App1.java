package app.core;

import java.util.List;
import java.util.Scanner;

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

//		// we need an entity manager that comes from a factory
//		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
//		EntityManager em = factory.createEntityManager();
//
//		em.getTransaction().begin();
//		// create 3 universities with students
////		{
////			University brIlan = new University(0, "Bar Ilan", "Ramat Gan");
////			University ivrit = new University(0, "HaIvrit", "Jerusalem");
////			University benGurion = new University(0, "Ben Gurion", "Beer Sheva");
////			brIlan.addStudent(new Student(0, "aaa"));
////			brIlan.addStudent(new Student(0, "bbb"));
////			brIlan.addStudent(new Student(0, "ccc"));
////			ivrit.addStudent(new Student(0, "ddd"));
////			ivrit.addStudent(new Student(0, "eee"));
////			ivrit.addStudent(new Student(0, "fff"));
////			benGurion.addStudent(new Student(0, "ggg"));
////			benGurion.addStudent(new Student(0, "hhh"));
////			benGurion.addStudent(new Student(0, "iii"));
////			em.persist(brIlan);
////			em.persist(ivrit);
////			em.persist(benGurion);
////		}
//
//		{ // find university and print it and all its students
//			Scanner sc = new Scanner(System.in);
//			System.out.print("choose university: ");
//			int id = Integer.parseInt(sc.nextLine());
//			University u = em.find(University.class, id);
//			System.out.println(u != null ? u : "not found");
//			if (u != null) {
//				System.out.println("========== students ==============");
//				for (Student s : u.getStudents()) {
//					System.out.println(s);
//				}
//				System.out.println("========== ======== ==============");
//
//				System.out.println("do you wand to add a student? y/n");
//				String input = sc.nextLine();
//				if (input.equalsIgnoreCase("y")) {
//					System.out.print("enter student name: ");
//					String name = sc.nextLine();
//					Student st = new Student(0, name);
//					u.addStudent(st);
//				}
//			}
//			sc.close();
//		}
//
//		em.getTransaction().commit();
	}

}
