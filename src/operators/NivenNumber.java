package operators;

import java.util.Scanner;

public class NivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem;
		int sum = 0;
		int temp = num;

		while (temp > 0) {
			rem = temp % 10;
			sum = sum + rem;
			temp = temp / 10;
		}
		if (num % sum == 0) {
			System.out.println("Niven Number");
		} else {
			System.out.println("Not");
		}
	}
}