package d.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");

		// obtain a stream
		Stream<String> stream = list.stream();
		// add listener to the stream (non terminal)
		stream = stream.map(e -> e.toUpperCase()); 
		// apply a terminal operation to start the stream
		stream.forEach(e -> System.out.println(e));

		// the list remains unchanged
		System.out.println(list);
	}

}
