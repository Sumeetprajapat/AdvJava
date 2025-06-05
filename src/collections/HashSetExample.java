package collections;

import java.util.HashSet;
import java.util.List;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> str = new HashSet<>();
		str.add("Roshan");
		str.add("Ajay");
		str.add("Pratik");
		str.add("Omkar");
		str.add("Varun");
		str.add("Roshan");
		System.out.println(str);
		System.out.println(str.size());
		System.out.println(str.remove("Ajay"));
		System.out.println(str);
		System.out.println(str.size());
		List<String> toRemove = List.of("Roshan", "Pratik", "Omkar", "Varun");
		str.removeAll(toRemove);
		System.out.println(str.size());

		str.add("banana");
		str.add("apple");
		str.add("date");
		str.add("cherry");
		System.out.println("Updated hashSet: " + str);

	}

}
