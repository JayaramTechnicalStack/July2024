class BankATM extends ATM {

    private double balance; 
    public BankATM(double initialBalance) {
        this.balance = initialBalance;
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs" + amount); 
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // 1400
            System.out.println("Withdrawn: Rs" + amount); 
        } else if (amount > balance) {
            System.out.println("Insufficient funds. your holding balance is : " +balance + "but you are trying to withdraw " +amount);
        } else {
            System.out.println("Invalid withdraw amount");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current balance: Rs" + balance); 
    }
}
