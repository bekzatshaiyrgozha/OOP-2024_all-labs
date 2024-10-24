
package lab_2.Problem_3;public class CheckingAccount extends Account {
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 0.02;
    private int transactionCount;

    public CheckingAccount(int accNumber) {
        super(accNumber);
        this.transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
        if (transactionCount > FREE_TRANSACTIONS) {
            super.withdraw(TRANSACTION_FEE);
        }
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
        if (transactionCount > FREE_TRANSACTIONS) {
            super.withdraw(TRANSACTION_FEE);
        }
    }


    @Override
    public String toString() {
        return "Checking Account: " + getAccountNumber() + ", Balance: $" + getBalance() + ", Transactions: " + transactionCount;
    }
}
