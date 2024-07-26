abstract class ATM {
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void checkBalance();

    public void welcomeMessage() {
        System.out.println("Welcome to the ATM machine!");
    }
}
