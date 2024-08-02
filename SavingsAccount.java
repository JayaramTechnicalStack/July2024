package hierarchical;

public class SavingsAccount extends Account{
	
	double interestRate;

	public SavingsAccount(String accountHolderName, String accountNumber, double balance, double interestRate) {
		super(accountHolderName, accountNumber, balance);
		this.interestRate = interestRate;
		
	}
	
	public void addInterest() {
		double interest = balance * interestRate / 100;
		deposit(interest);
		System.out.println("interest added to account:"+interest);
	}

}
