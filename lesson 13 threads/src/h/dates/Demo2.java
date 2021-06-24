package h.dates;

import java.util.Calendar;

public class Demo2 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		cal.set(1958, Calendar.JANUARY, 25);
		System.out.println(cal);
		System.out.println(cal.getTime());

	}

}
