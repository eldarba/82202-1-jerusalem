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

		// we need an entity manager that comes from a factory
		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();

//		{ // save customers with coupons
//			Coupon coupon1 = new Coupon(0, "FOOD");
//			Coupon coupon2 = new Coupon(0, "TOUR");
//			Coupon coupon3 = new Coupon(0, "CLOTHING");
//			Coupon coupon4 = new Coupon(0, "ELECTRICITY");
//
//			Customer customer1 = new Customer(0, "John", "john@mail");
//			customer1.addCoupon(coupon1);
//			customer1.addCoupon(coupon2);
//			customer1.addCoupon(coupon3);
//
//			Customer customer2 = new Customer(0, "Sarrah", "sarrah@mail");
//			customer2.addCoupon(coupon2);
//			customer2.addCoupon(coupon3);
//
//			em.persist(customer1);
//			em.persist(customer2);
//			em.persist(coupon4);
//		}

//		{ // find a customer and print all of their coupons
//			Scanner sc = new Scanner(System.in);
//			System.out.print("enter customer id: ");
//			int id = Integer.parseInt(sc.nextLine());
//			Customer c = em.find(Customer.class, id);
//			System.out.println(c);
//
//			for (Coupon coupon : c.getCoupons()) {
//				System.out.println(coupon);
//			}
//			sc.close();
//		}

		{// delete customer - check that coupons are not deleted and join table is
			// updated

			Customer c = em.find(Customer.class, 1);
			System.out.println(c);
			em.remove(c);

		}

//		{ // Hibernate is the JPA default implementation
//			Session session = em.unwrap(Session.class);
//			Object id = session.save(new Coupon(0, "stam_coupon"));
//			System.out.println(id);
//		}

		em.getTransaction().commit();
	}

}
