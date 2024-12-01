package learnJava;

public class Main {

	public static void main(String[] args) {
		Account account = new Account("Joao", 1000.00);
		
		BankTransactionContext context = new BankTransactionContext(new DepositStrategy());
		context.executeTransaction(account, 500.00);
		System.out.println("saldo final "+ account.getBalance());
		
		context.setTransactionStrategy(new WithdrawStrategy());
		context.executeTransaction(account, 200.00);
		
		
		System.out.println("saldo final "+ account.getBalance());
	}

}
