package operators;

class BankAccount {
private double balance;
public BankAccount(double initialBalance) {
balance = initialBalance;
}
public double getBalance() {
return balance;

}
public void setBalance(double newBalance) {
    balance = newBalance;
}
}
public class Main1 {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000.0);
		System.out.println("Current balance: " + account.getBalance());
		account.setBalance(1500.0);
		System.out.println("Updated balance: " + account.getBalance());
		}
}
