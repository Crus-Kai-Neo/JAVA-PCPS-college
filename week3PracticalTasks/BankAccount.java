package week3PracticalTasks;

public class BankAccount {

    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void transferBalance(BankAccount toAccount, double amount) {

        if (amount > this.balance) {
            System.out.println("Insufficient balance");
        }
        else if (amount < 0) {
            System.out.println("Amount cannot be negative");
        }
        else {
            this.balance -= amount;
            toAccount.balance += amount;
            System.out.println("Transfer successful");
        }
    }
}
