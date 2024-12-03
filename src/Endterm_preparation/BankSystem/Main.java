package Endterm_preparation.BankSystem;

public class Main {
    public static void main(String[] args) {
        BankAction deposit = new Deposit();
        BankAction withDraw = new WithDraw();

        deposit.execute();
        withDraw.execute();

    }
}
