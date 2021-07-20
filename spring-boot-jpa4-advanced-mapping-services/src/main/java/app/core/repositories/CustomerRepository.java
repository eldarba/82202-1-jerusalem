package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Company;
import app.core.entities.Coupon;
import app.core.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
