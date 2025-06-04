package collections;

import java.util.ArrayList;

public class EvenNumberArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> en = new ArrayList<>();
		en.add(1);
		en.add(2);
		en.add(3);
		en.add(4);
		en.add(5);
		en.add(6);
		en.add(8);
		en.add(10);

		System.out.println("Even No: ");
		int sum = 0;
		for (int num : en) {
			if (num % 2 == 0) {
				sum = sum + num;
				System.out.println(num);
			}
		}
		System.out.println("Sum of Even:" + sum);

	}

}
