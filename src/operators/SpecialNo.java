package operators;

import java.util.Scanner;

public class SpecialNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int copy = num;
		int sum = 0;
		int rem;
		while (num > 0) {
			int fact = 1;
			rem = num % 10;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			num = num / 10;// move to next digit .. 5..4...1...0/-
		}
		if (sum == copy) {
			System.out.println("Special");
		} else {
			System.out.println("Not");
		}
	}
}
