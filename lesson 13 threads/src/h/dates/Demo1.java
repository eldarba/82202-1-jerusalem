package h.dates;

import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);

		long ts = System.currentTimeMillis();
		System.out.println(ts);
		Date d2 = new Date(ts);
		System.out.println(d2);

	}

}
