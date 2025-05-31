package operators;

import java.util.Scanner;

public class ELectricBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Unit you consumed this month: ");
		double unit = sc.nextDouble();
		double amount;
		if (unit > 0 && unit <= 100) {
			amount = (unit * 2) + 200;
			System.out.println(amount);
		} else if (unit > 100 && unit <= 200) {
			amount = 100 * 2 + (unit - 100) * 1.8;
			amount = amount + 200;
			System.out.println(amount);
		} else {
			amount = 100 * 2 + 100 * 1.8 + (unit - 200) * 1.5;
			amount = amount + 200;
			System.out.println(amount);
		}

	}
}
