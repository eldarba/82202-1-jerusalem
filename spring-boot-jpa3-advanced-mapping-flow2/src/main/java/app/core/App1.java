package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import app.core.entities.Company;
import app.core.entities.CompanyAddress;

@SpringBootApplication
public class App1 {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(App1.class, args);

		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		CompanyAddress address1 = new CompanyAddress(0, "Jer", "IL");
		Company company1 = new Company(0, "AAA", "aaa@mail");
		company1.setAddress(address1);

		CompanyAddress address2 = new CompanyAddress(0, "TLV", "IL");
		Company company2 = new Company(0, "BBB", "bbb@mail");
		company2.setAddress(address2);

		CompanyAddress address3 = new CompanyAddress(0, "Haifa", "IL");
		Company company3 = new Company(0, "CCC", "ccc@mail");
		company3.setAddress(address3);

		em.persist(company1);
		em.persist(company2);
		em.persist(company3);

		em.getTransaction().commit();

	}

}
