package app.core.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString.Exclude;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NonNull
	private String name;
	@NonNull
	private String city;
	@NonNull
	private String street;
	@Exclude
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
	private List<Order> orders;

	public void setOrders(List<Order> orders) {
		for (Order order : orders) {
			order.setCustomer(this);
		}
		this.orders = orders;
	}

	public void addOrder(Order order) {
		if (this.orders == null) {
			this.orders = new ArrayList<>();
		}
		order.setCustomer(this);
		this.orders.add(order);
	}

}
