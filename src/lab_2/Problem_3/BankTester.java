package lab_2.Problem_3;
public class BankTester {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Open accounts
        SavingsAccount savAcc = new SavingsAccount(1001, 5);  // 5% interest rate
        CheckingAccount chkAcc = new CheckingAccount(1002);

        bank.openAccount(savAcc);
        bank.openAccount(chkAcc);

        //add money
        savAcc.deposit(1000);
        chkAcc.deposit(500);
        chkAcc.withdraw(100);

        // Update accounts
        bank.updateAccounts();

        // Transfer money
        savAcc.transfer(100, chkAcc);

        // Update account
        bank.updateAccounts();

        // Close an account
        bank.closeAccount(1001);
        bank.updateAccounts();

        CheckingAccount chkAcc2 = new CheckingAccount(1003);
        chkAcc2.deposit(500);


        SavingsAccount savAcc2 = new SavingsAccount(1004, 5);  // Пайызы 5%
        savAcc2.deposit(100);


        System.out.println(chkAcc2);
        System.out.println(savAcc2);

        chkAcc2.transfer(200, savAcc2);

        System.out.println(chkAcc2);
        System.out.println(savAcc2);
    }
}

