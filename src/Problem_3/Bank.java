package Problem_3;
import java.util.Vector;

public class Bank {
    private Vector<Account> accounts = new Vector<>();

    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Account opened: " + account.toString());
    }

    public void closeAccount(int accNumber) {
        Account toRemove = null;
        for (Account account : accounts) {
            if (account.getAccountNumber() == accNumber) {
                toRemove = account;
                break;
            }
        }
        if (toRemove != null) {
            accounts.remove(toRemove);
            System.out.println("Account closed: " + toRemove.toString());
        } else {
            System.out.println("Account not found.");
        }
    }

    public void updateAccounts() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            } else if (account instanceof CheckingAccount) {
            }
            account.print();
        }
    }
}

