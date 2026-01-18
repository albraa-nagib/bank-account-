package lab1;

public class BankAccount {
    private String accountHolder;
    private double balance;
    private String accountNumber;
    protected String accountStatus = "Active";

    public BankAccount(String accountHolder, String accountNumber, double initialDeposit) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 1000) {
            System.out.println("Error: Max withdrawal limit is $1000.");
            return;
        }

        if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
            
            if (balance < 0) {
                balance -= 10.0;
                System.out.println("Overdraft fee $10 applied. Balance: $" + balance);
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void freezeAccount() {
        this.accountStatus = "Frozen";
        System.out.println("Account Status: Frozen");
    }

    public double getBalance() {
        return balance;
    }

    public void printAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
        System.out.println("Status: " + accountStatus);
        System.out.println("------------------------------------");
    }
}