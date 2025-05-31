package operators;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No: ");
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < num - 2; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}
}
