package hierarchical;

public class BankApp {

	public static void main(String[] args) {
		
		SavingsAccount savings = new SavingsAccount("Ajay", "A123", 1000,5); 
		CurrentAccount current = new CurrentAccount("Vijay", "V567", 500,500);
		
		System.out.println("Savings account info");
		savings.displayAccountDetails();
		savings.deposit(500);
		savings.addInterest();
		savings.withdraw(200); 
		
		
		System.out.println("Current account info");
		
		current.displayAccountDetails();
		current.deposit(1000);
		current.withdraw(2500);
		current.withdraw(100);
	
	}

}
