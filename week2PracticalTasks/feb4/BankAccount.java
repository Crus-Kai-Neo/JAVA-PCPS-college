package week2PracticalTasks.feb4;

public class BankAccount {
    private int accountNo;
    private double balance;

    BankAccount(int accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }
    public int getAccountNo(){
        return accountNo;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if (amount < 0){
            System.out.println("Amount can not be negative");
        }
        else{
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if(amount >= balance){
            System.out.println("Insufficient funds");
        }
        else if (amount < 0){
            System.out.println("Amount can not be negative! ");
        }
        else{
            balance -= amount;
        }
    }
    public void displayBalance(){
        System.out.println(balance);
    }
}

class ExampleBankAccount{
    public static void main(String[] args){
        BankAccount b1 = new BankAccount(101,500.0);
//        b1.deposit(2000);
//        b1.withdraw(1000);
//        b1.displayBalance();

        System.out.println(b1.getAccountNo());
        System.out.println(b1.getBalance());

        b1.deposit(200.0);
        b1.getBalance();
        b1.displayBalance();

        b1.withdraw(300.0);
        b1.getBalance();
        b1.displayBalance();

        b1.withdraw(500);
        b1.getBalance();
        b1.displayBalance();
    }
}