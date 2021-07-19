package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import app.core.entities.Company;
import app.core.entities.CompanyAddress;

@SpringBootApplication
public class App2 {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(App2.class, args);

		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();

		System.out.println("=============================");
		Company c1 = em.find(Company.class, 1);
		System.out.println(c1);
		System.out.println(c1.getAddress());
		em.remove(c1);
		System.out.println("=============================");

		em.getTransaction().commit();

	}

}
