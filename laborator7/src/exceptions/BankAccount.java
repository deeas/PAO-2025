package exceptions;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficentBalanceException("Insufficient balance for withdrawal");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance = 500;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.deposit(-50);
        System.out.println("Balance: " + account.getBalance());
        /*account.withdraw(100);
        account.withdraw(600);*/

    }
}
