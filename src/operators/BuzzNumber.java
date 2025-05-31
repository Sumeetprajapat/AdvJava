package operators;

import java.util.Scanner;

public class BuzzNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start No: ");
		int p = sc.nextInt();
		System.out.print("Enter End No: ");
		int q = sc.nextInt();

		if (p >= q) {
			System.out.println("Invalid range");
			return;
		}

		for (int i = p; i <= q; i++) {
			if (i % 7 == 0 || i % 10 == 7) {
				System.out.println(i);
			}
		}

	}
}
