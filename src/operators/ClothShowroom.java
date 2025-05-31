package operators;

import java.util.Scanner;

public class ClothShowroom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount of Shopping you done: ");
		double amount = sc.nextDouble();
		double discount;
		if (amount <= 2000) {
			discount = (5.0 / 100) * amount;
		} else if (amount > 2000 && amount <= 5000) {
			discount = (10.0 / 100) * amount;
		} else if (amount > 5000 && amount <= 10000) {
			discount = (15.0 / 100) * amount;
		} else {
			discount = (20.0 / 100) * amount;
		}
		System.out.println("Discount: ₹" + discount);
		System.out.println("Amount to Pay: ₹" + (amount - discount));
	}
}
