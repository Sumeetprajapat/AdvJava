package oops;

public class Bank {
	private double amount;

	public Bank(double amount) {
		this.amount = amount;
	}

	public void withdraw(double withdrawalAmount) {
		String result = (amount >= withdrawalAmount) ? "Withdraw successful. Amount withdrawn: " + withdrawalAmount
				: "Withdraw failed. Insufficient balance.";

		// Update amount only if sufficient
		amount = (amount >= withdrawalAmount) ? (amount - withdrawalAmount) : amount;

		System.out.println(result);
	}

	public void deposit(double depositAmount) {
		amount += depositAmount;
		System.out.println("Deposit successful. Amount deposited: " + depositAmount);
	}

	public void displayBalance() {
		System.out.println("Total balance: " + amount);
	}

	public static void main(String[] args) {

		double initialAmount = 10000;
		double withdrawalAmount = 5000;
		double depositAmount = 5000;

		Bank myAccount = new Bank(initialAmount);

		myAccount.withdraw(withdrawalAmount);
		myAccount.deposit(depositAmount);
		myAccount.displayBalance();
	}
}
