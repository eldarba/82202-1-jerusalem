package app.core;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import app.core.beans.Product;
import app.core.controllers.ProductsController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}

	@Bean
	public CommandLineRunner addProducts(ApplicationContext ctx) {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {  

				ProductsController productsController = ctx.getBean(ProductsController.class);

				productsController.add(new Product("Pizza", 25, 150));
				productsController.add(new Product("Shirt", 70, 300));
				productsController.add(new Product("Potatos", 5, 200));

				System.out.println(">>> products added");
			}
		};
	}

}
