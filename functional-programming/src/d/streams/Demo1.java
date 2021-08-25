package d.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		// obtaining a stream:
		Stream<String> stream = list.stream();
		
		// streams have terminal and non terminal operations
		// non terminal - adds processors on the stream
		// terminal - starts the iteration
		
		// apply the terminal operation: forEach - print each element
		stream.forEach(e->System.out.println(e));
	}

}
