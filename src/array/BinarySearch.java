package array;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		System.out.println("Enter search element");
		int se = sc.nextInt();

		int l = 0, h = arr.length - 1, mid, p = -1;
		while (l <= h) {
			mid = (l + h) / 2;
			if (arr[mid] == se) {
				p = mid + 1;
				break;
			} else if (arr[mid] < se) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
		}
		if (p > 1)
			System.out.println("Element found at" + p + " position");
		else {
			System.out.println("Search is unsuccessful");
		}
	}
}
