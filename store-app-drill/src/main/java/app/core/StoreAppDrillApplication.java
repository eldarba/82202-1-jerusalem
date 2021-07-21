package app.core;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Customer;
import app.core.entities.Order;
import app.core.services.Store;

@SpringBootApplication
public class StoreAppDrillApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(StoreAppDrillApplication.class, args);
		Store store = ctx.getBean(Store.class);

//		{ // add customer
//			Order order1 = new Order("food", LocalDate.of(2021, 7, 21));
//			Order order2 = new Order("books", LocalDate.of(2021, 7, 21));
//			Order order3 = new Order("clothes", LocalDate.of(2021, 7, 21));
//			List<Order> orders = Arrays.asList(order1, order2, order3);
//			Customer customer = new Customer("Ramo", "Haifa", "HaGefen");
//			customer.setOrders(orders);
//			store.addCustomer(customer);
//		}

		{ // get customer
			Customer c = store.getCustomer(1);
			System.out.println(c);
			System.out.println(store.getCustomerOrders(c.getId()));

		}

	}

}
