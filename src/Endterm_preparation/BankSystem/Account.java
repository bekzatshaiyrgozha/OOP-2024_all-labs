package Endterm_preparation.BankSystem;

public class Account implements Comparable<Account>,Cloneable {
    String login;
    String password;
    double balance;
    public Account(String login, String password, Double balance) {
        this.login = login;
        this.password = password;
        this.balance = balance;
    }
    public String getLogin() {
        return login;

    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "Account login=" + login + ", password=" + password + ", balance=" + balance;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return  false;
        Account login = (Account) o;
        return login.equals(login.login) && password.equals(login.password);
    }

    public int compareTo(Account account) {
        if(this.balance > account.getBalance()) return 1;
        else if(this.balance < account.getBalance()) return -1;
        else return 0;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();

    }
}
