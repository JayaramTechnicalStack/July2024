public class TestBank {
    public static void main(String[] args) {

        BankATM atm = new BankATM(1000);

        atm.welcomeMessage();

        atm.deposit(500);
        atm.checkBalance(); // 1500

        atm.withdraw(1800);
        atm.checkBalance(); // 1400

        atm.withdraw(1000);
 	atm.checkBalance(); // 400

    }
}
 