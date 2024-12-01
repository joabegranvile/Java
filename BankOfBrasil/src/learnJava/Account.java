package learnJava;

public class Account {
	private String accountHolder;
	private double balance;
	
	public Account(String accountHolder, double initialBalance) {
		this.accountHolder = accountHolder;
		this.balance = initialBalance;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited " + amount);
	}
	
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew " + amount);	
		} else {
			System.out.println("Insufficient funds!");
		}
	}

}
