package operators;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long fact = 1;
		int num = sc.nextInt();

		for (int i = 5; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
