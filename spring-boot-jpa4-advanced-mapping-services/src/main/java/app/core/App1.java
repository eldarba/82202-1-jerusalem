package app.core;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import app.core.entities.Coupon;
import app.core.entities.Customer;
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
//		em.getTransaction().commit();
	}

}
