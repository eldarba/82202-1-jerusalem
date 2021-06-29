package h.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo3 {

	public static void main(String[] args) {

		// most recommended
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(1985, 1, 25);
		System.out.println(date1);
		System.out.println(date2);

		LocalDateTime dt = LocalDateTime.of(1985, 1, 25, 11, 10, 7);
		System.out.println(dt);

	}

}
