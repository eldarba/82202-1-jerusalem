package b.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("aaa");
		list.add("bbbbbbbbbbbbbbbbb");
		list.add("ccc");
		list.add("ccccccccccc");

		// get an iterator from the list;
		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String currElement = it.next();
			System.out.println(currElement);
			if (currElement.length() > 3) {
				it.remove();
			}
		}

		System.out.println(list);

	}

}
