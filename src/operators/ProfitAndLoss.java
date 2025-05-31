package operators;

import java.util.Scanner;

public class ProfitAndLoss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Cost Price: ");
		double cost = sc.nextDouble();
		System.out.println("Enter Selling Price: ");
		double selling = sc.nextDouble();

		if (selling > cost) {
			double profitrupee = selling - cost;
			System.out.println("Profit Rupee: " + profitrupee);
			double profitpercent = (profitrupee / cost) * 100;
			System.out.println("Profit Percentage: " + profitpercent + " %");
		} else if (cost > selling) {
			double lossrupee = cost - selling;
			System.out.println("Loss Rupee: " + lossrupee);
			double losspercent = (lossrupee / cost) * 100;
			System.out.println("Loss Percentage: " + losspercent + " %");
		}
	}
}
