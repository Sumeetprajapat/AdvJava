package exception;

import java.util.Scanner;

public class TaxApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee name: ");
		String empName = sc.nextLine(); // Allows empty input
		System.out.print("Is the employee Indian? (true/false): ");
		Boolean isIndian = sc.nextBoolean();
		System.out.print("Enter employee salary: ");
		int empSal = sc.nextInt();

		TaxCalculator calculator = new TaxCalculator();

		try {
			double tax = calculator.calculateTax(empName, isIndian, empSal);
			System.out.println("Tax amount is: " + tax);
		} catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
