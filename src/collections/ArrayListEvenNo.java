package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEvenNo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> evenNumbers = new ArrayList<>();
		ArrayList<Integer> oddNumbers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			al.add(num);
			if (num % 2 == 0) {
				evenNumbers.add(num);
			} else {
				oddNumbers.add(num);
			}
		}
		System.out.println("\nEven numbers:");
		System.out.println(evenNumbers);

		System.out.println("\nOdd numbers:");
		System.out.println(oddNumbers);

		sc.close();

	}
}
