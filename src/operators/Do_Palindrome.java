package operators;

import java.util.Scanner;

public class Do_Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem;
		int rev = 0;
		int temp = num;

		do {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		} while (num > 0);
		if (rev == temp) {
			System.out.println("P");
		} else {
			System.out.println("N");
		}

	}
}
