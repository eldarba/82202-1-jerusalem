package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import app.core.entities.Company;
import app.core.entities.CompanyAddress;

@SpringBootApplication
public class SpringBootJpa3AdvancedMappingApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootJpa3AdvancedMappingApplication.class,
				args);

		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = factory.createEntityManager();

//		{ // create a company
//			em.getTransaction().begin();
//			CompanyAddress companyAddress = new CompanyAddress(0, "Jerusalem", "Israel");
//			Company company = new Company(0, "AAA", "aaa@maail", companyAddress);
//			em.persist(company);
//			em.getTransaction().commit();
//		}

		{ // find a company
			System.out.println("========================");
			em.getTransaction().begin();
			Company company = em.find(Company.class, 3);
			System.out.println(company);
			System.out.println(company.getAddress());

//			company.setAddress(new CompanyAddress(0, "Tel Aviv", "Israel"));
//
//			System.out.println(company.getAddress());

			em.getTransaction().commit();
			System.out.println("========================");
		}
//		{ // delete a company
//			System.out.println("========================");
//			em.getTransaction().begin();
//			Company company = em.find(Company.class, 1);
//			if (company != null) {
//				em.remove(company);
//			}
//			em.getTransaction().commit();
//			System.out.println("========================");
//		}
//		{ // delete a company
//			System.out.println("========================");
//			em.getTransaction().begin();
//			Company company = em.find(Company.class, 3);
//			if (company != null) {
//				CompanyAddress address = company.getAddress();
//				if (address != null) {
//					System.out.println(address);
//					company.setAddress(null); // to delete the address we must remove it from the company
//					em.remove(address);
//				}
//			}
//			em.getTransaction().commit();
//			System.out.println(">>>");
//			System.out.println("========================");
//		}

	}

}
