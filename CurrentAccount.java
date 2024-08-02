package hierarchical;

public class CurrentAccount extends Account {

	
	double overdraftLimit;
	public CurrentAccount(String accountHolderName, String accountNumber, double balance, double overdraftLimit) {
		super(accountHolderName, accountNumber, balance);
		
	}
	public void withdraw(double amount) {
		if(amount < balance +overdraftLimit) {
			balance -= amount;
			System.out.println(amount +"withdrawn. new balance" +balance);
		}else {
			
			System.out.println("Overdraft limit is exceeded");
		}
	}
	
	

}
