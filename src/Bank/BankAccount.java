package Bank;

import Exeptions.InsufficientBalanceException;

public class BankAccount {
    private double balance;

    public BankAccount(double amount) {
        this.balance = amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > this.balance) {
            throw new InsufficientBalanceException();
        }

        this.balance = balance - amount;
        double newBalance = this.balance;
        System.out.printf("Remaining Balance: %f\n", newBalance);
    }
}
