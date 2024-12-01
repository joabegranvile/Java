package learnJava;

public class BankTransactionContext {
	private TransactionStrategy transactionStrategy;
	
	public BankTransactionContext(TransactionStrategy transactionStrategy ) {
		this.transactionStrategy = transactionStrategy;
	}
	
	public void setTransactionStrategy(TransactionStrategy transactionStrategy) {
		this.transactionStrategy = transactionStrategy;
	}
	
	public void executeTransaction(Account account, double amount) {
		
		transactionStrategy.executeTransaction(account, amount);
	}

}
