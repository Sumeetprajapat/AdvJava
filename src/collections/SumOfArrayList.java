package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();

		// input
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter No: " + (i + 1));
			int number = sc.nextInt();
			numbers.add(number);
		}
		// sum
		int sum = 0;
		for (int num : numbers) {
			sum = sum + num;
		}
		System.out.println(sum);
	}
}
