package a;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
public class Coupon {

	private int id;
	private String title;
	private int amount;
	private double price;
	private String image;
	private LocalDate startDate;
	private LocalDate endDate;

}
