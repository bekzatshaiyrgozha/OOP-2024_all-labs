package Problem_3;public class SavingsAccount extends Account {
    private double interestRate; // in percentage

    public SavingsAccount(int accNumber, double interestRate) {
        super(accNumber);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }

    @Override
    public String toString() {
        return "Savings Account: " + getAccountNumber() + ", Balance: $" + getBalance() + ", Interest Rate: " + interestRate + "%";
    }
}
