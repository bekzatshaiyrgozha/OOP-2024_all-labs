package Endterm_preparation.BankSystem;

public class SaveingAccounts extends Account{
    private double initialBalance;
    public SaveingAccounts(String login,String password,double balance,double initialBalance) {
        super(login,password,balance);
        this.initialBalance = initialBalance;
    }
    public double getInitialBalance() {
        return initialBalance;
    }
    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }
    public void deposit(double amount) {
        double bonus = amount * initialBalance / 100;
        super.deposit(bonus + amount);
    }
}
