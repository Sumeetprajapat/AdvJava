package collections;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetInpLab {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no names: ");
		int n = sc.nextInt();
		System.out.println("Enter names: ");
		for (int i = 0; i < n; i++) {
			String names = sc.next();
			hs.add(names);
		}
		System.out.println(hs);
		System.out.println(hs.contains("ANUDIP".toLowerCase()));
	}
}
