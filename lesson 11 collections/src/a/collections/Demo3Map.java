package a.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Demo3Map {

	public static void main(String[] args) {
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("table", "furniture");
		dictionary.put("dog", "animal");
		dictionary.put("cat", "animal");
		dictionary.put("Java", "a programming language");

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("enter a word: ");
			String word = sc.nextLine();
			if (dictionary.containsKey(word)) {
				System.out.println(dictionary.get(word));
			} else {
				System.out.println("sory. this word not found!");
			}
		}

		Set<String> keys = dictionary.keySet();
		Collection<String> values = dictionary.values();

		System.out.println("keys");
		System.out.println(keys);
		System.out.println("values");
		System.out.println(values);

	}

}
