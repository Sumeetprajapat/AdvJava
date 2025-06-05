package collections;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSet {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("apple");
		set1.add("cherry");
		set1.add("banana");

		Set<String> set2 = new HashSet<>();
		set2.add("cherry");
		set2.add("date");
		set2.add("fig");

		Set<String> set3 = new HashSet<>();
		set3.add("red");
		set3.add("blue");
		set3.add("green");

		Set<String> unionSet = new HashSet<>(set1);
		unionSet.addAll(set2);
		boolean isValidate = unionSet.containsAll(set1);

		System.out.println("Set1: " + set1);
		System.out.println("Set2: " + set2);
		System.out.println("Union: " + unionSet);
		if (isValidate) {
			System.out.println("unionSet is a subset of set1");
		} else {
			System.out.println("unionSet is not a subset of set1");
		}
	}
}
