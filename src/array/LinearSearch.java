package array;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array Elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter search element: ");
		int search = sc.nextInt();
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				System.out.println("Is present at position: " + (i + 1));
				temp += 1;
				break;
			}
		}
		if (temp == 0) {
			System.out.println("Not in the List");
		}
	}
}
