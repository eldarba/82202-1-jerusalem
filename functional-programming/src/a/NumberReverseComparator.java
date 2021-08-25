package a;

import java.util.Comparator;

public class NumberReverseComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		return b - a;
	}

}
