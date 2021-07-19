package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import app.core.entities.Company;
import app.core.entities.CompanyAddress;

@SpringBootApplication
public class App3 {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(App3.class, args);

		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();

		System.out.println("=============================");
		CompanyAddress address = em.find(CompanyAddress.class, 4);
		System.out.println(address);
		address.getCompany().setAddress(null);
		em.remove(address);
		System.out.println("=============================");

		em.getTransaction().commit();

	}

}
