package Endterm_preparation.BankSystem;

import java.util.Comparator;

public class LoginComparator implements Comparator<Account> {
    public int compare(Account account1,Account account2) {
        return  account1.getLogin().compareTo(account2.getLogin());
    }
}
