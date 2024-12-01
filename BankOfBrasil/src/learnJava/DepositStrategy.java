package learnJava;

public class DepositStrategy implements TransactionStrategy {
	
	@Override
	public void executeTransaction(Account account, double amount) {
		account.deposit(amount);
	}
}
