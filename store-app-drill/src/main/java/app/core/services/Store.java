package app.core.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.Customer;
import app.core.entities.Order;
import app.core.repositories.CustomerRepo;
import app.core.repositories.OrderRepo;

@Service
@Transactional
public class Store {

	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private OrderRepo orderRepo;

	public int addCustomer(Customer customer) {
		return this.customerRepo.save(customer).getId();
	}

	/** returns the specified customer or null if not exists */
	public Customer getCustomer(int customerId) {
		Optional<Customer> opt = this.customerRepo.findById(customerId);
//		return opt.isPresent()?opt.get():null;
		return opt.orElse(null);
	}

	public List<Order> getCustomerOrders(int customerId) {
		return this.orderRepo.findByCustomerId(customerId);
	}

	public List<Customer> getAllCustomers() {
		return this.customerRepo.findAll();
	}

	public List<Customer> getAllCustomers(String city) {
		return this.customerRepo.findByCity(city);
	}

	public List<Order> getAllOrders() {
		return this.orderRepo.findAll();
	}

	public List<Order> getAllOverdueOrders() {
		return this.orderRepo.findByDeliverBefore(LocalDate.now());
	}

	public List<Order> getAllDueIn(int days) {
		return this.orderRepo.findByDeliver(LocalDate.now().plusDays(days));
	}

}
