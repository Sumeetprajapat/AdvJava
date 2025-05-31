package operators;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem;
		int sum = 0;

		int square = num * num;
		System.out.println("Square: " + square);

		while (square > 0) {
			rem = square % 10;
			sum = sum + rem;
			square = square / 10;
		}
		if (num == sum) {
			System.out.println("Neon Number");
		} else {
			System.out.println("Not");
		}

	}
}
