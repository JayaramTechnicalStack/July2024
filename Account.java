package hierarchical;

public class Account {
	
	private String accountHolderName;
	private String accountNumber;
	protected double balance;
	
	public Account(String accountHolderName, String accountNumber, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance +=amount;
	}
	
	public void withdraw(double amount) {
		if(amount <=balance) {
			balance -= amount;
			System.out.println("amount withdraw" +amount);
		}
	}
	
	public void displayAccountDetails() {
		System.out.println("Account HolderName" +accountHolderName);
		System.out.println("Account Number" +accountNumber);
		System.out.println("Balance " +balance);
	}

}
