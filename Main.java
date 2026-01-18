package lab1;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Elisha Benson", "12345", 500.0);
        account1.printAccountDetails();

        
        System.out.println("Starting automated deposits...");
        while (account1.getBalance() < 1000) {
            account1.deposit(50.0);
        }
        System.out.println("Target reached. Current Balance: $" + account1.getBalance());

        
        System.out.println("\nStarting automated withdrawals...");
        do {
            account1.withdraw(100.0);
        } while (account1.getBalance() >= 500);

        
        System.out.println("\nFinal Account Summary:");
        account1.freezeAccount();
        account1.printAccountDetails();
    }
}