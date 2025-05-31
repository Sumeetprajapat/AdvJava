package operators;

import java.util.Scanner;

public class CurrencyConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Indian Amount: ");
		double inr = sc.nextDouble();

		System.out.println("Enter country code: ");
		String code = sc.next();

		double converted;

		switch (code) {
		case "US":
			converted = inr / 83.0;
			System.out.println(converted);
			break;
		case "EUR":
			converted = inr / 89.5;
			System.out.println(converted);
			break;
		case "GBP":
			converted = inr / 103.2;
			System.out.println(converted);
			break;
		}

	}
}
