package app.core.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Customer;
import app.core.entities.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {

	List<Order> findByCustomerId(int customerId);

	List<Order> findByDeliverBefore(LocalDate date);

	List<Order> findByDeliver(LocalDate date);
}
