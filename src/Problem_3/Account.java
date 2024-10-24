
package Problem_3;public class Account {
    private double balance;
    private int accNumber;

    public Account(int accNumber) {
        this.accNumber = accNumber;
        this.balance = 0;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            balance += sum;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double sum) {
        if (sum > 0 && sum <= balance) {
            balance -= sum;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public void transfer(double amount, Account other) {
        if (amount > 0 && amount <= balance) {
            withdraw(amount);
            other.deposit(amount);
        } else {
            System.out.println("Invalid transfer amount.");
        }
    }

    public String toString() {
        return "Account Number: " + accNumber + ", Balance: $" + balance;
    }

    public final void print() {
        System.out.println(toString());
    }
}

