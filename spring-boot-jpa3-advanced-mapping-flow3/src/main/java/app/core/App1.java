package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import app.core.entities.Coupon;
import app.core.entities.Review;

@SpringBootApplication
public class App1 {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(App1.class, args);

		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();

		System.out.println("=======================");
		Coupon coupon = new Coupon(0, "clothing");
		coupon.addReview(new Review(0, "very nice"));
		coupon.addReview(new Review(0, "the best ever"));
		coupon.addReview(new Review(0, "very bad"));
		em.persist(coupon);
		System.out.println("=======================");

		em.getTransaction().commit();

	}

}
