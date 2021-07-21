package app.core.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Customer;
import app.core.entities.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {
	List<Order> findByCustomerId(int customerId);
}
