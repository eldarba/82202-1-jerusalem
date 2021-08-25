package a;

import java.util.Comparator;

public class NameLengthComparator implements Comparator<String> {

	@Override
	public int compare(String name1, String name2) {
		return name1.length() - name2.length();
	}

}
