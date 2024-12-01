package learnJava;

public class WithdrawStrategy implements TransactionStrategy {

	@Override
	public void executeTransaction(Account account, double amount) {
		account.withdraw(amount);
	}
}
